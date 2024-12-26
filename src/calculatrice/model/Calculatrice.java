
package calculatrice.model;

/**
 *
 * @author Tecno
 */
public class Calculatrice extends CalculReponse{
  
   // private double calcule = 0;
    private String resultatTexte="" ;
    //private String operation= "";
    private String resultatPrecedent;
    private Boolean premierAction = false;
    public String reponseLAbel2;

    @Override
    public String reponse(String text) {
        String solution = super.reponse(text);
        resultatPrecedent = solution;
        resultatTexte=solution ;
        return solution ;
    }
    public String getEgale(){
        if(resultatTexte.length()!=0){
        if(Character.isDigit(resultatTexte.charAt(resultatTexte.length()-1))){
           String texte =reponse(getTextOperation());
           setResultatPrecedent(texte);
           return texte ;
       }else{
            return getTextOperation() ;
        }
        }else{
            return "0";
        }
    }
     public String inverseSigneResultat(){
         if(resultatTexte.length()!=0){
         if( Character.isDigit(resultatTexte.charAt(resultatTexte.length()-1))){
             String text;
             text = String.valueOf(- Double.valueOf(getEgale()));
             reponseLAbel2= "="+text ;
             resultatTexte=text ;
             return text;
         }else{
             return getTextOperation() ;
         }
         }else{
             return "0";
         }
     }

   public String  getResultatPrecedent(){
       return resultatPrecedent ;
    }
   public void  setResultatPrecedent(String resultatPrecedent){
      this.resultatPrecedent = resultatPrecedent ;
    }
   
    public Calculatrice() { }
    
   
    public String getTextOperation(){
        if(resultatTexte.length()!=0){
            return resultatTexte;
        }else {
            return "0";
        }
         
    }
    
   
  public String getTexteLabelResultat(int nombre){
      resultatTexte = resultatTexte + nombre;
      premierAction = true;
      reponseLAbel2 ="="+ super.reponse(resultatTexte);
      return resultatTexte;
  }
  public String getTexteLabelResultat(String nombre){
      resultatTexte = resultatTexte + nombre;
      premierAction = true;
      return resultatTexte;
  }
  public String getTexteLabelResultat(char operateur){
      if(premierAction ){
          if(resultatTexte.length()!=0 ){
                if(resultatTexte.charAt(resultatTexte.length()-1)!='-'){       
                    if(! Character.isDigit(resultatTexte.charAt(resultatTexte.length()-1))){
                          if(operateur!='-'){
                              supprimerLeDernierVoid();
                          }
                          if (resultatTexte.charAt(resultatTexte.length()-1)=='+' && operateur =='-'){
                              supprimerLeDernierVoid();
                          }
                      }  
                     resultatTexte = resultatTexte + operateur;
                 }else{
                    if(resultatTexte.length()>=2){
                        if(Character.isDigit(resultatTexte.charAt(resultatTexte.length()-2))){
                           supprimerLeDernierVoid();
                           resultatTexte = resultatTexte + operateur;
                       }
                    }
                 }
                
          }
      return resultatTexte;
      }else{ if(operateur=='-') {
          resultatTexte = resultatTexte + operateur;
          premierAction = true;
          return resultatTexte;
            }else{
              return "0";
            }
      }
  }
   public String supprimerLeDernier(){
       if(resultatTexte.length()>1){
          resultatTexte = resultatTexte.substring(0, resultatTexte.length()-1);
          if(Character.isDigit(resultatTexte.charAt(resultatTexte.length()-1))){
          reponseLAbel2 ="="+ super.reponse(resultatTexte);
          }else if(Character.isDigit(resultatTexte.charAt(resultatTexte.length()-2))){
                   reponseLAbel2 ="="+ super.reponse(resultatTexte.substring(0, resultatTexte.length()-1));
                }else{
              reponseLAbel2 ="="+ super.reponse(resultatTexte.substring(0, resultatTexte.length()-2));
          }
         return resultatTexte;
       }else if(resultatTexte.length()==1){
                resultatTexte = resultatTexte.substring(0, resultatTexte.length()-1);
                premierAction = false;
                reponseLAbel2 = "="+"0";
                return "0";
             }else{
                   reponseLAbel2 = "="+"0";
                   return "0";
             }    
  }
   public void supprimerLeDernierVoid(){
      resultatTexte = resultatTexte.substring(0, resultatTexte.length()-1);
      //setOuiTuPeuxEcrireOperateur();
      
  }
   
  public String getSupprimeToutTexte(){
      resultatTexte = "";
      premierAction = false;
      super.ArrayClear();
      return "0";
  }
}
