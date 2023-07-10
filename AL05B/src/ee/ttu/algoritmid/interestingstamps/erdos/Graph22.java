package ee.ttu.algoritmid.interestingstamps.erdos;

import java.util.*;

class Graph22
{
    private int V;                              //number of nodes in the graph
    private LinkedList<Integer> adj[];              //adjacency list
    private Queue<Integer> queue;                   //maintaining a queue
 
    Graph22(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

 
    void addEdge(int v,int w)
    {
        adj[v].add(w);                          //adding an edge to the adjacency list (edges are bidirectional in this example)
    }
 
    void BFS(int n)
    {

        boolean nodes[] = new boolean[V];       //initialize boolean array for holding the data
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);                   //root node is added to the top of the queue
 
        while (queue.size() != 0)
        {
            n = queue.poll();             //remove the top element of the queue
            System.out.print(n+" ");           //print the top element of the queue
 
            for (int i = 0; i < adj[n].size(); i++)  //iterate through the linked list and push all neighbors into queue
            {
                a = adj[n].get(i);
                if (!nodes[a])                    //only insert nodes into queue if they have not been explored already
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
        Graph22 graph = new Graph22(8);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(6, 7);

//        graph1.addEdge("Paul Erdös", "Petja");
//        graph1.addEdge("Paul Erdös", "Vanja");
//        graph1.addEdge("Petja", "Lox");
//        graph1.addEdge("Petja", "Den");
//        graph1.addEdge("Petja", "Ago");
//        graph1.addEdge("Vanja", "Ago");
//        graph1.addEdge("Vanja", "Nik");
//        graph1.addEdge("Nik", "Ja");
 
        System.out.println("The Breadth First Traversal of the graph is as follows :");
 
        graph.BFS(0);
    }
}