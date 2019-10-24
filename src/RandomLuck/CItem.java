package RandomLuck;

import java.util.*;

public enum CItem {

    K1(1,"P1"),
    K2(2,"P2"),
    K3(3,"P3"),
    K4(4,"P4"),
    K5(5,"P5"),
    K6(6,"P6"),
    K7(7,"P7"),
    K8(8,"P8"),
    K9(9,"P9"),
    K10(10,"P10"),
    K11(11,"P11"),
    K12(12,"P12"),
    K13(13,"P13"),
    K14(14,"P14"),
    K15(15,"P15"),
    K16(16,"P16"),
    K17(17,"P17"),
    K18(18,"P18"),
    K19(19,"P19"),
    K20(20,"P20"),
    K21(21,"P21"),
    K22(22,"P22"),
    K23(23,"P23"),
    K24(24,"P24"),
    K25(25,"P25"),
    K26(26,"P26"),
    K27(27,"P27"),
    K28(28,"P28"),
    K29(29,"P29"),
    K30(30,"P30"),
    K31(31,"P31"),
    K32(32,"P32"),
    K33(33,"P33"),
    K34(34,"P34"),
    K35(35,"P35"),

    D1( 101,"D1",false) ,
    D2( 102,"D2",false) ,
    D3( 103,"D3",false) ,
    D4( 104,"D4",false) ,
    D5( 105,"D5",false) ;

    private String label;
    private int value;
    private boolean basic;

    private static final List<CItem> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size() ;

    private static final Random RANDOM = new Random();

    public  static CItem randomCItem() {
        boolean koniec = false;
        CItem b = CItem.K1;
        while (koniec != true) {
            b = VALUES.get(RANDOM.nextInt(SIZE));
            if (b.value >= 1 && b.value <= 35) {
                koniec = true;
                return b;

            }


        }
        return b;
    }

    public Integer getValue() {
        return value;
    }


    private static Map mapBasic = new HashMap();
    private static Map mapAdditional = new HashMap();

    static {
        for (CItem kula : CItem.values()) {
            mapBasic.put(kula.value,kula);
        }
    }

    static {
        for (CItem ball:  CItem.values()) {
            mapAdditional.put(ball.value,ball);
        }
    }

    public static CItem valueof(Integer value){
        return (CItem) mapBasic.get(value);
    }


    CItem(final Integer value, final String label){
        this.value=value;
        this.label=label;
        this.basic= false;
    }

    CItem(final Integer wartosc){
        this.value=value;
        this.label = 'P' + String.valueOf(value);
        this.basic= false;
    }

    CItem(final Integer value, final String label,final boolean basic) {
        this.value = value;
        this.label = label;
        this.basic = basic;
    }

    public boolean isAdditional() {
        return !isBasic();
    }

    public boolean isBasic() {
        return basic;
    }
}
