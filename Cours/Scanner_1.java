import java.util.Scanner;  // Import the Scanner class

public class Scanner_1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // Example 1 : NextLine
        System.out.println("Entre Votre Nom et Prenom :");
        String Nom_Prenom = s.nextLine();
        System.out.println("Nom et Prenom est : " + Nom_Prenom);


        // Example 2 : Next
        System.out.println("Entre Fillier ISI ou GI");
        String Filliere = s.next();
        System.out.println("Filliere est : " + Filliere);


        // Example 3 : NextInt et Nextlong et nextShort
        System.out.println("Entre première la note");
        short a = s.nextShort();
        System.out.println("Entre première la note");
        int b = s.nextInt();
        System.out.println("Entre deuxième la note");
        long c = s.nextLong(); // 17,7
        System.out.println("short : " + a + " - Int : " + b  + " - Long : " + c);
        

        // Example 4 : Nextfloat et Nextdouble
        System.out.println("Entre première la note");
        float a2 = s.nextFloat();
        System.out.println("Entre deuxième la note");
        double b3 = s.nextDouble(); // 17,7
        System.out.println("Int : " + a2 + " - Double : " + b3);

        s.close();
    }
}
