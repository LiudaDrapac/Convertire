package convertire;

public class Convertire {
    public static void main(String[] args)  {

    String a = "tRue";
    Boolean b = new Boolean("tRue" );
    boolean c = b.booleanValue();
    System.out.println(c);

    String d = "120";
    Byte e = new Byte("120");
    byte f = e.byteValue();
    System.out.println(f);

    String g = "32000";
    Short h = new Short("32000" );
    short i = h.shortValue();
    System.out.println(i);

    String n = "147895632";
    Integer m = new Integer("147895632" );
    int o = m.intValue();
    System.out.println(o);

    String p = "987654321987654321";
    Long l = new Long("987654321987654321" );
    long k =l.longValue();
    System.out.println(k);

    String j = "4444.5d";
    Double s = new Double("4444.5d" );
    double t = s.doubleValue();
    System.out.println(t);

    String r = "2354.56f";
    Float u = new Float("2354.56f" );
    float y = u.floatValue();
    System.out.println(y);
}
    }