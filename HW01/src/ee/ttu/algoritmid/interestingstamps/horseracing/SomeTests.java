package ee.ttu.algoritmid.interestingstamps.horseracing;

import java.util.ArrayList;
import java.util.List;


public class SomeTests {
    private static AVLTree avlTree = new AVLTree();


    public static void main(String[] args) {
        testHorseTreeEndToEndPublic("case 9B");
        testJockeyTreeEndToEndPublic("case 9D");
//        testRandomlyPreGeneratedEndToEnd1("caseFUCK");
    }

    private static void testHorseTreeEndToEndPublic(String caseId) {

        List<RacingParticipant> requests = new ArrayList<>();
        List<Double> responds = new ArrayList<>();

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 150));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 130));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 135));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 149));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 200));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 170));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 160));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 133));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 125));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 190));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 140));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 195));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 148));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 210));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 138));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 205));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 165));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 163));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 168));
        responds.add(null);


        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 158));
        responds.add(148.0);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 143.02));
        responds.add(133.0);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 169.9));
        responds.add(160.0);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 150));
        responds.add(140.0);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 161));
        responds.add(150.0);


        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 169));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 139));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 180));
        responds.add(null);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 134));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 143));
        responds.add(134.0);
        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 174));
        responds.add(163.0);


        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 141));
        responds.add(130.0);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 186));
        responds.add(180.0);


        testTreeEndToEnd(caseId, requests, responds);
    }

    private static void testJockeyTreeEndToEndPublic(String caseId) {
        List<RacingParticipant> requests = new ArrayList<>();
        List<Double> responds = new ArrayList<>();

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 110));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 90));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 95));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 109));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 160));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 130));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 120));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 93));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 85));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 150));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 100));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 155));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 108));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 170));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 98));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 165));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 125));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 123));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 128));
        responds.add(null);


        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 104));
        responds.add(110.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 98.01));
        responds.add(108.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 121));
        responds.add(130.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 100.000986));
        responds.add(109.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 117.98));
        responds.add(128.0);


        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 129));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 99));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 140));
        responds.add(null);

        requests.add(new ParticipantTemp("F", RacingParticipant.Kind.JOCKEY, 94));
        responds.add(null);


        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 120));
        responds.add(129.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 89.96));
        responds.add(100.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 88.7));
        responds.add(99.0);

        requests.add(new ParticipantTemp("M", RacingParticipant.Kind.HORSE, 137));
        responds.add(150.0);


        testTreeEndToEnd(caseId, requests, responds);
    }

    private static void testRandomlyPreGeneratedEndToEnd1(String caseId) {
        List<RacingParticipant> requests = new ArrayList<>();
        List<Double> responds = new ArrayList<>();

        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 865.3265656698028));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1048.2186933146068));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 898.3917310154603));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1119.7398590610262));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1041.504874526653));
        responds.add(1048.2186933146068);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1013.7843141593014));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1187.9589663303746));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 890.892518400431));
        responds.add(898.3917310154603);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1027.5462633338404));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1110.5790066759043));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1016.119868139736));
        responds.add(1027.5462633338404);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 881.9365924962357));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1085.1744764689638));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 795.9503003142314));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 948.5155083454473));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1054.8173148074884));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1010.2319439926248));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1033.8746024698678));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 947.5627814735101));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1153.8937501926853));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 980.0500886819159));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 972.7121963452313));
        responds.add(980.0500886819159);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 985.9340365677125));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1008.494962539035));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 951.3935447764966));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 965.5925667763087));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1021.493289118303));
        responds.add(1033.8746024698678);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 902.3848939516444));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 948.4079807266393));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 845.1837804410637));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1126.4621203189809));
        responds.add(1119.7398590610262);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1087.9632925599935));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 908.9946462373246));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 918.4298217195729));
        responds.add(908.9946462373246);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 885.0112312557986));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 842.9191946464463));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1096.341446359739));
        responds.add(1110.5790066759043);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 938.7802363041675));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 913.1073428070094));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1051.684137402229));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 954.4293587232639));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1170.1753155386552));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1079.636865815522));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1028.7363029569383));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1040.834390686273));
        responds.add(1051.684137402229);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 986.4194319127275));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 838.6159002250714));
        responds.add(845.1837804410637);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1066.337779300686));
        responds.add(1054.8173148074884);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1054.1073118586153));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1112.8459987755218));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1207.0115223280632));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1015.628263058439));
        responds.add(1010.2319439926248);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 975.183512431395));
        responds.add(965.5925667763087);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 916.0197446105369));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1048.5634303933737));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 836.4424810348378));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 891.8010644193255));
        responds.add(885.0112312557986);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1059.1752173708353));
        responds.add(1048.5634303933737);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1045.4664669334886));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 915.3981479115836));
        responds.add(902.3848939516444);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1029.1743149103968));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1105.9969492444563));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 955.6784353269499));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 994.6595310184612));
        responds.add(1008.494962539035);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1084.6900595609916));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1053.228672938849));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 912.7032612325268));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 932.4740206868552));
        responds.add(938.7802363041675);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1023.8571466507746));
        responds.add(1029.1743149103968);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 965.0007641237121));
        responds.add(954.4293587232639);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 881.9236172770907));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 935.5324986339888));
        responds.add(947.5627814735101);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1119.8237909895938));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1044.3358448607141));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1083.3543200397883));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1026.3242936592978));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1098.319782626434));
        responds.add(1105.9969492444563);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 922.9047780982213));
        responds.add(913.1073428070094);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 905.8288592218668));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1068.75089965052));
        responds.add(1079.636865815522);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1005.404239315008));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 926.2435866621212));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 837.8436905371215));
        responds.add(842.9191946464463);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 973.5983227302439));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 829.1862442922786));
        responds.add(836.4424810348378);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 953.8177689645719));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 991.1483455069163));
        responds.add(985.9340365677125);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 934.653495049189));
        responds.add(948.4079807266393);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 808.7132771224128));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1011.0124573542106));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1191.0198826604114));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 757.8134133012633));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1007.3041516454997));
        responds.add(1013.7843141593014);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1023.8673264355269));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 958.8835359319847));
        responds.add(951.3935447764966);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1073.541563029865));
        responds.add(1083.3543200397883);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1101.2663709392475));
        responds.add(1112.8459987755218);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1048.2858467173648));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1057.459035942644));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1070.7354817612786));
        responds.add(1057.459035942644);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1093.1927434062402));
        responds.add(1084.6900595609916);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1128.7568742699332));
        responds.add(1119.8237909895938);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 883.6988812179976));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 905.7663597857235));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 973.7823641766294));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 883.4514523291061));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 928.4021729881975));
        responds.add(916.0197446105369);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1001.7720515159488));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1035.379677826817));
        responds.add(1023.8673264355269);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 956.3794292982601));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1059.2470659587473));
        responds.add(1045.4664669334886);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1008.2544272366653));
        responds.add(1001.7720515159488);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 990.6608227596878));
        responds.add(1005.404239315008);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1023.5744673363766));
        responds.add(1011.0124573542106);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1133.015057897305));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 966.6491481156688));
        responds.add(973.7823641766294);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1108.9748796517174));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1118.9346692173435));
        responds.add(1133.015057897305);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 983.9082331564443));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1066.4054771336546));
        responds.add(1054.1073118586153);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 919.0155275037216));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1096.229251491776));
        responds.add(1108.9748796517174);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 909.8825445208356));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1088.9778894167569));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 995.6786406821903));
        responds.add(983.9082331564443);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 850.4560007505571));
        responds.add(865.3265656698028);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 961.2399109267959));
        responds.add(973.5983227302439);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 935.8497975025516));
        responds.add(948.5155083454473);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 869.3952113984594));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1020.7860607990187));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1004.2929159036696));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 994.1833838618635));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 995.8220388727336));
        responds.add(1004.2929159036696);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1084.6721308468232));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 900.6379345950683));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 881.8053936002646));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1033.9126620240222));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1083.1848508008588));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1160.0138059398628));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 974.0166896112107));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 952.507873747681));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1028.4279797135937));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1063.146738052759));
        responds.add(1053.228672938849);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1022.7375506852181));
        responds.add(1033.9126620240222);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 909.0455179025917));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 880.4010077163254));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1075.926325248251));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 913.0615589228363));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 994.303345478124));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1076.479323056268));
        responds.add(1085.1744764689638);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 956.5658058047132));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1092.0107735473225));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1105.8748042721522));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1017.5669394372168));
        responds.add(1028.4279797135937);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1023.7191570979501));
        responds.add(1028.7363029569383);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1202.0262371805513));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 786.2099873976415));
        responds.add(795.9503003142314);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1145.9094070511035));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 922.2841648262641));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 991.472000642824));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 912.680158901924));
        responds.add(919.0155275037216);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 867.1896921225879));
        responds.add(880.4010077163254);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 983.9314474880713));
        responds.add(994.1833838618635);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1003.1844511517046));
        responds.add(994.303345478124);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1064.8130871303501));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1004.2133071823486));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1145.16139446204));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1174.2322736186316));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1090.4346173596712));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 837.8360284728599));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1105.751706095754));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 983.6261973486779));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 801.9066155382525));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 843.2260079250233));
        responds.add(837.8360284728599);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1073.4119478428627));
        responds.add(1083.1848508008588);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 925.5960295119761));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1105.8824414704782));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 949.244162821455));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1121.7504777544916));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 993.1812241407707));
        responds.add(983.6261973486779);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1046.6963849328524));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1101.9562791440876));
        responds.add(1090.4346173596712);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 957.4482823851789));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 937.9623914616292));
        responds.add(926.2435866621212);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1108.714043070611));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1188.6961935441348));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 970.7738701455273));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 905.7346187261462));
        responds.add(913.0615589228363);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 940.1181948559562));
        responds.add(949.244162821455);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 922.5180093909914));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1138.2001806546907));
        responds.add(1145.9094070511035);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 984.8362441698057));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 869.184352437919));
        responds.add(881.9365924962357);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 962.940885022687));
        responds.add(974.0166896112107);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1099.4590379463984));
        responds.add(1105.8824414704782);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 968.7028352375161));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 877.6301035604693));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1182.4320294339702));
        responds.add(1188.6961935441348);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 993.3169876402022));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 966.2177012486462));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1014.5220795285269));
        responds.add(1026.3242936592978);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1174.171688376171));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 926.822546996183));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 941.3037639739539));
        responds.add(926.822546996183);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1084.7717486904064));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1073.2239297573476));
        responds.add(1084.6721308468232);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1057.2189317006912));
        responds.add(1046.6963849328524);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 970.1734872185948));
        responds.add(956.5658058047132);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1069.2137323522807));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 816.0125090113605));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 952.9412503671266));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 978.611106362965));
        responds.add(968.7028352375161);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1037.7939049406516));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1020.6721665514106));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1032.4720450593704));
        responds.add(1044.3358448607141);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1139.228174631233));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1131.4587841735254));
        responds.add(1121.7504777544916);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1096.0300297827569));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1014.4849251587881));
        responds.add(1004.2133071823486);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 983.6177379177155));
        responds.add(970.7738701455273);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 888.667800216809));
        responds.add(881.8053936002646);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1159.7426277733061));
        responds.add(1170.1753155386552);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 886.6201264183118));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1032.3764086653791));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 950.2719740513329));
        responds.add(957.4482823851789);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1028.4989688844614));
        responds.add(1037.7939049406516);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 895.887037312706));
        responds.add(905.8288592218668);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 972.777042739509));
        responds.add(966.2177012486462);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 952.4433738347077));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 900.664991877026));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1047.4263911868445));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 881.348355126469));
        responds.add(886.6201264183118);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1074.42763799861));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 931.2954970390889));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1124.1755685087999));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 944.3298171074432));
        responds.add(952.507873747681);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1028.7704111404755));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 804.2182251466965));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 980.1645295681574));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 883.6848827371418));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1016.4965727512856));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1108.396539279294));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 967.7196376064568));
        responds.add(955.6784353269499);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1156.7264758950969));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1106.9120125571862));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 938.5125971799803));
        responds.add(931.2954970390889);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 973.0830259870003));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1080.418730033684));
        responds.add(1088.9778894167569);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1036.311169814815));
        responds.add(1047.4263911868445);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1112.2716265306583));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 940.3337117702142));
        responds.add(925.5960295119761);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 959.2768332195591));
        responds.add(952.4433738347077);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1038.2252938829704));
        responds.add(1048.2858467173648);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 996.5994278937737));
        responds.add(984.8362441698057);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 892.1314331470447));
        responds.add(900.664991877026);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 971.9378653780002));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 962.4138359102511));
        responds.add(971.9378653780002);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1013.5890258931166));
        responds.add(1020.7860607990187);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 956.8733671283));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1033.483827810681));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1242.6448607882264));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 957.2517368721803));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1036.7302906334896));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 907.664206206142));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 920.9146383120349));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 727.7511704612589));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1029.8890776757019));
        responds.add(1016.4965727512856);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 883.6378273819241));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.HORSE, 1106.4899511674678));
        responds.add(null);
        requests.add(new ParticipantTemp("name", RacingParticipant.Kind.JOCKEY, 1039.9225926475226));
        responds.add(1028.7704111404755);
        System.out.println();
        testTreeEndToEnd(caseId, requests, responds);


    }


    private static void testTreeEndToEnd(String caseId, List<RacingParticipant> requests, List<Double> responds) {
        HW01 solution = new HW01();

        for (int i = 0; i < requests.size(); i++) {
            testRequestResponse(caseId, solution, requests.get(i), responds.get(i));
        }
        //solution.btsHorses.inorder();
        System.out.println(solution.btsHorses);
    }


    private static void testRequestResponse(String caseId, HW01 solution, RacingParticipant participant, Double expectedDuoPartnerHeight) {

        RacingDuo duo = solution.registerToRacing(participant);
        ArrayList<RacingParticipant> list = new ArrayList<>();
        if (duo != null) {
            list.add(duo.getJockey());
            list.add(duo.getHorse());
            System.out.println(list);
        }

        if (duo == null) {
            if (expectedDuoPartnerHeight != null) {
                fail("Duo partner wasn't found, but should have: " + expectedDuoPartnerHeight);
            }
        } else {
            if (expectedDuoPartnerHeight == null) {
                fail("Duo partner was found, but shouldn't have: " + expectedDuoPartnerHeight);
            } else {
                RacingParticipant duoPartner = participant.getKind() == RacingParticipant.Kind.HORSE ? duo.getJockey() : duo.getHorse();


                if (duoPartner.getHeight() != expectedDuoPartnerHeight) {
                    System.out.println(solution.btsHorses);
                    //System.out.println(solution.btsHorses);
                    fail("Duo partner of wrong height found: " + duoPartner.getHeight());
                }
            }
        }
    }


    private static void fail(String text) {
        System.err.println("ERROR: " + text);
        throw new RuntimeException(text);
    }

    private static class ParticipantTemp implements RacingParticipant {

        private final String name;
        private final Kind kind;
        private final double height;

        public ParticipantTemp(String name, Kind kind, double height) {
            this.name = name;
            this.kind = kind;
            this.height = height;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Kind getKind() {
            return kind;
        }

        @Override
        public double getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "ParticipantTemp{" +
                    "height=" + height +
                    '}';

        }

    }

}