package utils.variaveis;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OverviewInteiros {

    public static void main(String[] args){
        /*

            x = -9960059960010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
            y = 9960059960010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

            - Infinito <- ... BigInteger ... x ... Long(-9223372036854775808) ... Int(-2147483648) ... Short(-32768) ... Byte(-128) ... Byte(127) ... Short(32767) ... Int(2147483647) ... Long(9223372036854775807) ... y ... BigInteger ... -> + Infinito

        */

        // Constantes

            // Com excessão do BigInteger, todos possuem essas constantes

                System.out.println(Byte.BYTES); // 1
                System.out.println(Byte.MIN_VALUE); // -128
                System.out.println(Byte.MAX_VALUE); // 127
                System.out.println(Byte.SIZE); // 8
                System.out.println(Byte.TYPE); // byte



            // BigInteger

                System.out.println(BigInteger.ZERO);
                System.out.println(BigInteger.ONE);
                System.out.println(BigInteger.TWO);
                System.out.println(BigInteger.TEN);

        // Trabalhando com outras bases


            /*
                Se tiver um 0b à esquerda, o número é binário.
                Se tiver um 0 à esquerda, o número é octal.
                Se tiver um 0x à esquerda, o número é hexadecimais.
            */

            // Binário

                // Short, Integer e Long se comportam da mesma forma.

                byte binario = 0b010;// 2
                binario = 0b010 + 3; // 5
                Byte.valueOf("010", 2); // 2
                Byte.valueOf("10", 2); // 2
                Byte.parseByte("-010", 2); // -2
                Byte.parseByte("10", 2); // 2

            // Decimal

                // Short, Integer e Long se comportam da mesma forma.

                byte decimal = 10;// 10
                decimal = 10+3; // 13
                Byte.valueOf((byte) 10); // 10
                Byte.valueOf("11"); // 11
                Byte.parseByte("11"); // 11
                Byte.parseByte("-11"); // -11

            // Octal

                // Short, Integer e Long se comportam da mesma forma.

                byte octal = 010;// 8
                octal = 010+3; // 11
                Byte.valueOf((byte) 010); // 8
                Byte.valueOf("11", 8); // 9
                Byte.parseByte("11", 8); // 9

            // Hexadecimal

                byte hexadecimal = 0x10;// 16
                hexadecimal = 0x10+3; // 19
                Byte.valueOf((byte) 0x10); // 16
                Byte.valueOf("11", 16); // 17
                Byte.parseByte("11", 16); // 17


    // BigInteger

        BigInteger bigA = new BigInteger("20");
        BigInteger bigB = new BigInteger("10");

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.subtract(bigB));
        System.out.println(bigA.multiply(bigB));
        System.out.println(bigA.divide(bigB));


    }


}
