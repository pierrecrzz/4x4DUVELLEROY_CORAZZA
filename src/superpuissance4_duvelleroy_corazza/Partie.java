/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    public void creerEtAffecterJeton(Joueur Joueur1, Joueur Joueur2){
        ArrayList<Jeton>jeton= new ArrayList();
        for(int i=0;i<30;i++){
        }
    }
    
   
    public void placerTrousNoirsEtDesintegrateurs(){
        int trounoir = 5;
        int d = 2;
        int D = 3;
        Random r = new Random();
        CelluleDeGrille2[] listetn = new CelluleDeGrille2[5];
        while(trounoir > 0){
            int x = r.nextInt(6);
            int y = r.nextInt(7);
            if(plateau.presenceTrouNoir(x, y) == false){
                plateau.grille[x][y].placerTrouNoir();
                listetn[trounoir] = plateau.grille[x][y];
                trounoir --;
            }
        }
        while(d > 0){
            int x = r.nextInt(6);
            int y = r.nextInt(7);
            if(plateau.grille[x][y].presenceTrouNoir() == false && plateau.grille[x][y].presenceDesintegrateur() == false){
                plateau.grille[x][y].placerDesintegrateur();
                d--;
            }
        }
        
        while(D > 0){
            CelluleDeGrille2 cell = listetn[r.nextInt(listetn.length)];
            cell.placerDesintegrateur();
            D--;
        }
    }
        
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(joueurCourant, joueurCourant);
        placerTrousNoirsEtDesintegrateurs();
    }
    
    
    public void lancerPartie(){  
        int ans;
        int i=0;
        Scanner sc;
        System.out.print("Saisir pseudo 1er Joueur");
        sc= new Scanner(System.in);
        String nomJ1=sc.next();
        while(plateau.etreGagnantePourJoueur(listeJoueurs[0])==false&&plateau.etreGagnantePourJoueur(listeJoueurs[1])==false&&plateau.grilleRemplie()==false){
            if (i%2==0){
                joueurCourant=listeJoueurs[0];
                i+=1;
                
            }
             System.out.println("0>jouerjeton,1>recuperer,2>désintegrer");
            ans = sc.nextInt();
            plateau.afficherGrilleSurConsole();
        }
        boolean v1 = plateau.etreGagnantePourJoueur(listeJoueurs[0]);
        boolean v2 = plateau.etreGagnantePourJoueur(listeJoueurs[1]);
        if(v1&&!v2){
            System.out.println("Le joueur 1 gagne");
        }
        if(v2 &&!v1){
            System.out.println("Le joueur 2 gagne");
        }
        if (v1 && v2){
            if(listeJoueurs[0] == joueurCourant){
                System.out.println("Le joueur 2 gagne");
            }else{
                System.out.println("Le joueur 1 gagne");
            }
        }
        if (v1&&v2){
            if(listeJoueurs[1] == joueurCourant){
                System.out.println("Le joueur 1 gagne");
            }else{
                System.out.println("Le joueur 2 gagne");
            }
        
        }
    }
}
        
