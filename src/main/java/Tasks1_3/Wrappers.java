package Tasks1_3;

public class Wrappers {
    public static void main(String[] args) {
        // Обертки над целочисленными типами
        Byte myByte = Byte.valueOf((byte) 111);
        Short myShort = Short.valueOf((short) 32711);
        Integer myInteger = Integer.valueOf(2147483647);
        Long myLong = Long.valueOf(9223372036854775807L);

        // Обертки над типами с плавающей точкой
        Float myFloat = Float.valueOf(3.14F);
        Double myDouble = Double.valueOf(3.14159);

        // Обертка над логическим типом
        Boolean myBoolean = Boolean.valueOf(false);

        // Обертка над символьным типом
        Character myCharacter = Character.valueOf('Q');

        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Integer: " + myInteger);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Character: " + myCharacter);
    }
}