public class TiposPrimitivos {
    public static void main(String args[]){
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 10;
        System.out.println("numero short " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = 10;
        System.out.println("numero int " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numerolong = 10;
        System.out.println("numero long " + numerolong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);


           /*
            tipos primitivos flotantes: float, double

        */

        float numeroFloat = (float)10.0;
        System.out.println("numero float = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 10;
        System.out.println("numero double = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);


        // palabra var

        var numeroEntero = 10;
        System.out.println("NumeroEntero = " + numeroEntero);

        var numeroDouble_ = 10.0;
        System.out.println("NumeroDouble = " + numeroDouble_);

        var numeroFloat_ = 10.0F;
        System.out.println("NumeroFloat = " + numeroFloat_);
    }
}
