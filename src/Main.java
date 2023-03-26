import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите уравнение");
        while(true){
          String calc = scanner.nextLine();
          calc = calc.trim();

    String[] strings = calc.split(" ");
    if (strings.length >3){
         throw new ScannerException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
    if (strings.length<3){
        throw new ScannerException("строка не является математической операцией");
    }
    String a = strings[0];
    String b = strings[2];
    boolean rim1 = false;
    boolean rim2 = false;
    int a2 = 0;
    switch (strings[0]) {
        case "I":
            a2 = 1;
            break;
        case "II":
            a2 = 2;
            break;
        case "III":
            a2 = 3;
            break;
        case "IV":
            a2 = 4;
            break;
        case "V":
            a2 = 5;
            break;
        case "VI":
            a2 = 6;
            break;
        case "VII":
            a2 = 7;
            break;
        case "VIII":
            a2 = 8;
            break;
        case "IX":
            a2 = 9;
            break;
        case "X":
            a2 = 10;
            break;
    }
    int b2 = 0;
    switch (strings[2]) {
        case "I":
        b2 = 1;
        break;
        case "II":
        b2 = 2;
        break;
        case "III":
        b2 = 3;
        break;
        case "IV":
        b2 = 4;
        break;
        case "V":
        b2 = 5;
        break;
        case "VI":
        b2 = 6;
        break;
        case "VII":
        b2 = 7;
        break;
        case "VIII":
        b2 = 8;
        break;
        case "IX":
        b2 = 9;
        break;
        case "X":
        b2 = 10;
        break;
            }
    if(a2>0 ) {
        rim1 = true;
    }
    if(b2>0 ) {
        rim2 = true;
    }
    if (rim1==!true && rim2==true){
        throw new ScannerException("строка не является математической операцией");
    }
    if (rim1==true && rim2==!true){
        throw new ScannerException("строка не является математической операцией");
    }
    if (rim1==true && rim2==true) {
        int rez;
        switch (strings[1]) {
            case "+":
                rez = a2 + b2;
                String des1 = "";
                String des2 = "";
                String des3 = "";
                String des4 = "";
                String des5 = "";
                String des6 = "";
                String des7 = "";
                String des8 = "";
                String des9 = "";
                String des10 = "";
                String ost1 = "";
                String ost2 = "";
                String ost3 = "";
                String ost4 = "";
                String ost5 = "";
                String ost6 = "";
                String ost7 = "";
                String ost8 = "";
                String ost9 = "";
                int des = (a2 + b2) / 10;
                switch (des) {
                    case 1:
                        des1 ="X";
                        break;
                    case 2:
                        des2 ="XX";
                        break;
                    case 3:
                        des3 ="XXX";
                        break;
                    case 4:
                        des4 ="XL";
                        break;
                    case 5:
                        des5 ="L";
                        break;
                    case 6:
                        des6 ="LX";
                        break;
                    case 7:
                        des7 ="LXX";
                        break;
                    case 8:
                        des8 ="LXXX";
                        break;
                    case 9:
                        des9 ="XC";
                        break;
                    case 10:
                        des10 = "C";
                }
                int ost = rez - des*10;
                switch (ost) {
                    case 1:
                        ost1 ="I";
                        break;
                    case 2:
                        ost2 ="II";
                        break;
                    case 3:
                        ost3 ="III";
                        break;
                    case 4:
                        ost4 ="IV";
                        break;
                    case 5:
                        ost5 ="V";
                        break;
                    case 6:
                        ost6 ="VI";
                        break;
                    case 7:
                        ost7 ="VII";
                        break;
                    case 8:
                        ost8 ="VIII";
                        break;
                    case 9:
                        ost9 ="IX";
                        break;
                }
                String strRez = des1+des2+des3+des4+des5+des6+des7+des8+des9+des10+ost1+ost2+ost3+ost4+ost5+ost6+ost7+ost8+ost9;
                System.out.println(strRez);

                break;
            case "-":
                if (a2 < b2){
                    throw new ScannerException("в римской системе нет отрицательных чисел");
                }
                rez = a2 - b2;
                switch (rez) {
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                }
                break;
            case "*":
                rez = a2 * b2;
                 des1 = "";
                 des2 = "";
                 des3 = "";
                 des4 = "";
                 des5 = "";
                 des6 = "";
                 des7 = "";
                 des8 = "";
                 des9 = "";
                 des10 = "";
                 ost1 = "";
                 ost2 = "";
                 ost3 = "";
                 ost4 = "";
                 ost5 = "";
                 ost6 = "";
                 ost7 = "";
                 ost8 = "";
                 ost9 = "";
                 des = a2 * b2 / 10;
                switch (des) {
                    case 1:
                         des1 ="X";
                        break;
                    case 2:
                         des2 ="XX";
                        break;
                    case 3:
                         des3 ="XXX";
                        break;
                    case 4:
                         des4 ="XL";
                        break;
                    case 5:
                         des5 ="L";
                        break;
                    case 6:
                         des6 ="LX";
                        break;
                    case 7:
                         des7 ="LXX";
                        break;
                    case 8:
                         des8 ="LXXX";
                        break;
                    case 9:
                         des9 ="XC";
                        break;
                    case 10:
                         des10 = "C";
                }
                ost = rez - des*10;
                switch (ost) {
                    case 1:
                         ost1 ="I";
                        break;
                    case 2:
                         ost2 ="II";
                        break;
                    case 3:
                         ost3 ="III";
                        break;
                    case 4:
                         ost4 ="IV";
                        break;
                    case 5:
                         ost5 ="V";
                        break;
                    case 6:
                         ost6 ="VI";
                        break;
                    case 7:
                         ost7 ="VII";
                        break;
                    case 8:
                         ost8 ="VIII";
                        break;
                    case 9:
                         ost9 ="IX";
                        break;
                }
                 strRez = des1+des2+des3+des4+des5+des6+des7+des8+des9+des10+ost1+ost2+ost3+ost4+ost5+ost6+ost7+ost8+ost9;
                System.out.println(strRez);
                break;
            case "/":
                rez = a2 / b2;
                if (rez < 1){
                    throw new ScannerException("исключение");
                }
                switch (rez) {
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                }
                break;
        }
    }


    if (rim1==false && rim2==false){
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int rez;
        if (a1 > 10 || a1 < 1 || b1 > 10 || b1 < 1) {
            throw new ScannerException("Введено число не от 1 до 10");
        }
        switch (strings[1]) {
            case "+":
                rez = a1 + b1;
                System.out.println(Integer.toString(rez));
                break;
            case "-":
                rez = a1 - b1;
                System.out.println(Integer.toString(rez));
                break;
            case "*":
                rez = a1 * b1;
                System.out.println(Integer.toString(rez));
                break;
            case "/":
                rez = a1 / b1;
                System.out.println(Integer.toString(rez));
                break;
        }
    }
    }
    }
}
