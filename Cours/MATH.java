package Cours;
public class MATH {
    public static void main(String[] args) {

        // La méthode peut être utilisée pour trouver la valeur la plus élevée de x et o
        System.out.println("Max est : " + Math.max(1, 2));

        // La méthode peut être utilisée pour trouver la valeur la plus basse de x et y :Math.min(x,y)
        System.out.println("Min est : " + Math.min(2,19));

        // La méthode renvoie la racine carrée de x :Math.sqrt(x) => √64 = 8.
        System.out.println("Racine : " + Math.sqrt(8));

        // La méthode renvoie la valeur absolue (positive) de x :Math.abs(x)
        System.out.println("Absolue est : " + Math.abs(-98));

        // Math.random()renvoie un nombre aléatoire compris entre 0,0 (inclus) et 1,0 (exclusif) :
        System.out.println("Nombre aléatoire est : " + (Math.random()*100));

        // 	Returns the value of Ex
        System.out.println("Ex est : " + Math.exp(4));

    }
}
