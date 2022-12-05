/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author valen
 */

public class Partie {
   
    private Joueur [] listeJoueurs= new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;
   
    public Partie(Joueur Joueur1, Joueur Joueur2){
        listeJoueurs[0]=Joueur1;
        listeJoueurs[1]=Joueur2;          
    }
   
    public void attribuerCouleurAuxJoueurs(){
        Random rdm=new Random();
        int nb;
        nb =rdm.nextInt(2); //choisi un nombre entre 1 et 2
        if (nb==1){
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        }else {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
        }
    }
    public void creerEtAffecterJeton(Joueur Joueur1){
        ArrayList<Jeton>jeton= new ArrayList();
        for(int i=0;i<30;i++){
        }
    }
    
   
    public void initialiserPartie(){
        
    
                
        
    }
           
}
