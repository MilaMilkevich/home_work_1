package cursor;

//Try   all arithmetic operations (+ - * /) with primitives: byte, short, long, double, float, write results
// of each operation into console (System.out.println())

public class Main {
   public static void main(String [] args) {
        byte byte1 = 100;
        byte byte2 = 4;
        short short1 = -12894;
        short short2 = 24777;
        long long1 = 777777777777777L;
        long long2 = 555555555555L;
        double double1 = 7.8;
        double double2 = 1.5;
        float float1 = 74.65f;
        float float2 = 12.54f;
        System.out.println("byte1 / byte2 = " + (byte1 / byte2));
        System.out.println("short1 + short2 = " + (short1 + short2));
        System.out.println("long1 - long2 = " + (long1 - long2));
        System.out.println("double1 * double2 = " + (double1 * double2));
        System.out.println("float1 + float2 = " + (float1 + float2));
   }
}
