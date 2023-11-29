import java.util.*;

public class Rapell {
    public static void main(String[] args) {

        // 1) Déclaration d'une Variable avec et doitêtre initialisée avec une valeur
        int a = 10;
        
        // 2) Println pour afficher text
        System.out.println("La vlauer est :" + a );


        // 3) Déclaration plusieurs variables mais méme type et spéarer par virgules
        String Nom = "El khanchoufi", Prénom = "Youssef";
        System.out.println("Prenom : " + Prénom + " Nom : " + Nom);

        // 4) Atribution meme valeur au plusieurs Variable
        int Nb1 , Nb2;
        Nb1 = Nb2 = 50;
        System.out.println("La Somme Nb1 + Nb2 = "+(Nb1+Nb2));

        // 5) Identification du variable 
            // Peuvent contenir : [Lettres a-z A-Z] , [Chiffres 0-9] , [ _ ] , [ $ , Dollar]
                int var_1 = 50;
                System.out.println(var_1);
            // Doit Commencer par une lettre      = var30
                int var_2 = 15;
                System.out.println(var_2);
            // Pas contenir d'espaces             = var20
            // Peuvent Commencer par _ ou $       = 
                String _var3$ = "Hamza";
                System.out.println(_var3$);
            //  sensibles à la casse donc :  ( var_1 != var_2 ) 
            // Les mots réserver ne peuvent pas etre utilisés comme noms
        
        
        

        
    }
}
