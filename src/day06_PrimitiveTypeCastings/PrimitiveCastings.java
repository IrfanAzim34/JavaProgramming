package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // Implicit Casting == Casting smaller primitive types to larger primitive types.
        byte a = 100;
        short b = a; // implicit casting
        //  short b = (short)a   -->   background

        int c = b; // implicit casting
        // int c = (int)b  -->  background

        long d = c; // implicit casting
        // long d = (long)c   -->   background

        float e = d; //implicit casting
        // float e = (float)d  --> background

        double f = e; // implicit casting
        // double f = (double)e  --> background


        // Explicit Casting == Casting larger primitive types to smaller primitive types.
        int x = 55;
        short y = (short) x;
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n; // 10.8 will become 10
        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);

    }

}
