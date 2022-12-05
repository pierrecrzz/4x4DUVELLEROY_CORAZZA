/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

/**
 *
 * @author valen
 */
public class CelluledeGrille {

    public CelluledeGrille() {
        this.JetonCourant = null;
        this.AvoirTrouNoir = false;
        this.avoirDesintegrateur = false;
    }
   
    private Jeton JetonCourant;
    private boolean AvoirTrouNoir;
    private boolean avoirDesintegrateur;
       
 
   
    public boolean affecterJeton (Jeton J) {
        if (JetonCourant == null){
            JetonCourant = J ;
            return true;
        } else {
           return false ;
}
}
    public String lireCouleurDuJeton(){
        return JetonCourant.Couleur ;
  }
       
    public boolean PlacerTrouNoir(boolean AvoirTrouNoir) {
        if (AvoirTrouNoir==false) {
            AvoirTrouNoir= true ;
            return true ;
        }
        else{
            return false;
        }

}
   
    public boolean presenceTrouNoir(boolean AvoirTrouNoir) {
        if (AvoirTrouNoir==true){
            return true;
        }
        else{
            return false ;            
        }
    }
 
   
     
     
    public Jeton recupererJeton () {
        return JetonCourant ;
    }
   
    public boolean supprimerJeton(int JetonCourant) {
        if (JetonCourant!=0) {
            JetonCourant = 0;
            return true;
                    }
        else {
            return false;
                   
        }
    }
    public boolean presenceDesintegrateur (boolean avoirDesintegrateur) {
        if (avoirDesintegrateur==true){
            return true;
        }
        else{
            return false;
        }
    }
   
    public boolean placerDesintegrateur (boolean avoirDesintegrateur) {
        if (avoirDesintegrateur==false){
            avoirDesintegrateur=true;
            return true;
        } else {
            return false;
        }              
    }
   
    public boolean supprimerDesintegrateur (boolean avoirDesintegrateur){
        if (avoirDesintegrateur == true){
            avoirDesintegrateur= false;
            return true;
        }else{
            return false;
        }
           
}
   
    public boolean activerTrouNoir (boolean AvoirTrouNoir){
        if (AvoirTrouNoir==true){
            AvoirTrouNoir=false;
            return true;
        }else{
            return false;
        }
    }
   
    public boolean supprimerTrouNoir (boolean AvoirTrouNoir){
        if (AvoirTrouNoir==true){
            AvoirTrouNoir=false;
            return true;
        }else{
            return false;
        }
    }
}

