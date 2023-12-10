public class Array {
    public static void main(String[] args) {
        // Declaration Tableaux 
        String Tab_1[] = {"Hamza","Ilyas","Jadore","Anwar"};
        
        // Deuxiéme Method
        String Tab_2[] = new String[3];
        // Remplir un tableau 
        Tab_2[0] = "Omar";
        Tab_2[1] = "Hind";
        Tab_2[2] = "Nouhaila";

        // Troisième Method
        String[] Tab_3 = new String[3];
        Tab_3[0] = "Omar";
        Tab_3[1] = "Hind";
        Tab_3[2] = "Nouhaila";

        // Longueur d'un Tableau (Nombre d'éléments).
        System.out.println("Nombre d'éléments Tableau est : " + Tab_2.length);

        // L'indice du dernier élément du Tableau est :
        System.out.println("Indice dérnier element est : " + (Tab_2.length-1));



        // Parcourir un tableau
            // Method : for 
        for(int i=0; i<Tab_3.length; i++){
            System.out.println("Valeur est : " + Tab_3[i]);
        }
            // Method : For-each
        for(String var : Tab_3){
            System.out.println("Valeur : " + var);
        }
         

        // Tableaux multidimensionnels
        // Pour créer un tableau nommé tab de 3 lignes de 3 colonnes.
        int tab1[][] = new int[3][3];

        int[][] tab2 = new int[2][3];

        int tab3[][] = {{1,2,3},{4,7,2},{19,3,17}};

        // Parcourir un tableau bidimensionnel
            // Method : for
        for(int i=0; i< tab3.length; i++){
            for(int j=0; j< tab3[i].length; j++){
                System.out.print(tab3[i][j]);
            }
            System.out.print("\n");
        }

        // Method : for-each
        int tab4[][] = {{1,2,3},{4,7,2},{19,3,17}};
        for(int Soustab[] : tab4){
            for(int elm : Soustab){
                 System.out.print(elm);
            }
            System.out.print("\n");   
        }

        



    }
}
