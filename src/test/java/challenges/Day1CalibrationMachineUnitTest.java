package challenges;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Day1CalibrationMachineUnitTest {
  private static final String LONGER_INPUT = "1abc2\n"
      + "pqr3stu8vwx\n"
      + "a1b2c3d4e5f\n"
      + "treb7uchet";

  Day1CalibrationMachine calibrationMachine = new Day1CalibrationMachine();

  @Test
  public void shouldTakeDigitsFromBeginningAndEnding() {
    String oneLineInput = "pqr3stu8vwx";

    int result = calibrationMachine.getNumber(oneLineInput);

    assertThat(result).isEqualTo(38);
  }

  @Test
  public void shouldTakeDigitsFrom(){
    String oneLineInput = "1abc2";

    int result = calibrationMachine.getNumber(oneLineInput);

    assertThat(result).isEqualTo(12);
  }

  @Test
  public void shouldSumAllLines(){
    int result = calibrationMachine.getSum(LONGER_INPUT);

    assertThat(result).isEqualTo(142);
  }

  @Test
  public void shouldConsiderStringDigits(){
    int result = calibrationMachine.getSum("two1nine");

    assertThat(result).isEqualTo(29);
  }

  @Test
  public void finalTestPart1(){
    String actualInput = "76xkqjzqtwonfour\n"
        + "sixthree8sixjxjqsjgjgp\n"
        + "38bgcczgtninefivefive\n"
        + "sixthree4eight\n"
        + "nhp3zdc\n"
        + "279four\n"
        + "vzxf4tqrljgxmthreejcr\n"
        + "bbm4twoeight8oneone3one\n"
        + "nineninesix6nine\n"
        + "fourseven5seveneightsvtkcjdrfour\n"
        + "3mkmnpsix5ggfive7\n"
        + "twotwoqbv5qrpnfl7seven8\n"
        + "56snzkgsone2cxtpvvh\n"
        + "threenine3\n"
        + "9dd3twocnrfljs58\n"
        + "mqtrqnrgrcxbvpgdsmsqhmxlxx4\n"
        + "nine9mdxzlrbmrxceight94eight\n"
        + "jtqsrmmbonentvmnxbdsseven4\n"
        + "ninefive8fjnjj\n"
        + "nine53\n"
        + "33\n"
        + "ftjhckeightfourvkbd3eight9\n"
        + "rhpnppsfour7\n"
        + "95ht1x\n"
        + "fivezqfcvmgdxb5mfvtnlfkonesix\n"
        + "ninefgxxltpkszdnb89ninefivebdbdhckhb\n"
        + "9vtglcdvkgcgrvm4sevenrhppknqfvhldfgqhpgdqfv\n"
        + "852bfkjmccknlqreight1\n"
        + "fiveone8threethreezsfpzsrbb9fourfive\n"
        + "1one58eightseventhreeqfpxcpv3\n"
        + "11fg1\n"
        + "tbrcgcqj2three9sixeight1five\n"
        + "seven2m6\n"
        + "eightzhqvdrjknb622btfrs41seven\n"
        + "67nine8\n"
        + "3one8ncctmbsixeighttwonegb\n"
        + "7fivefive\n"
        + "m5sqxstbxp9xx\n"
        + "1onejjz7gcddeightnkfqgxbbtl1\n"
        + "3jrjkxvhctzmkmqccrmbrvlcvsjnqjjb\n"
        + "ndjfls337six2three87\n"
        + "bconekhvtkblfour2n5dq2\n"
        + "922twonmxfeight4\n"
        + "7two59xvmzc2two3czdn\n"
        + "ninesrdsq99tskfpfpdqqfive6\n"
        + "tbzgvh4ninesixjzdtxhbpsjlbkr62\n"
        + "5fourthreebdpnqzbeightjpchone\n"
        + "8ktdbjtvfvkseven\n"
        + "3zhjbjqbpff\n"
        + "6hh7twofourcvmpfjp\n"
        + "sqfzkmrponechzzzbhz34one\n"
        + "jkdrxxbrn43qbjllcfbptddb7\n"
        + "jdjbq1lcsz5\n"
        + "fivehlpltzfrzfznxrpnfourmhpkjsjzz971\n"
        + "gjc5qbgrhlj2one9\n"
        + "tdn1676spccqqjc4eight2\n"
        + "one2966lfourldlnxmzqdplzptp\n"
        + "qlkjthree5eightdztseven\n"
        + "512ninexrqpvktwoner\n"
        + "lkgqvlgdqbjhkxp58one7six3\n"
        + "4two1one7zxxtvxtdvpgfrjh56\n"
        + "4qbbmlpmjx5fiveninepkcnqgqgdjsrzkgxjsxnkqnd2\n"
        + "1jjfive7xjfmdfvnz2\n"
        + "fourxbfsdqlmmmnh9\n"
        + "c5\n"
        + "z4s8gdmkbkhbhd18\n"
        + "threevsnkmbrcgdsvdkqeightqstlvvdtlvp4seven\n"
        + "7eighttwo64nlgxcbthpbgnbf\n"
        + "1mvbvrx\n"
        + "drhgqkfrln2\n"
        + "three1sixthreelvjthreeffptnm1\n"
        + "qzlqvjz8ninefive\n"
        + "eight23n1teight2\n"
        + "31twoqqbmz88\n"
        + "68fivesixqzfcfsjjzxfiveeight6\n"
        + "sqpfonezdtpqrfbhzgjmgv7\n"
        + "4mcmtqnonexkdpnrcfkfxhq5one\n"
        + "hhrldnffive7six6onefivezllprrncczseven\n"
        + "5dfxsn7hjgztpeightqnnninekjxlzdv\n"
        + "vtwobjxdfrkrzeightfxtlkct4\n"
        + "seven4fiveksnsix7128\n"
        + "onenfzxhpc7gxthree\n"
        + "jgtwone321fourkjg3\n"
        + "dphnmspctdfour3\n"
        + "four91zmlpbxchmsixpn\n"
        + "9eighteight8pgvrngxszvnlnzlzmbqgs1\n"
        + "fgznzclmcrjhtbdjoneone9\n"
        + "fttdr4five8vmxrlnr\n"
        + "1nspvnsrdddfhjjdcvltjl\n"
        + "7fiveone8nshjlrxgkeight\n"
        + "57eighteightsrgvcnbncv83\n"
        + "5xnine5blgjqdjmtgx3\n"
        + "6rjzh487eight9nndgvj7\n"
        + "2seven2bvqlftkcplffivefour\n"
        + "x8\n"
        + "vdbxxb2six4skntkvfcgdfcp2cnvhr9\n"
        + "7hmqxgvdfgmxhfzfxfour\n"
        + "eight92jckrxshsrbtwophbfvnb\n"
        + "sevenxzjc6\n"
        + "drflhlxphzspnnzdbcfbpcbtddvd8three56\n"
        + "fournjhqnxrkjpvjssl9\n"
        + "81333\n"
        + "five1gmccznfseven8xlzvlrjsbffour1\n"
        + "6dlbklsddnqhtwotwo2\n"
        + "m27six\n"
        + "5mflrcmbbqnztndxtwoonekcsevenone\n"
        + "m24njqdqxrjmn1cjprdzdcntwoldzsgfkpvxbrnrg\n"
        + "ngjrvdd3onezcklpsfoureighteightwoxg\n"
        + "tkrzphtvthreeeightfsxbbdtone762svzt\n"
        + "khqtnrppp81183one\n"
        + "onetplmtp2zbrmbnrzt9sixknkrblt\n"
        + "662\n"
        + "fivekhclmzchthree3\n"
        + "5fhgcfzvss\n"
        + "zhgsq2hfbzjxgxgrxvhdkppbdljk\n"
        + "zqd9stvrrddk\n"
        + "7kthreesix7\n"
        + "46six8eight\n"
        + "hthpnnghjglhhmg8seventwo86seven\n"
        + "5ffr8\n"
        + "fbdxn76twofourlfdxxbgvmd98five\n"
        + "eight4mjjn4ninelgpc5qnxgneight\n"
        + "oneszfjdcxzc2five\n"
        + "4nzjqv3six\n"
        + "qtnfiveeightkjhhkckrpcdnine9\n"
        + "6eightggsddqcjhptp9tmhconelg\n"
        + "eight45eightfour87\n"
        + "25523\n"
        + "two54nine2mnxszzxeightqf\n"
        + "2kbqpv2sgcskg\n"
        + "4three5njdpbnine\n"
        + "9rdmninejbbdgtffiveseven6\n"
        + "tmnoneightdlrtninenines847bhldgkpdm\n"
        + "nine762gkknhhfvrbmck82\n"
        + "three9xdbnxvnvqsvjmnzzdfoursmrspxxrdkgsv\n"
        + "twofour73zjj\n"
        + "4hvdbthree1four\n"
        + "1threeoneone\n"
        + "2576\n"
        + "ztgbfpsznntnpl3six\n"
        + "1ctllvsztwo6\n"
        + "2eightsevenbldhvhctpck69ninefour\n"
        + "nzdrfive4zsbrshcmqm5fkzzfptxntgzffthzhxbffskz\n"
        + "1nineqdmlfourlsfn94\n"
        + "lqvfhgqkbncvzrnptwofourfivefour42jpg\n"
        + "92dtmcpzskzp1\n"
        + "2djkdgsrrtcnklpxfmfrbcjmnddqntn5six\n"
        + "2nzxgtd75one4four2\n"
        + "hbvjjrfd74five1six56\n"
        + "zcnxmgvmhfsevenxxzkxnine1fxxpmkthreejfppctls\n"
        + "2sevenqsrdvchgpfdjfjpld\n"
        + "6njl7fivemkkxlhkmgm1ndlgjbpjt\n"
        + "jneightwofivetwo9eightgjtnrneight\n"
        + "zfvjfive3gfourfiveeight\n"
        + "five71zgxk8chrfzdzjpxxdkqfour\n"
        + "zbx78sevennsninethree7\n"
        + "rrs8one2jtznfcgdsfxcmkznpptlglnmf\n"
        + "nldfdgpd5seven6tjg4fourddhfg\n"
        + "65sevennlckct93\n"
        + "qjhgdqgpcfivevleight63two\n"
        + "4jqrzmthree\n"
        + "5llfourfourlvtvtx8vjksjlnrchrkthree\n"
        + "dcpdbsvsshgklkronefourqnsevenf6eightwohf\n"
        + "6ctlhskqqch\n"
        + "threeseven2mpvsdlx\n"
        + "1hnjrxsrflxjtlzqrzvpjsjjjpz6\n"
        + "nineninervqqmnsevenjtlkfvzpdztwo8three\n"
        + "3bmthsgsix23sevenzvkszfpfq\n"
        + "6sixeightfour1bnhvpsv\n"
        + "3592nine\n"
        + "ttz117ninesix\n"
        + "bgtmckkpq5sevensix\n"
        + "354nine\n"
        + "7spsevens2\n"
        + "512htbtgxkzdvqtqg\n"
        + "fhkbrst1\n"
        + "6cr2xsevenchdvgqqht\n"
        + "cmbcdqkjd1xffkggmthree4chklqone1\n"
        + "gsevenqnfpjzgbv7\n"
        + "four2njkqbfszj\n"
        + "9qblmmzbtwonkzr\n"
        + "sixsixeightgnflxglkttxk2\n"
        + "nine3vcfghmgm\n"
        + "two7lgnmpnz87nqrqgczrt\n"
        + "klvsx15\n"
        + "rrkltqfttf8two2rzzgjbrffxvcbseven3\n"
        + "5sixctgqr31\n"
        + "qkhjklpztmkffql45seven213\n"
        + "pjstvthree4lrmrznbvdseven\n"
        + "sixvnxfltnqv9fpbfbmninesix\n"
        + "pnvthree4threetfjqnvxbxvxb\n"
        + "two1nine\n"
        + "twosix1ninehkqjtkn2\n"
        + "8pchlzgsixonevrzmqgbf\n"
        + "fxrccmfourthreesix9nineseven\n"
        + "seven929two3zgz\n"
        + "4four386nine\n"
        + "six8three75onehpgsnpjbczninevvcszkr\n"
        + "onefive6eight5\n"
        + "foureightfour34\n"
        + "six6mndfhgcjzjreight7sjbv4\n"
        + "9dlmsnlgj2\n"
        + "seventhreelmkn5sixjllfqfourlpznlhv\n"
        + "zfgvmzgv95seven\n"
        + "ppdsbnxxx1four\n"
        + "vvfnvbkvtzfourfour675nine8\n"
        + "2fourthree1\n"
        + "eight4pqdpjdzbmn31\n"
        + "pksvg9bzzdcgktgstwosevenvnvftzblfive4eight\n"
        + "seveneightonethree1three\n"
        + "nine69dkv8oneoneone\n"
        + "72phzthreexqlhvsqfoursixninefive\n"
        + "2ninexqpplhqclpl5\n"
        + "1nineeight\n"
        + "7nineonefour9two3fournine\n"
        + "8mkzqpnnlqljrfive\n"
        + "9nine5foureightthreegdbcrjhnthree5\n"
        + "sixt69\n"
        + "rzfg5\n"
        + "vqdb8bc7mftdt\n"
        + "ngzlhznbtbone38srxvrfrjxsxkglvrpvqgm\n"
        + "9xgrjgq7eighthnbmkbdsdnine4qt\n"
        + "5dfcrkhzbvfourkkkqjfcb77sevensix\n"
        + "loneightfive8seven3\n"
        + "7ncqhjdhzqeightnine\n"
        + "bsngnjfcone8bhd49tzfdb\n"
        + "deightggcb27four41lfrdbctl\n"
        + "3sevenoneninentjdsxmsixlpqgb\n"
        + "threernmpfptnmcmmrmlngppmbtwofour7sevens\n"
        + "eightjxxlm86\n"
        + "twoninefmdtnk6rjkpdqzdzfiveninecrlgjrvctgtrrdkfkm\n"
        + "3threethreeonefive\n"
        + "three8thq\n"
        + "bfccdtfmtvhkhp5fourdcgszjgcseven2\n"
        + "8xcxscl\n"
        + "sixzvdbpqcheight3twothree5lqtcmjdmpq\n"
        + "nbspfour32lddhpsz9\n"
        + "jgleightcdm9twosllxnzqhjq\n"
        + "2three3sevenfour\n"
        + "jrnineone8qltfvgskbs2244\n"
        + "zmbonemblfourkfjmvntjhvkbk69bnsjzdkxc\n"
        + "vxxlcpslfdzbhm91\n"
        + "fjxhtfnqfive3zpctnfive\n"
        + "smxmdtbtfpthree8lkmvlljdcx1six\n"
        + "5bnine3614\n"
        + "8cdfktkdd8\n"
        + "twosix9\n"
        + "4rxgx895drgvoneqxdvvh\n"
        + "threedljsix9cv5jlkvsmgzgbhnkmmfdpqxgzx\n"
        + "twoone7oneqvqoneonefive6\n"
        + "2tvvmplskcgbxdkzh\n"
        + "gfvffive9six83mhgxkgdprxtwo\n"
        + "2threeeightmnmrtzmdtfivesevenrsmkkslsm7\n"
        + "ztv23316three6seven\n"
        + "eightcvjqlfbh6fourvpgdpgz\n"
        + "1fivefive9\n"
        + "brxmhgnnthreethreeoned2\n"
        + "dgrcgr5xgpnxjbd6ninejsqmgmrvmqz\n"
        + "mtl6three\n"
        + "97bjvklbkpzktckfivenvcmftnnrp4\n"
        + "7fivejmf\n"
        + "six54\n"
        + "jktdhlbjbztpp7gjjc46fmkb\n"
        + "64xdrnfxgccrxkdpfxpnninelbmldlmllknine13\n"
        + "9jbpcbsgk\n"
        + "6hqszplnjk\n"
        + "sixseven1721two44\n"
        + "6threenzsjtj5cfqvdpcpfbcnfpnp9\n"
        + "141moneonepzcvtnjpgnine\n"
        + "7n\n"
        + "8cgglsksnz1sixgkhqseven9\n"
        + "ninescvxnzslj7lldvskqphrqhlsmthreeseven\n"
        + "8twofive3psmxh\n"
        + "4xclmfour3\n"
        + "4sevenxz5onen3sixvgdmbtzk\n"
        + "3cclhckninejkmddqjkj\n"
        + "7eighthxsntjskvdonefour9eightfiveseven\n"
        + "three2six2seveneightqrlcvvczzfcgcm\n"
        + "plxthreefivethsmpqhzfour5\n"
        + "6two3sevenrbscccjhxbd\n"
        + "rdzxlnbxbh7eight67\n"
        + "65four\n"
        + "23mdqdh2\n"
        + "bsrmxvmfoursixgdssplvshdjlnvgf7gt\n"
        + "823jvfour\n"
        + "5eighttwosixjmlthreeqgtlzbpfqhc7\n"
        + "35foursljjvpfour7seven5\n"
        + "nsfourdtgzffvh763\n"
        + "9thtmpjtpsfnine\n"
        + "mkqcz9pmkpgnd\n"
        + "one6xmpjfkpsdcnfghs5\n"
        + "jqzgsf834\n"
        + "twotqpvxjc88659\n"
        + "4onetxvccvkclcqhl6two\n"
        + "kbgzsixfive7one1four4\n"
        + "gbkvfour93fivesixseven66\n"
        + "97pjzlvmonesix\n"
        + "fivenjmtgkjfz7nine3threexsntbqxg55\n"
        + "fivefive5threemfour526\n"
        + "bdpdqklfgxninegsrsixmkqbhq33\n"
        + "twosix9five\n"
        + "nineninenngsevenonegscxlttn7\n"
        + "sevenpllnzvqjlksevensevenjtkone32five\n"
        + "7dhjbnjvzxfdrhc5r3gtxgxgzzx24\n"
        + "kqsct1nzzbxldhfive6\n"
        + "964eight4jp1two\n"
        + "4cds99\n"
        + "twotworcqrpvgtcq3twoffqz8\n"
        + "6sixtwosixvzpzlr\n"
        + "ninebkktjnineone9sixfiveseven\n"
        + "fp6sixrrj3sqncfvzqtkcthree\n"
        + "6foursevenninekdbmqbbccjeight8nxvvnbvcdv\n"
        + "nkzthree9471seven\n"
        + "fivecdtrjone4seven22\n"
        + "twothree6onemvfourvtkrnnvvvbcs\n"
        + "56ninesixmscnd1seven\n"
        + "lnzntzqdeight2foureightthreexjpcprdncd\n"
        + "56zeightz8jfzthgf\n"
        + "eightthreeonegrnine24hsk\n"
        + "hlm185nrphc1\n"
        + "9five5\n"
        + "threegqtxmeight9rfkvqnineqnjxhskndqzf\n"
        + "1eightsix\n"
        + "539tzsgsjhnx7\n"
        + "cxhd32lksevenseven\n"
        + "2qnbljpnjgssbzbhxtcfcxsqjlh5\n"
        + "eights2kpfznvgghqtrmlb\n"
        + "2six2nine\n"
        + "cdrxjsxvvseven4bdljtxffdjhfive\n"
        + "399hvclz\n"
        + "1six18\n"
        + "xlnrghvfmz5qthzss\n"
        + "67rcgjkqckptsthree6twofourztsknx\n"
        + "4qhsh2five67cgkjsnqtfvtwo1\n"
        + "4lghphnh8\n"
        + "1vpvslztbphninezbttbskeight8\n"
        + "9fccbx\n"
        + "2zvsxhlceight\n"
        + "threehlmpkghvpz3cpseventhreetwonsix\n"
        + "lsbttpxhlnqzppm868fourtwo9qz\n"
        + "three17\n"
        + "69513zfxqjvlpfh6mvrr1\n"
        + "threenkchdrkqnfive5nine\n"
        + "two2tcmsnfivekfh6rfhthree\n"
        + "dtthree61stgcdkxqtm\n"
        + "4hldzqzxqd1dcddroneone\n"
        + "5jknllhktmhqjngc\n"
        + "qphxzsgtwozmpcdq2fiveonevz\n"
        + "three15three4eightthreeeight\n"
        + "vckqkjtonexnzrdbm6vsxfivefive7\n"
        + "three6eightsfnslxjnc7fourchtxdvftxpnzm\n"
        + "sixfxrxx2\n"
        + "9crhcfive8tlkr7qmxbcdcqb\n"
        + "6hvjqxjzzsz24bc\n"
        + "fbgsrsqmfv5hpkvlnxsfkpsccprhnv36\n"
        + "mbpmgvmjcmpgxmfive1fxmh4smb4ct\n"
        + "fourvpdcjttndp9qbfclcz6rnrhnkqjgv\n"
        + "onemhqsm69\n"
        + "rrz9\n"
        + "5qfsxdxktfjbdnzcrfvt15eightjmsvhrnks3\n"
        + "rgmvhprvkm3seven\n"
        + "twolxvjhc269tsnpjhvone\n"
        + "fiveeightrsrgxfjxn96\n"
        + "mfourjcxsvss3oneightlxh\n"
        + "sevenqjfg67k49xnqddlvf\n"
        + "hgxhtwo6kbkeight\n"
        + "97fivethree8\n"
        + "ncv228\n"
        + "95vjxzdpvxb6vxxtwo\n"
        + "rsfeightmrcccsvqsdsfxgonenine7\n"
        + "fsvjgqhgxsone64zdkdpghcjbprpzlmjfxsfknfd\n"
        + "xbhbtph8eight\n"
        + "1pdgmtwoslhkrtlfour91\n"
        + "16crzkxrxpxjfourfourfive8\n"
        + "slhmvmsixfrbggqdxfjcllbzn535two\n"
        + "twosdjxhpseven5eighth\n"
        + "6qdrmmvc9bvs\n"
        + "onedljtrk2pvgvqpfkqc2lgslhfd1\n"
        + "ninesevenxfqd4ztxnb7fourseven\n"
        + "fpvbdpjkqfive2tsxb\n"
        + "fglmcrcd9xsnxsxgkzmmgtcjlxlfiveseven\n"
        + "gkgmm5onethree7jn\n"
        + "ztmg3onetwo4\n"
        + "hhbgmpnrh3\n"
        + "188btpjkpdsix3oneightkpl\n"
        + "xbqjpdst9762onethree\n"
        + "4tqcdrzgljs19g8oneseven\n"
        + "ninezs46eight\n"
        + "grkgdppchchpzfive31\n"
        + "298three\n"
        + "2ghmxfjdjcfthreefive\n"
        + "9hrq3sevenonezxrvgxbr\n"
        + "n12kjninelvm\n"
        + "sixfourvgpctkk48seven\n"
        + "sixllxqmndkfcqvcdnssxjthreesixseven46\n"
        + "nine7six\n"
        + "lkcmctcnbeight8364\n"
        + "k2zqvznsrjjvtjtwo\n"
        + "zcxjvpgmllnlxxsonekrgsmqlntzsfxx4\n"
        + "twocgzfcj6nskqj84\n"
        + "rldlhnine5onefourvrstwo\n"
        + "lqfr92eightnsbgrpncdlheightpvktkd\n"
        + "vthreems422sevenninenine\n"
        + "zcmhzlnonerqtnl1zxdjtqqeightseven\n"
        + "8six3ps\n"
        + "blqhvpgt7\n"
        + "6gdf\n"
        + "3jrl54xchxvgclqq\n"
        + "8twosixfournine6ckrbnzr1oneightpp\n"
        + "twonine5three9\n"
        + "kmvmvrznj28eight4tlfourmqtmcgt\n"
        + "prpmhkpg5sixqqkhvjtsmdjlgsxgjnfour\n"
        + "5jfmzsprdmngm2nine\n"
        + "ltzvtgkc5nine1sldgncp\n"
        + "four6fivenine4\n"
        + "hgsjtwo47qg15\n"
        + "twoninesevennpmzshts4\n"
        + "hjkcjjkdqxplmsjxdjphcb77eight6eightf\n"
        + "8six3four2twoeighttwo\n"
        + "tgrh83ninethree3seven\n"
        + "bb6nineseven\n"
        + "trpbxtzfour24skvqhc8\n"
        + "rm4\n"
        + "pqrtvrtfivefour52\n"
        + "pdhtwo1q3\n"
        + "fivefour4\n"
        + "ninevvlfgvbzvdk7hkvsdjf8\n"
        + "two3nlprsnkgfzxbhlfoureight5onepdqgtcjp\n"
        + "one4hdjrvcnlfgpckx\n"
        + "52six6nplcqfvxnf\n"
        + "fzqgdmzdjeight8four\n"
        + "two7zlk\n"
        + "fg16seven8476cvthhjoneightt\n"
        + "ldcmngfninetwo2eight\n"
        + "eightsix8\n"
        + "twojlm2onetjn\n"
        + "3prnfrbng\n"
        + "276onebpks2\n"
        + "fournineeight52\n"
        + "3198hvd64\n"
        + "sixthreejmrl2\n"
        + "zsvmnnfsjbfourfour54sfnlghlv\n"
        + "5six4\n"
        + "6dvrgdfncvd\n"
        + "two4sevenhhvxsljvqtj3\n"
        + "dcmgr7five13\n"
        + "cmrgqdlthreemvcc9six\n"
        + "fivekjsx8eight\n"
        + "vhlvninefourtwotwo4five\n"
        + "vffxj9\n"
        + "pglbr7\n"
        + "rghtnsixfkbnrthreesix8seven\n"
        + "3fivenine5x17\n"
        + "3rdonet2ninexbslcnsevenflqxplkxbs\n"
        + "xbdgjfjttfhlrfldsmeightfour1tfjvcljc\n"
        + "sixrjp1\n"
        + "9sevengnsj\n"
        + "dpmmrqksixeightsmnt58three\n"
        + "2six66ninemnj6qjtvqpzcj\n"
        + "sevenfzgg2six\n"
        + "eightnine9sevenmhvxtbjxnh33\n"
        + "tscsvpdtjzsjmlfvrzceight8eighttwo6\n"
        + "seven193ltgmzczzqqmrrgseven\n"
        + "fourtwovjhqfzlrnine1xmkqcs5fjrcxfssh\n"
        + "83nbqmsrbbfhnjsixvgcbbtmphg\n"
        + "3ccdbzjpkx7nrjnmfljgfour842\n"
        + "threeseven8\n"
        + "foureightpjlj9\n"
        + "ctf5eightjnsvcrlfvz351\n"
        + "4sixfivehqbs16tgqhf\n"
        + "fourninekbvbtrbkl2h8nvflxrlvjdtrhz9\n"
        + "dgpvtwonbspfvtkqfgxsixonefour4nine\n"
        + "fournine15\n"
        + "66tpr6frphqtfgcvpsjctqccbl\n"
        + "foursvfjslmkb3rmxseven\n"
        + "jtqsntfvpbthreejsqqgqnxq7766\n"
        + "bjttrrvl9two\n"
        + "one73three4rffjxsm\n"
        + "fvmmheighttwokmcx7eightlzxcb\n"
        + "3kvkhkrzld7sixtwo\n"
        + "2three3mjqnpjznone2\n"
        + "gfhvmznd8431two5three9\n"
        + "62xdgeightqjgsfggzbrjcfsvmfourn\n"
        + "pdznineeightsevenhxb4\n"
        + "fiveone3sjqvhh\n"
        + "4nineqzrh\n"
        + "lhp5sixseven\n"
        + "2blntmnfourmnn\n"
        + "kcnxhnppzbsstbtvdrzt55three\n"
        + "1gtrkltzfzsixs6\n"
        + "85nsix3threethree\n"
        + "32three\n"
        + "six9fivefive4nineeightoneone\n"
        + "fivektmbvvlzl5\n"
        + "pdhfcjfrtprpqtqdnvnchl5356\n"
        + "one2sevensixsixmhfhsevenzvkrgxsmhd1\n"
        + "snvhxpxsevenc4twofivefour\n"
        + "dqrvvlxrcrmnjkmjpgr8threeshzgnfbcsb92eight\n"
        + "nkpll5nflrcffourtwoeightthreehzjvvdhm\n"
        + "sntlr3rthreetwonzxzlvxxbbnsbkrl6\n"
        + "eight26vhjjz4foureightwojk\n"
        + "five24414lbddfpxnqdxptlzl\n"
        + "dgqdninekmrs81n7x\n"
        + "pfgnp5sevenqpnckfkz8\n"
        + "eighteightgpxhrhprmmfpcp6\n"
        + "hqgxtkckqxvfcxskrhn9\n"
        + "4five8\n"
        + "sevensix5\n"
        + "rpk88gfxxz384brvgtkcqjnine\n"
        + "ninexjk21onetwo1hzdhsm\n"
        + "41hbthnkbl7gssdksjddone5kqkvxzc\n"
        + "jjhmxrb56fd\n"
        + "4kxxtmqjpfivesixone4nffllnkj\n"
        + "8jlkmhmjjfour\n"
        + "281one\n"
        + "qeightwofkzzzkgcspgxp1threeqmjcksr64four\n"
        + "xnbv3\n"
        + "4seven3ktgrjvdfive7five\n"
        + "dgroneightjmcrmplthdrncvld8one\n"
        + "4ninegkxpztlbzs3\n"
        + "1onetwosklsjcmsjh\n"
        + "nine16\n"
        + "8sixtwonine\n"
        + "3qhtzxzqfmh\n"
        + "twozgbcpzvsffthree4\n"
        + "48fkbpfpkzhfpnvmctsjq9\n"
        + "seven2two6zprbpmqdk1\n"
        + "4hhztrv7sixfournine\n"
        + "3threemxlshrpv59clfrt\n"
        + "sevenmqmnine4eight\n"
        + "xg36mlvzsix3kbqttvhtpd\n"
        + "699fourqhbhsdhrflmbfdk\n"
        + "gzjhseven63251\n"
        + "two8twonqplqkq\n"
        + "eightrbsgj21three\n"
        + "sdckkgcvmsjbvn5nine\n"
        + "624onesix\n"
        + "pjdnz7nctxzssf\n"
        + "kl5232rqkdrkd8five5\n"
        + "three53fourthreesixpjm\n"
        + "6sxpnjnqn79nineoneoneeighttwonenf\n"
        + "five398nine\n"
        + "96srrjjvjkpkbmhzdxgpkzszxxbseven\n"
        + "812vjlglflnd\n"
        + "34six9five7threeftcqxtcxxz\n"
        + "4threelpcjptwo\n"
        + "fivefivebldxbxeightjzsixthreefqmgb8\n"
        + "9cmrblfnd4\n"
        + "nine53one\n"
        + "seven3one\n"
        + "tsqrmmlvqjqone43\n"
        + "one5bm1ninefourthree\n"
        + "p882seven\n"
        + "c3eight\n"
        + "3eightsix\n"
        + "4sevenfqdrpdqbjpxdbjdsevenmsfxsmjdtcdhpd\n"
        + "cbeightxkttcgmsmone2nine88\n"
        + "nb7jtsvpggtcrntrbpzjthrsix35\n"
        + "5ninevtv3712\n"
        + "five3two2fivezbvfcvlnkskccj2\n"
        + "six8seventhree14\n"
        + "1eightmkzbxone9nv46\n"
        + "three4one\n"
        + "3njpjstjvzh9xjxnqr\n"
        + "threetwo9sml3\n"
        + "6rmzg6\n"
        + "seven91xbpnine8onefxktwo\n"
        + "ppmpn2oneone\n"
        + "qch5\n"
        + "rjrkk2zqzndfb7chzmtdv\n"
        + "vgkqbtwosix48zrntbhpn\n"
        + "82oneeightmbzvzvjb3four\n"
        + "6hrxnlmsfsngpklbrlrsvcl4\n"
        + "65sevenfivesixvjm\n"
        + "kkkhbdcnxfbfourfoursevenonesevenfour5\n"
        + "68qkcfd4four2\n"
        + "two94twofour\n"
        + "zzmz2jbl46kjnktxnvqrj\n"
        + "982\n"
        + "ninezrj9six\n"
        + "snxrvhctcrvzvfivehldldnjttonerstc4\n"
        + "bsftwonezfhnm5vlsjtnpnzj\n"
        + "onefiven57\n"
        + "seven6vbkrk\n"
        + "5five9\n"
        + "twoseven9\n"
        + "hglskzhzs7fpmmjzvmx9six9\n"
        + "1vsb\n"
        + "4lrhsh\n"
        + "gnln3ccc\n"
        + "four23\n"
        + "threebxljqlxkssmvndjbltcvfc4\n"
        + "fournine6eight2fourthree\n"
        + "4sevenqtsfccrrpdhseven\n"
        + "6sdzjdrfcxmdztrhpxbfshmrstq7fiverrcmtdfxmqphnpfxhkt\n"
        + "jsnbngsppbhgsixeight9xmhkvvqcdjzgplvztspone\n"
        + "rtbrqpgdcmmx9nnjjs8seventhree1\n"
        + "93five21\n"
        + "tss6eight\n"
        + "cpgvone9four\n"
        + "1eightwom\n"
        + "rgrsvtv48857\n"
        + "fptwonesixfivenine2\n"
        + "8xdbvf1zgfiveslb\n"
        + "ninenine3\n"
        + "p637sevenqbbvbpmlgrk\n"
        + "723onethreedhhvgls\n"
        + "four7five91pjlpnbmlfzvhrfhvs7\n"
        + "six547eighttwo7rg\n"
        + "vphlckdvqx3three\n"
        + "four12th\n"
        + "2kqzlthree8\n"
        + "sevenbl22\n"
        + "two68six4four7\n"
        + "lmrbqzgrsm2sixnine\n"
        + "fivexspftvthreezvjtgfbknp9mzslnb3two2\n"
        + "8twofive2\n"
        + "9vbngfdjmp\n"
        + "1qzphhnlbqz76411km\n"
        + "sevenfivethreetdnpmxllmkgnvhdz7tvjv\n"
        + "threectnine1seven\n"
        + "9fone\n"
        + "9sxbxsix6zmqllpzftsftbdf9nine\n"
        + "xninehhxsbzzspctdbpfdscbjq687glqdsqtvqz\n"
        + "threemjrdnvqrk7bvvsgfjfbone17\n"
        + "npntthqz4nine9fourbrdsqgnzlf5\n"
        + "133xqjvmjmpqdkt4\n"
        + "2dnvzgtnl5d9vvjlknxxqfourfive\n"
        + "mtntzxzvkmqr748\n"
        + "foursix6sixfour2vmqzxtzdqbzgmbrggmgtnine\n"
        + "hphqmdsgmvtwo35qnmsqnqnhlkb\n"
        + "flsxtqfxhsevensixgtkdseven6qzvscqbztwo\n"
        + "sixgxbmgchcrksixfivedznxzkzpttsvtzqhkdzrhqnhtwo5\n"
        + "69zpddjrnztqbr\n"
        + "1fourone2four1hfgsrvgtht\n"
        + "1rbr2gpfpdghtwo7ninedzx\n"
        + "4sixfour\n"
        + "9fivebcckvbdnkqhhhskb2\n"
        + "fghbcczsmhnbm1ninexdcpzjknqvfive6\n"
        + "5sevenjtmhs1one\n"
        + "8htpbfhgsdh55one2two\n"
        + "mmxsmst1fivefivesevenfivetwo4\n"
        + "984six6eight96\n"
        + "bhrrjtgdmj4two\n"
        + "seven8three\n"
        + "three3onefour8v\n"
        + "five9qbf8fzlvtsix\n"
        + "nkcmtl16four\n"
        + "gkdlzkfrnteighttworjjmtbrb451\n"
        + "txpkjjztlkth221seven\n"
        + "frtrvninesixlftgsxtxvbdnjmxc7\n"
        + "4mzdfjsxzvs9one6jrjv5\n"
        + "96threecxhhdjkmjhsrgz\n"
        + "one8sixcrchbgpz\n"
        + "grjvxszd1s6\n"
        + "qbxvjggkfrcfivempdck4\n"
        + "7one32jzpxdgstwo3pspjhmg\n"
        + "gsvgpdhthreesixeighttwo5hkncndcmthree\n"
        + "xksmqqsvzthreebjzr1fiveseven8seventwo\n"
        + "mlgjjjhn44\n"
        + "threefour12sixseven16\n"
        + "one2ghggthree4\n"
        + "ninefiveseven8tbldpbcmmvn\n"
        + "jxtxlqcc6twoh2\n"
        + "1xlsjrcfourqvlx9one\n"
        + "twothreetwo5\n"
        + "tmsqz1vrrj72\n"
        + "lcxdvtsl3onesix\n"
        + "fxqbcnpjzeight8seven\n"
        + "scpqzdhss13seven7nlkxmkntk64\n"
        + "fnlcc74\n"
        + "five4lkxcvztwo1two\n"
        + "85nmsjmgvcv\n"
        + "sixbqsxnq4\n"
        + "6fiveeightfiveseven\n"
        + "mbcxhgrjdtdtfpclfxzc1fnvlnz1five\n"
        + "9587sixptttpksnbnzzsrls\n"
        + "1jcqnzffpmrninesevenssxfndgkx\n"
        + "7zffzsjgzbgzzfvv2vnrrfvnclseven\n"
        + "mbghnmthjjfmcxzsixfive44\n"
        + "hklcflkm7four3\n"
        + "fddnsshjxf6twospgtkzzkfsix\n"
        + "sevenninesevenlkrhnzdzxfive6six\n"
        + "55bqeight\n"
        + "5nine6mfbeightsixone1\n"
        + "rjlkpq77\n"
        + "jqeightwofourtbcqvkvvqzcmrbbmzfiveseven59qmtz\n"
        + "ldb2jfqll\n"
        + "4nineftshkg77jtxggdt9four\n"
        + "nine2seven47seven487\n"
        + "8lpctcvhvfivezqcrtrxrsevenqhhtxrdplfbqpr1mjfkcfrrfc\n"
        + "zmlhsn6tfiveseven\n"
        + "djfmdf6\n"
        + "fhcthree5\n"
        + "9sevenbftsixone\n"
        + "four11tprnmdmvczfourgpjx\n"
        + "eightfourninexdchgfblq7\n"
        + "4c5sevendgtngqxzghpxpcs2\n"
        + "xdqcfmhsz3ktf\n"
        + "eightkvhvqgqn88rrftxjzzsrfb\n"
        + "gznfkfbtbnthree1four\n"
        + "273kfrsjbpzbzseven\n"
        + "five9foureightvlpmphnp\n"
        + "1qtgttxninetwosqfffcsfgxdz68psbmvvpmt\n"
        + "nine9fivefcnpbnl6tmbsjkrr9three\n"
        + "szmthreeonesix2bqfqrxkljlseven\n"
        + "jvphjsqzlc2dbzchmronetwo\n"
        + "8sixthree2v9threesixqkqb\n"
        + "fourone3eight6fiveeightrgjmfive\n"
        + "9ppveight\n"
        + "two6vgkdlv73ninesix\n"
        + "44886488\n"
        + "lsjxprxdz58eight32\n"
        + "four95skp\n"
        + "2eight3three9jq7nkftgzn\n"
        + "cssgnvhvnnrlklmmxdfxhtvptwo6fmtmchspb\n"
        + "9five7xnx4hxvdlslgpfourfour\n"
        + "onetwo9six3cpsdjprgkjthcfmkkx\n"
        + "1threeeightqgxvvvgvs1lqrfivegfqqslmc\n"
        + "five7eightfivesix9one29\n"
        + "59eighttwooneone\n"
        + "4s44549fiverhcbmpqgjm\n"
        + "nineffkpxf2\n"
        + "seven8fqsvjnjzphsevenj\n"
        + "eightmpgfxkspplninekqzlplrmmn224twonezxf\n"
        + "mqqqctworfpjkkhninevgh7eightonezdmfrrvv\n"
        + "one31\n"
        + "8nbcjdx3\n"
        + "rdprrrcjjflkxszthreetworvfksix4\n"
        + "one59three\n"
        + "2rhxjrb6kjdpxqbthree6xlzgvk\n"
        + "threexbsvqsseven7cxmggqrnsthree9\n"
        + "gmqxghthreeone7fourvfivefoursix\n"
        + "5nine8\n"
        + "khcnjsfourzxjkvp5zfhpcvv\n"
        + "three3xnbzpmjqsix5\n"
        + "3ninehvdbz43\n"
        + "47ssqq5fourfoursixcggslftbttlpb\n"
        + "2threemdtlrprfzc\n"
        + "2threethree\n"
        + "nine84fczsrqzd7six\n"
        + "fourmrbqh79\n"
        + "gqdhhggdxfive6\n"
        + "d99fphzhxghqt44seven\n"
        + "lldllhmzrskzzbzsixfour6two91seven\n"
        + "3xzjfsppg\n"
        + "7five6nzfpvcpm5\n"
        + "one9mpggcblrpstzpvfffivelkrqvkvkkhtzseven\n"
        + "eightbr3ksix\n"
        + "4eighttwothree2bzfivebn\n"
        + "18twoseven\n"
        + "bdjbgtxdjx57seven\n"
        + "eightthree89two3vmsbxbskclh\n"
        + "lgnbbjxtmgvfsix5three\n"
        + "cgrsfsns653five7\n"
        + "two1sevenkqllxjvqbfvfxnr\n"
        + "jptmclgmdzhndpkbcd9\n"
        + "twosix62threeone2\n"
        + "three5chntgfivegkbzfrvvxkb\n"
        + "5djqstgsrbhl8\n"
        + "9v3\n"
        + "8four9four89\n"
        + "five2nineseven\n"
        + "h3cpsxzx3four2\n"
        + "fivehpzczrl5zxkzkpxcvdkshsfqzxpjqqhdg5\n"
        + "bdfftptqt8kmpbdgsncceightzmtfjphnxqbslplrqxv8\n"
        + "two74tworvzjftxvqzpvx\n"
        + "bpjslrgkbonethreelfsxshjtpfour2kjxgzgv\n"
        + "rqktwopdlvjrrxlgvrfnnine3qonesix\n"
        + "fivefivec4sixgdldnine9\n"
        + "eightz1zzqph\n"
        + "dgmcl5153qtgxlkzgtzseven8three\n"
        + "knkrvlxvjs6svsrj51fourhjbqzq\n"
        + "three96\n"
        + "szxkfqthreethreenine1\n"
        + "9gxtwofourzeight\n"
        + "fninel8\n"
        + "ninevzddbcfhttwo1onesj\n"
        + "mdbg8qxvzfsgmh9eighthpqcrzklheightwofp\n"
        + "78lqjv3fourdthreethreeeightwonlq\n"
        + "fourkkrzcbphdseight8brqjsfsbfktwo\n"
        + "4tnvlcfjqsixql\n"
        + "zd7nbzhclh8\n"
        + "plkrkone2\n"
        + "mksjljks4xfslzzlp\n"
        + "nine22462seven2\n"
        + "gbtwonine93\n"
        + "vkvb6fiveltone2eight2\n"
        + "cnxxhvlcj863sixsevenmckrblvvtbzqbc\n"
        + "nfldnvnxx2eightninexnsbseven\n"
        + "1six6\n"
        + "nine83\n"
        + "one5djxkzxrttqthree8jzqdfvthmtwooneone\n"
        + "gjdj1eight\n"
        + "3fivetwonzflsvgdmgtbz\n"
        + "threetwosixvbssrqxjfvffour3\n"
        + "2ninefivernscgdfrgpsnvtchzfxmdhjfsfivefour\n"
        + "threegsmtcn12\n"
        + "foursmbzsrhnnseven6twodnnjhbthree\n"
        + "62twortpndjsgfgmd\n"
        + "ktxsgdskqtlbnj5one1mxhztxgb2four\n"
        + "threefourfmfxrmnlhninersxz1eight\n"
        + "3jkqdvsevensixhbxfq\n"
        + "slmseven8sndphqlhjgbzhrdrfxzphfvs\n"
        + "6gfvsxprrmg7nzmjkvnm8\n"
        + "34qgtjsnoneqbqrmkz9\n"
        + "2sevendvqvdtjrjrhpfzkphpsixtwozkfg\n"
        + "72nineseven\n"
        + "nsgmfsfive8two\n"
        + "71sixhzsl9sixfnrjntxpv\n"
        + "onennncchq73eight3\n"
        + "vsxbb13cpdpvhnmz2\n"
        + "681\n"
        + "mpgd2\n"
        + "bzh72seven\n"
        + "fiveeight4589jknzbnjlrt57\n"
        + "one3dm4\n"
        + "91nine6mbspjn\n"
        + "bzmztdlkqslzbnghlsxtvfk2\n"
        + "3two12vpl7dkkjjln4\n"
        + "zdmgeight9kfvtpx7nine\n"
        + "7114nine655xxx\n"
        + "332\n"
        + "six183fourfivelstnlsvgvx\n"
        + "zsxbg9tbpsnbvzhj6eight\n"
        + "nqqctrzlpggjrrrlzdfkjthree2\n"
        + "fivecsvzxptmhk8\n"
        + "d7hssmvk6one\n"
        + "kngdgssixeight1four3\n"
        + "sevengptvbjtkbxsdgzdeight8twop\n"
        + "fourlmscbhkkfour89kflkf\n"
        + "7bxl6mcgzfxv\n"
        + "klkqmz29\n"
        + "kmszrdfour2ppkkdlffivendgcfthree8\n"
        + "kcvpt7\n"
        + "sdjttwokhtzdksix6\n"
        + "eight83four31nine4\n"
        + "4eight4vxctcsgzf31qhjptxhfrjtl\n"
        + "dhhfmbhtst6ninehmb2\n"
        + "1ninesevenkhfmgjjltgkrgxvm48cxtzzvhn\n"
        + "dczpdbfl45jcpmckczpssnqn2six7\n"
        + "6tsmftwokdgltlkzqdqttflqhm\n"
        + "1qthkhrrjxvbkngldslmzp2\n"
        + "2sevenr6zzcvkqgkn93\n"
        + "1fivec1x2gbdkqvkqpsix7\n"
        + "3znplrfxnrq\n"
        + "ninetwofiveseven44bsn\n"
        + "onefive9zqknglr8thzhx\n"
        + "sevenfourcts5lttdprpg8three9seven\n"
        + "seven9vfjqdfkg3\n"
        + "5tjmtkhseven3five\n"
        + "crf14\n"
        + "5fourxxn\n"
        + "r3fivejbvrzgnl\n"
        + "4nine5\n"
        + "svhmflmpbkjjponemj2threefslgpxsrprjzvfxcrvp\n"
        + "91threeeightfour6bmqfmr\n"
        + "6krhfmtwothree2sixeight\n"
        + "pdpvrlqb36\n"
        + "4sixsevenseventhreegjthree\n"
        + "threehgckkksz8eight3\n"
        + "qqhtjq3lnvqkpjvrp42\n"
        + "3three8four942\n"
        + "mggbbhxd4eightvmmdvl\n"
        + "fourtqpgjkszglhthree752\n"
        + "ninehsnqzkrzpfgdvlg5six\n"
        + "6two8xstlhvhkhdone\n"
        + "fivesix55eightqpjdxkpnine\n"
        + "ftwone4seventhreenine3two\n"
        + "sixfivetwoqplqntzlldbmkgzsix78\n"
        + "onenlqnxcr4\n"
        + "seven5spnronedhtxsdgtfgsgjl1jlhf\n"
        + "fivethreednbvgpbr7four5\n"
        + "qchoneightpbgdzxjbshqf527four4\n"
        + "51threetwo5sevenhnnpjvx\n"
        + "qdkcbnkjssixtwobkfzcnfkb84\n"
        + "qsjgzbgpxq9\n"
        + "7eight3six\n"
        + "8jvmxgnp6cqpsqtqgfive1nine\n"
        + "nineg11sj\n"
        + "3fourfour\n"
        + "pg6djcsdmdlgjtwo1\n"
        + "bxcbznvnqbfjjbfonedgl3foureightjgsqbqhzhg\n"
        + "twofivetwosixv5fiveonenine\n"
        + "l8eight6gdmd\n"
        + "nine15bcseven2\n"
        + "l4\n"
        + "g5ldxkrk4fivevft\n"
        + "fourxmf35\n"
        + "nine6xdhfmltwofnqkf\n"
        + "phbcjjmnmcvjgzfsixfour6eight5\n"
        + "2ckvh\n"
        + "rzone3745\n"
        + "keightwosixfour466\n"
        + "one3lbkl7tssqxqrbbmxkh\n"
        + "6oneonezllhftdf4bfpxj\n"
        + "6eightpc\n"
        + "ninenine4nbfbqrtnvkl\n"
        + "sixqbbffgdsixtwofivesix8\n"
        + "zfplftwosixsixnine9\n"
        + "two4rncnine77nineczlfdrp\n"
        + "43jseven\n"
        + "7mntc\n"
        + "6z146fourtwo\n"
        + "seventhreethreevxmbzhmpktj6twohxzjnhp7\n"
        + "tz6vrdbzgzhxcfd\n"
        + "seven6eighttgglxnhmknine\n"
        + "8eightseven41crvrxbonetmscnl\n"
        + "xbhtfgg5four86onesixthreejk\n"
        + "3dlblsjq\n"
        + "sevenmsrgcfmxmthreegzgxdqmkcgkjcbnx45pzlcjc\n"
        + "5nine69\n"
        + "9cpjmdgf\n"
        + "4fourkgzmjnhplrlmeight\n"
        + "ninetwo6sixmdz\n"
        + "dcdbk71twothree56fourtbzkz\n"
        + "tcc3nineeightseven2flrlndb4\n"
        + "sixcpztsj72zpdhmvfp4two\n"
        + "9hnine5\n"
        + "two7kktkms\n"
        + "1sevennine\n"
        + "5zczmvxthreethreetwovvnfvvsjnv\n"
        + "9dhjcgnnsvh4five4\n"
        + "bbv46hvj68eight7\n"
        + "sdmntqgftc5blnhkktqmg1five\n"
        + "5ninefour\n"
        + "gmg6bzgrxhgtssthreenine1\n"
        + "78twothree4mtbfthree\n"
        + "hclggrdf9\n"
        + "jnbmj3seven4\n"
        + "xdhcgkrkrtrfourcxmlzp1scxkxxzlsdjfccchzg\n"
        + "rpdphff9blkl22csthreex\n"
        + "stwone791seven\n"
        + "cdfkxhfqr4sdlcleightnine72tkftldjnq\n"
        + "tklpckfour7seven1qvxthlfourhtrdn2\n"
        + "b4three4cninetwonebbv\n"
        + "nfourdzxjxcp7mnzkzdnmpqsixgn\n"
        + "jfcfncxone9kmdrbxfjtpvfp26\n"
        + "6threeseven21ssblsvrbfsvzmbktkpztcsmpt7\n"
        + "vgchkqhxrbjnlqnvpml77twonejcv\n"
        + "gxklhvtwo55five\n"
        + "sevenfivetwo1mtdfjgcp2sevenpj\n"
        + "qvrjceightcjlp5\n"
        + "tbl4zxthxzpsix\n"
        + "rvzlvnhnineeight2cxxcslhpph\n"
        + "shrxnz9rtfrtrtr\n"
        + "1drmztt2zfournrmxfivejzksgzqfour\n"
        + "chtmdlppljlllhg8threendnhkn1qzxkrtnqgrtwo\n"
        + "two15eighttdlrpqjx45\n"
        + "1kqd5\n"
        + "3krsbnzthreetxpv\n"
        + "7ninefivesix67sixseven\n"
        + "sevenninesmjkdfssnl3two7\n"
        + "pmjmkzdrvfour4nineseven\n"
        + "t1xnlcvlfninecbrzxc5\n"
        + "nine3qnjcktfiveeightkhb\n"
        + "psqrone1nxcsrntkjg9\n"
        + "6lgdfgxts9two9\n"
        + "48six4\n"
        + "threehvxfhzvxhs8three2two\n"
        + "onesrmxjlv43gtsjtdneight\n"
        + "5eight14fournineeightfour4\n"
        + "3mljsmn7mrnvnc844\n"
        + "5dmdvxxddhone9fiveone\n"
        + "twogscrq26xfppjzhthreervonefour\n"
        + "6ndcblbmdjpthreetwotwovpcsmffive\n"
        + "5gkqzhgvrcthreeseven\n"
        + "sixkhgqjqnineqhxl4\n"
        + "z6ltpkcqxmd\n"
        + "fivetwo5rstcq9\n"
        + "threetwo563\n"
        + "4fourtvksk8onefive\n"
        + "294tv\n"
        + "7flzfzm22brfgxsqhhckzc5\n"
        + "twoone9sixsixninethree7\n"
        + "2glqfourseven1one\n"
        + "nine4five7418\n"
        + "9xfivezxrr1xpjm896\n"
        + "foursixtwoninevtzzgntnlg6oneightbxp\n"
        + "2eight1fiveeightfive\n"
        + "mzjxlhjmqp58six\n"
        + "one34\n"
        + "8fivejdmljr\n"
        + "tsblxssixseven4djq\n"
        + "8drrmf32\n"
        + "11twok9663\n"
        + "hsoneight3sevennpsbbkdvsb46\n"
        + "dtrnnhxcdmzzlssffhgvbxxrgbcz2fiveonesix\n"
        + "kkeightwo6975six\n"
        + "jcftbeight9\n"
        + "fivefivephbpdtkqfm246\n"
        + "5eight97nine\n"
        + "4sixfour4nppgsr36one3\n"
        + "glxlmnvhjxsevensix1fourseven\n"
        + "sevensixjczjhjzbj8fnsnrsevenfive2seven\n"
        + "jjpngnpzglkbltbrv2tjmqrpb\n"
        + "4txvpps9kvjhgsqpcv6eight2jxk\n"
        + "onesix8qfvkckg145ndkfdcvznine\n"
        + "nkthree86b5fgzzfoneqn\n"
        + "eightgndhmrfouronexldvdvqnzxqjczfk1\n";

    int result = calibrationMachine.getSum(actualInput);

    assertThat(result).isEqualTo(53348);
  }

  @Test
  public void finalTestPart2(){
    String actualInput = "two1nine\n"
        + "eightwothree\n"
        + "abcone2threexyz\n"
        + "xtwone3four\n"
        + "4nineeightseven2\n"
        + "zoneight234\n"
        + "7pqrstsixteen";

    int result = calibrationMachine.getSum(actualInput);

    assertThat(result).isEqualTo(281);
  }
}