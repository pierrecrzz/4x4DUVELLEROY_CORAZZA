/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

/**
 *
 * @author valen
 */
public class Jeton {

    String Couleur;
       
    public Jeton (String Couleur) {
        this.Couleur = Couleur ;
    //constructeur qui initialise la couleur selon le paramètre
    }
 
    public String lireCouleur(){
        //on renvoie soit jaune soit rouge
        return Couleur ;
    }

    @Override
    public String toString() {
        if (Couleur== "rouge"){
            return "R";
        }else{      
            return "J";
        }
       
    }

   
}
