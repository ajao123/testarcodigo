package utils.overviewScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class OverviewScanner {
    public static void main(String[] args) throws FileNotFoundException {


        //Lendo dados
        Scanner sc1 = new Scanner(System.in);
        /*
            Para esperar um inteiro:

                Sucesso:
                    1
                    -1
                    +1
                    00001
                    -00001
                    +00001
                Erro:
                    1.0
                    1.1
                    1+1
                    1-1
                    1*1
                    1/1
                    1^1
                    0x10
                    0b010

                Observações:
                    Remove o 0 à esquerda.
        */

        // Também pode converter para outras bases usando radix, pode ser usado com bytes, shorts, ints, longs e bigIntegers
//        int inteiro = sc1.nextInt();
//        int binario = sc1.nextInt(8);
//        System.out.println(inteiro); // 10
//        System.out.println(binario); // 2
//        BigInteger b = BigInteger.valueOf(10);
//        System.out.println(b);
        sc1.close();


        // Lendo arquivos, se for encontrado algum atributo
        /*

        Scanner sc2 = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\type_arquivo"));
        Scanner sc3 = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\type_txt.txt"));

        while(sc2.hasNextDouble()){
            System.out.println(sc2.nextDouble());
        }
        while(sc3.hasNextLong()){
            System.out.println(sc3.nextLong());
        }
        */
        Scanner scannerByte = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\inteiros"));
        Scanner scannerByteOctal = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\octais"));
        Scanner scannerByteHexadecimal = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\hexadecimais"));
        Scanner scannerShort = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\inteiros"));
        Scanner scannerInteiro = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\inteiros"));
        Scanner scannerLong = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\inteiros"));
        Scanner scannerBigInteger = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\inteiros"));
        Scanner scannerFloat = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\decimais"));
        Scanner scannerDouble = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\decimais"));
        Scanner scannerBigDecimal = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\types\\decimais"));

        System.out.println("\nscannerByte.hasNextByte()");
        while (scannerByte.hasNextByte()) {
            System.out.print(scannerByte.nextByte() + " ");
        }

        System.out.println("\nscannerByteOctal.hasNextByte()");
        while (scannerByteOctal.hasNextByte(8)) {
            System.out.print(scannerByteOctal.nextByte(8) + " ");
        }


        System.out.println("\nscannerByteHexadecimal.hasNextByte()");
        while (scannerByteHexadecimal.hasNextByte(16)) {
            System.out.print(scannerByteHexadecimal.nextByte(16) + " ");
        }

        System.out.println("\nscannerShort.hasNextShort()");
        while (scannerShort.hasNextShort()) {
            System.out.print(scannerShort.nextShort() + " ");
        }
        System.out.println("\nscannerInteiro.hasNextInt()");
        while (scannerInteiro.hasNextInt()) {
            System.out.print(scannerInteiro.nextInt() + " ");
        }
        System.out.println("\nscannerLong.hasNextLong()");
        while (scannerLong.hasNextLong()) {
            System.out.print(scannerLong.nextLong() + " ");
        }
        System.out.println("\nscannerBigInteger.hasNextBigInteger()");
        while (scannerBigInteger.hasNextBigInteger()) {
            System.out.print(scannerBigInteger.nextBigInteger() + " ");
        }

        System.out.println("\nscannerFloat.hasNextFloat()");
        while (scannerFloat.hasNextFloat()) {
            System.out.print(scannerFloat.nextFloat() + " ");
        }
        System.out.println("\nscannerDouble.hasNextDouble()");
        while (scannerDouble.hasNextDouble()) {
            System.out.print(scannerDouble.nextDouble() + " ");
        }
        System.out.println("\nscannerBigDecimal.nextBigDecimal()");
        while (scannerBigDecimal.hasNextBigDecimal()) {
            System.out.print(scannerBigDecimal.nextBigDecimal() + " ");
        }

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();

        input = "1,2,3,4,5,6,7,8,9,10,11";
        Scanner ss = new Scanner(input).useDelimiter("\\s*,\\s*");
        while (ss.hasNextInt()) {
            System.out.print(ss.nextInt() + " ");
        }
        ss.close();

        System.out.println("\n\nDelimiter:");
        Scanner scannerDelimiter = new Scanner(new File("C:\\Users\\Allisson Jardel\\Desktop\\JAVA\\AprendizadoJava\\src\\utils\\overviewScanner\\files\\delimiter.txt")).useDelimiter("\\s*,\\s*");
        while (scannerDelimiter.hasNextInt()) {
            System.out.print(scannerDelimiter.nextInt() + " ");
        }

        input = "1 fish 2 fish red fish blue fish";
        System.out.println("\n\n" + input + "\n");
        s = new Scanner(input);
        s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
        MatchResult result = s.match();
        int i;
        for (i = 1; i <= result.groupCount(); i++)
            //System.out.println(result.group(i).getClass().getSimpleName());
            System.out.println(result.group(i));
        s.close();

        String dec = "1.1,2.0,3.4,4.8,5.2,6.9,7.5,8.4,9.2,10.0,11.4";
        Scanner decimalScanner = new Scanner(dec).useDelimiter("\\s*,\\s*");

        while (decimalScanner.hasNext()) {
            System.out.print(decimalScanner.next() + " ");
            //System.out.print(Double.valueOf(decimalScanner.next()) + " ");
        }
        //decimalScanner.close();

    }
}