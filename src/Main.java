import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Ler valores em JAVA
//        Scanner in = new Scanner( System.in );
//        in.hasNext

//        Pattern p = Pattern.compile("a*b");
//        Matcher m = p.matcher("aaaaab");
//        boolean b = m.matches();

       // System.out.println(b);


//        String fonte = "mouse da cor azul";
//        String queremosIsso = "m";
//
//        Pattern p = Pattern.compile(queremosIsso);
//
//        Matcher m = p.matcher(fonte);
//
//        while (m.find()) {
//            System.out.println(m.start());
//            System.out.println(m.group());
//            System.out.println(m.end());
//
//        }
        //String pattern = "dd/MM/yyyy HH:mm:ss.SSS";
        // '1997-05-10 21:00:01';
//        String pattern = "yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

//        Long mes = 2592000L;
//
//        System.out.println(Instant.now().getEpochSecond());
//        //String date = simpleDateFormat.format(Date.from(Instant.ofEpochSecond(1668143362 + mes)));
//        String date = simpleDateFormat.format(Date.from(Instant.ofEpochSecond(Instant.now().getEpochSecond() + mes)));
//        System.out.println(date);


        File file = new File("D:\\Cursos\\Funções\\Java\\in.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            if(scan != null) {
                scan.close();
            }
        }

    }
}