
package calculatrice.model;

import java.util.ArrayList;

// la classe recupere une chaine et CALCUL
abstract class CalculReponse {

    private static String nombreChaine= "";
    static ArrayList<String> LesNombreChaine = new ArrayList<>();
    static ArrayList<Character> Operateur = new ArrayList<>();
    public CalculReponse() {
    }
    public String reponse(String text) {
        String reponse ;
        analiseChaineEtTrieCharInt(text);
        Calcul('x','/');
        //Calcul('/');
        Calcul('-','+');
        //Calcul('+');
        reponse = LesNombreChaine.get(0);
        System.out.println("la reponse Avant ="+reponse);
        if(reponse.charAt(reponse.length()-1)=='0'){
            if(reponse.charAt(reponse.length()-2)=='.'){
                reponse=reponse.substring(0, reponse.length()-2);
                System.out.println("la reponse Apres ="+reponse);
            }
        }
        ArrayClear();
        return  reponse ;
    }
    protected void ArrayClear() {
        Operateur.clear();
        LesNombreChaine.clear();
    }
    private static  void setNombreChaine(char nombre){
     nombreChaine  = nombreChaine + nombre;  
  }
    private static String calcul(char operation, String nombre1, String nombre2){
         String resultat="";
        Float n1 = Float.valueOf(nombre1);
        Float n2 = Float.valueOf(nombre2);
        switch(operation){
            case 'x' -> resultat = String.valueOf(n1*n2);
             case '-' -> resultat = String.valueOf(n1-n2);
             case '+' -> resultat = String.valueOf(n1+n2);
             case '/' -> resultat = String.valueOf((float)n1/n2);
        }
        return resultat;
    }
     private static  void nombreChaineClean(){
     nombreChaine  = "";
  }
    public static void analiseChaineEtTrieCharInt(String text) {
       int n ;
        if(text.charAt(0)=='-'){
            n=1 ;
            setNombreChaine(text.charAt(0));
        }else{
            n=0;
        }
        for(int i=n;i<text.length();i++){
            char caractere = text.charAt(i);
            if(Character.isDigit(caractere) || caractere=='.' ){
                setNombreChaine(caractere);
            }else {
                if(caractere=='-'){
                    if(text.charAt(i-1)!='x' && text.charAt(i-1)!='/'){
                        LesNombreChaine.add(nombreChaine);
                        Operateur.add('+');
                    }
                nombreChaineClean();
                setNombreChaine(caractere);
                }else{
                LesNombreChaine.add(nombreChaine);
                nombreChaineClean();
                Operateur.add(caractere);
                }
            }
        }
        LesNombreChaine.add(nombreChaine);
        nombreChaineClean();
        System.out.println(LesNombreChaine);
        System.out.println(Operateur);
    }

    public static void Calcul(char operation1,char operation2) {
        ArrayList<Integer> suppr = new ArrayList<>();
        for(int i=0;i<Operateur.size();i++){
            if(Operateur.get(i)==operation1 || Operateur.get(i)==operation2){
                char operation=Operateur.get(i) ;
                /*stock l'element i correspondant a l'emplacement i 
                des valeur valeur a supprimé apres avoir fait l'operation
                */
                suppr.add(i);
            
                LesNombreChaine.set((i+1),calcul( operation, LesNombreChaine.get(i),LesNombreChaine.get(i+1)));
            }
        }
        for(int i=0;i<suppr.size();i++){
            //supprim les element i dans les tableau operateur et LesNombrechaine
            
            Operateur.remove(suppr.get(i)-i);
            LesNombreChaine.remove(suppr.get(i)-i);
        }
    }
}


    

