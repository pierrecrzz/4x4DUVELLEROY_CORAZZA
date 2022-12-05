/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

import java.util.ArrayList;

/**
 *
 * @author valen
 */
public class Joueur {

        private String nom;
        private String couleur;
        private ArrayList<Jeton> reserveJetons=new ArrayList();
        private int nombreDesintegrateurs;

   
    public Joueur (String nom){
       this.nom=nom ;
       this.nombreDesintegrateurs= 0;
    }
   
    public void affecterCouleur(String couleur){
        this.couleur=couleur;
    }
    public String lireCouleur(){
        return couleur;
    }
   
    public int nombreJetons (){
        return reserveJetons.size();
    }
   
    public void ajouterJetons(Jeton unJeton ){
        reserveJetons.add(unJeton);
    }
   
    public Jeton jouerJeton(){
        Jeton elvJeton = reserveJetons.remove(0);    
        return elvJeton;
    }
   
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs+=1;
    }
     
    public void utiliserDesintegrateur(){
        nombreDesintegrateurs-=1;
    }
       
    }   
