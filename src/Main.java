import Utiles.LowerCase;
import Utiles.UpperCase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String str = sys.next();

        UpperCase upperCase = new UpperCase();
        LowerCase lowerCase = new LowerCase();

        System.out.println("Кол-во заглавных символов:" + upperCase.analyse(str));
        System.out.println("Кол-во строчных:" + lowerCase.analyse(str));

    }
}

