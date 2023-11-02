package Tasks1_3;

public class Wrappers {
    public static void main(String[] args) {
        // Обертки над целочисленными типами
        Byte a = 111;
        Short b = 32711;
        Integer c = 2147483647;
        Long d = 9223372036854775807L;

        // Обертки над типами с плавающей точкой
        Float e = 3.14F;
        Double f = 3.14159;

        // Обертка над логическим типом
        Boolean g = false;

        // Обертка над символьным типом
        Character h = 'Q';

        System.out.println("Byte: " + a);
        System.out.println("Short: " + b);
        System.out.println("Integer: " + c);
        System.out.println("Long: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Boolean: " + g);
        System.out.println("Character: " + h);
    }
}