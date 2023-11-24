import java.util.*;

public class Basic {

    public static void main(String[] args) {

        // I) Les opérateurs de décalage de bits

        int val = 5;

        // 1) Conversion en binaire
        System.out.println("Valeur Binaire est : " + Integer.toBinaryString(val));

        // 2) Decalage de bit
        val <<= 3;
        System.out.println("Valeur Binaire : " + Integer.toBinaryString(val));
        System.out.println("Resultat est : " + val);

        // 2) Decalage en bit
        val >>= 3;
        System.out.println("Valeur Binaire : " + Integer.toBinaryString(val));
        System.out.println("Resultat est : " + val);

        int value = 0b00010001;
        System.out.println("VAleur est : " + value);
        System.out.println("Value >> 2   => " + (value >> 2)); // value * 2^2 = value * (4)
        System.out.println("Value << 2   => " + (value << 2)); // value / 2^2 = value * (4)

        // 3) Autre Example :
        int val2 = 15;
        System.out.println("15 => binaire : " + Integer.toBinaryString(val2));
        System.out.println("15 >> 3 =  15 / 2^3 = 15 / 8 = 1 ---- " + (val2 >> 3));
        System.out.println("15 << 3 =  15 * 2^3 = 15 * 8 = 120  ---- " + (val2 << 3));

        // ======================================================================================

        // +=
        int num = 10;
        num += 5; // num = num + 5
        System.out.println(" 10 += 5  :" + num);

        // -= num = 15
        num -= 3;
        System.out.println(" 15 -= 3 : " + num);

        // *= num = 12
        num *= 4;
        System.out.println(" 12 *= 4 : " + num);

        // %= num = 48
        num %= 2;
        System.out.println(" 48 %= 3 : " + num);

        // &=
        num = 16;
        num &= 5; // 10000 & 00101 = 00000
        System.out.println(num);

        // |=
        num = 16;
        num |= 5; // 10000 | 00101 = 10101 = 16+1+4 = 21
        System.out.println(num);

        // ^=
        num = 16;
        num |= 5; // 10000 ^ 00101 = 10101 = 21
        System.out.println(num);

        // II) Les Variables

        String chaine;
        chaine = "Je suis Youssef";
        System.out.println(chaine);

        char unicode = '\u0006';
        char ASCII = 50;
        System.out.println(unicode);
        System.out.println(ASCII);

        // 3) Opérateurs arithmétiques :
        // ---------------------------------
        // Opérateur + :

        System.out.println(65 + 2); // 67
        System.out.println("Youssef" + "El khanchoufi"); // "Youssef el khanchoufi"
        System.out.println("Youssef " + 2 + 5); // "Youssef 25"
        System.out.println("a + b = " + (5 + 5)); // "a + b = " 10

        // Opérateur - :
        System.out.println("a - b = " + (6 - 1)); // opérateur binaire :
        System.out.println("Negative  = " + (-6)); // opérateur monadique : Convertir

        // Opérateur * :
        System.out.println("a * b = " + (10 * 2)); // 20 multiplie ses deux opérandes.

        // Opérateur / :
        System.out.println("a / b = " + (12 / 2));
        System.out.println("a / b = " + (12 / 3));
        System.out.println("a / b = " + (12.5 / 3));
        System.out.println("a / b = " + (0.0 / 0.0)); // NAN
        System.out.println("a / b = " + (12 / 0.0)); // infini positif
        // System.out.println("a / b = " +(12 / 0 ));

        // Opérateur % :
        System.out.println("a % b = " + (20 % 3));
        System.out.println("Float : A % 0 " + (20.0 % 0)); // NAN
        // System.out.println("Entier : A % 0 = " + (20 % 0));

        // Opérateur d'incrémentation et de décrementation
        int Nombre1 = 24;
        int A = Nombre1++; // ( A = Nombre ) aprés ( Nombre+1 )
        System.out.println("Valeur Nombre1  et  A :" + Nombre1 + " - " + A);

        int Nombre2 = 36;
        int B = ++Nombre2; // ( Nombre2 +1) aprés (B = Nombre2)
        System.out.println("Valeur Nombre2  et  B :" + Nombre2 + " - " + B);

        int num1 = 35;
        A = num1--;
        System.out.println("Valeur A et num1 : " + num1 + " - " + A);

        int num2 = 36;
        B = --num2;
        System.out.println("Valeur B et num2 : " + num2 + " - " + B);

        // Opérateur de comparaison
        System.out.println(50 == 60); // false
        System.out.println(50 == 50); // true

        System.out.println(50 != 60); // true
        System.out.println(50 != 50); // false

        System.out.println(60 > 20); // true
        System.out.println(60 < 20); // false

        System.out.println(60 >= 60); // true
        System.out.println(20 <= 30); // true

        // Opérateur logiques
        // Logical And
        System.out.println(50 <= 60 && 20 >= 30); // true and false = false
        // Logicial OR
        System.out.println(50 <= 60 || 20 >= 30); // true OR false = true
        // Logicial Not
        System.out.println(!(20 >= 10 && 30 <= 10)); // - !(true and flase) = !(false) = true

        // Logical &
        System.out.println(50 <= 60 & 20 >= 30); // (true 0001 & 0000 false) => 0000 : false
        // Logical |
        System.out.println(50 <= 60 | 20 >= 30); // (true 0001 | 0000 false ) => 0001 : true

        int x = -10;
        System.out.println(x >= 0 ? x : -x);

        // Exercice if et else if et else
        Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("Enter Premier Numbre :");
        int numbre1 = Sc.nextInt();
        System.out.println("Entre Deuxiéme Numbre : ");
        int numbre2 = Sc.nextInt();
        if (numbre1 > numbre2) {
            System.out.println("Valeur Number1 > Number2  : " + numbre1 + ">" + numbre2);
        } else if (numbre1 == numbre2) {
            System.out.println("Valeur Number1 == Number2 : " + numbre1 + " == " + numbre2);
        } else {
            System.out.println("Valeur Number1 < Number2  : " + numbre1 + " < " + numbre2);
        }

        // Switch
        System.out.println("Entre un numbre : ");
        int nb1 = Sc.nextInt();
        switch (nb1) {
            case 10:
            case 5:
                System.out.println("Valeur est 10 ou est 5");
                break;
            case 30:
                System.out.println("Valeur est 30");
                break;
            case 50:
                System.out.println("Valeur est 50");
                break;
            default:
                System.out.println("Pas egal aucun valeur");
        }

        // Boucles while
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Boucle do while
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        // Boucle for
        for (i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Autre Example
        for (i = 5; i > 0; i--) {
            System.out.println("i =" + i);
        }

        for (i = 0; i < 5; i += 2) {
            System.out.println("i =" + i);
        }

        // Boucle foreach
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

        // break
        System.out.println("========== Break ============");
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // Continue
        System.out.println("============= Continue ===========");
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // Condition Ternary
        int Age_1 = 19;
        int Age_2 = 10;
        String Chaine = (Age_1 > Age_2) ? "Age_1 > Age_2" : "Age_1 <= Age_2";
        System.out.println("Chaine est :" + Chaine);

        // exercise Utilsation Break et Continue dans Boucle while et for et do while
        int Totale = 0;
        for (i = 0; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            Totale += 2;
        }
        // i=0 t=2 * i=1 t=4 * i=2 t=6 * i=3 ... * i=4 t=8 * i=5 t=10
        System.out.println("Totale est :" + Totale);

        Totale = 0;
        for (i = 0; i < 6; i++) {
            if (i == 3)
                break;
            Totale += 2;
        }
        // i=0 t=2 * i=1 t=4 * i=2 t=6 * i=3 ---- break
        System.out.println("Totale est :" + Totale);

        // Dans Boucle imbriquées :
        for (i = 0; i < 10; i++) {
            forBreak: for (int line = 0; line < 10; line++) {
                for (int column = 0; column < 10; column++) {
                    if (line == 7 && column == 7) {
                        break forBreak;
                    }
                    System.out.printf("%dx%dx%d ", column, line, i);
                }
                System.out.println();
            }
            System.out.println();
        }

        // TP Boucle
        for (int I = 4, hrt = 1; I > 0; I--, hrt += 2) {
            for (int j = 0; j < I; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < hrt; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // TP2 : Exercice
        for(int I =5; I >0; I--){
            for(int j=0; j< I; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // TP3 : Exercice
        for(int I=5; I>0; I--){
            for(int J=1; J<I; J++){
              System.out.print(" ");   
            }
            for(int L=0; L<6-I; L++ ){
              System.out.print("*");  
            }
            System.out.println("");
         }
    }

}