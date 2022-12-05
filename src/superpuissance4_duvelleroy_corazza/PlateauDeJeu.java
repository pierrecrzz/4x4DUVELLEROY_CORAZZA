/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

/**
 *
 * @author valen
 */

public class PlateauDeJeu {
   
    CelluleDeGrille[][] grille = new CelluleDeGrille [6][7] ;

    public PlateauDeJeu() {         //contrusteur de la classe
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grille[i][j] = new CelluleDeGrille();
            }
        }
    }
   
   
    public boolean ajouterJetonDansColonne (Joueur joueurCourant, int colonne){
        //on ajoute un jeton sur la ligne la plus basse et on renvoie faux si la colonne est pleine
        Jeton J = joueurCourant.ListeJetons [joueurCourant.nombreJetonsRestants- 1]  ;
        if (colonneRemplie (colonne)==true)
            return false;
        int i;
        i=0;
        while (grille[i][colonne]!=null) {
            i= i+1;
           
        }
       
        grille[i][colonne].JetonCourant= J;
        if (grille[i][colonne].presenceTrouNoir==true){
            grille[i][colonne].activerTrouNoir ();
        }
        if (grille[i][colonne].presenceDesintegrateur()==true){
            grille[i][colonne].recupererDesintegrateur();
            JoueurCourant.nombreDesintegrateur++;
        }
        return true;
}
   
   
   
    public boolean grilleRemplie() {
        boolean resultat=true ;
        for (int i=0;i<6; i++){
            for(int j=0;j<7; j++) {
                if (grille[i][j].JetonCourant == null) {
                    resultat = false;
                    break;
                }break;
            }break;
        }
        return resultat;

}
    public void viderGrille() {
        for (int i=0; i<6;i++){
            for (int j = 0; j < 7; j++) {
                grille[i][j].JetonCourant = null;
            }
        }
    }
   
   
    public void afficherGrilleSurConsole (){
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                if (grille[i][j].presenceDesintegrateur()==true&&grille[i][j].presenceTrouNoir()==false) {
                    System.out.print("\033[34m D ");
                }
                if (grille[i][j].presenceTrouNoir()==true&&grille[i][j].presenceDesintegrateur() == true || grille[i][j].presenceTrouNoir() == true) {
                    //trou noir ou desintegrateur simple ou les 2 d'un coup
                    System.out.print("\033[30m X  ");
                } else if (presenceJeton(i, j) == true) {

                    if (lireCouleurDuJeton(i, j) == "rouge") {
                        System.out.print("\033[31m O  ");
                    }
                    if (lireCouleurDuJeton(i, j) == "jaune") {
                        System.out.print("\033[33m O  ");
                    }
                } else {
                    System.out.print("\033[37m O  ") ;
                }
            } System.out.println ("")  ;
        }
    }
   
   
    public boolean presenceJeton (int ligne ,int colonne){
        int l= ligne ;
        int c= colonne;
        if (grille[l][c].JetonCourant != null) {
            return true;
        }else {
            return false;
        }
    }
    public String lireCouleurDuJeton (boolean grilleRemplie,int ligne, int colonne) {
        int i= ligne ;
        int j= colonne;
        if (presenceJeton(i,j)== false) {
            return "La celulle est vide";
    }
        else {
            return grille[i][j].JetonCourant.couleur;
           
       
    }
    }
   
   
    public boolean etreGagnantePourJoueur(Joueur joueur){  
        int valeur=0;
        int i;
        int j;
        for(i=0;i<6;i++){  
            if (valeur==1){  
                break;
            }
            for(j=0;j<4;j++){  
                if (presenceJeton(i, j)&& presenceJeton(i, j+1)&& presenceJeton(i, j+2)&& presenceJeton(i, j+3)== true){  
                    if (grille[i][j].JetonCourant.couleur==joueur.couleur&& grille[i][j+1].JetonCourant.couleur==joueur.couleur && grille[i][j+2].JetonCourant.couleur==joueur.couleur && grille[i][j+3].JetonCourant.couleur==joueur.couleur){
                        valeur=1; //ne pas faire tous les tests si on trouve direct une combinaison gagnante
                        break;
                    }
                }
            }
        }
       
        //pareil mais sur les colonnes
        for(i=0;i<3;i++){
            if (valeur==1){
                break;
            }
            for(j=0;j<7;j++){
                if (presenceJeton(i, j)&& presenceJeton(i+1, j)&& presenceJeton(i+2, j) && presenceJeton(i+3, j)==true){
                    if (grille[i][j].JetonCourant.couleur==joueur.couleur && grille[i+1][j].JetonCourant.couleur==joueur.couleur&& grille[i+2][j].JetonCourant.couleur==joueur.couleur && grille[i+3][j].JetonCourant.couleur==joueur.couleur){
                        valeur=1;
                        break;
                    }
                }
            }
        }
       
        //diagonale qui monte
        for(i=0;i<3;i++){
            if (valeur==1){
                break;
            }
            for(j=0;j<4;j++){
                if (presenceJeton(i, j)&&presenceJeton(i+1, j+1)&&presenceJeton(i+2, j+2)&&presenceJeton(i+3, j+3)==true){
                    if (grille[i][j].JetonCourant.couleur==joueur.couleur && grille[i+1][j+1].JetonCourant.couleur==joueur.couleur && grille[i+2][j+2].JetonCourant.couleur==joueur.couleur && grille[i+3][j+3].JetonCourant.couleur==joueur.couleur){
                        valeur=1;
                        break;
                    }
                }
            }
        }
       
        //diagonale qui descend
        for(i=0;i<3;i++){
            if (valeur==1){
                break;
            }
            for(j=6;j>2;j-- ) {
                if (presenceJeton(i, j)&& presenceJeton(i+1, j-1)&& presenceJeton(i+2, j-2)&&presenceJeton(i+3, j-3)==true){
                    if (grille[i][j].JetonCourant.couleur==joueur.couleur && grille[i+1][j-1].JetonCourant.couleur==joueur.couleur && grille[i+2][j-2].JetonCourant.couleur==joueur.couleur && grille[i+3][j-3].JetonCourant.couleur==joueur.couleur){
                        valeur=1;
                        break;
                    }
                }
            }
        }
        if (valeur==1){
            return true;
        }
        else{ //sinon
            return false;
        }
    }
   
   
     public void tasserColonne(int colonne) {
         int j= colonne;
         for(int i=0; i<5; i++){
             if (grille[i][j].JetonCourant == null) {
                grille[i][j].JetonCourant = grille[i + 1][j].JetonCourant;
                grille[i + 1] [j]. JetonCourant= null;
            }
         }
    }
     
    public boolean colonneRemplie(int colonne) {
       
        boolean res = true;
        for (int i = 0; i < 6; i++) {
            if (grille[i][colonne].JetonCouran==null){
                return false;
            }else {
                return true;
            }
        }
   
    }
    //on appelle des méthodes déjà existantes dans CelluleDeGrille
    public boolean presenceTrouNoir ( int ligne, int colonne) {
       
        return grille[ligne][colonne].presenceTrouNoir();
    }
   
    public boolean placerTrouNoir (int ligne , int colonne) {
       return grille[ligne][colonne].placerTrouNoir();
    }
   
    public boolean supprimerTrouNoir (int ligne , int colonne){
        return grille[ligne][colonne].supprimerTrouNoir();
    }
   
    public boolean placerDesintegrateur (int ligne , int colonne){
        return grille[ligne][colonne].placerDesintegrateur();
    }
   
    public boolean supprimerDesintegrateur (int ligne , int colonne){
        return grille[ligne][colonne].supprimerDesintegrateur();
    }
   
    public boolean presenceDesintegrateur (int ligne , int colonne){
        return grille[ligne][colonne].precenseDesintegrateur();
    }
   
    public boolean supprimerJeton (int ligne , int colonne){
        return grille[ligne][colonne].supprimerJeton();
    }
   
    public boolean recupererJeton (int ligne , int colonne){
        return grille[ligne][colonne].recupererJeton();
    }
}

