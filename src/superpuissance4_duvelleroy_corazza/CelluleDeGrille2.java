/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_duvelleroy_corazza;

/**
 *
 * @author valen
 */
class CelluleDeGrille2 {

    boolean presenceTrouNoir;

    public CelluleDeGrille2() {
        this.JetonCourant = null;
        this.AvoirTrouNoir = false;
        this.avoirDesintegrateur = false;
    }

    Jeton JetonCourant;
    private boolean AvoirTrouNoir;
    private boolean avoirDesintegrateur;

    public boolean affecterJeton(Jeton J) {
        if (JetonCourant == null) {
            JetonCourant = J;
            return true;
        } else {
            return false;
        }
    }

    public String lireCouleurDuJeton() {
        return JetonCourant.Couleur;
    }

    public boolean placerTrouNoir() {
        if (AvoirTrouNoir == false) {
            AvoirTrouNoir = true;
            return true;
        } else {
            return false;
        }

    }

    public boolean presenceTrouNoir() {
        if (AvoirTrouNoir == true) {
            return true;
        } else {
            return false;
        }
    }

    public Jeton recupererJeton() {
        return JetonCourant;
    }

    public void supprimerJeton() {
        if (JetonCourant != null) {
            JetonCourant = null;
        }
    }

    public boolean presenceDesintegrateur() {
        return avoirDesintegrateur;
    }

    public boolean placerDesintegrateur() {
        if (avoirDesintegrateur == false) {
            avoirDesintegrateur = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean supprimerDesintegrateur() {
        if (avoirDesintegrateur == true) {
            avoirDesintegrateur = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean activerTrouNoir() {
        if (AvoirTrouNoir == true) {
            this.supprimerJeton();
            this.supprimerTrouNoir();
            return true;
        } else {
            return false;
        }
    }

    public boolean supprimerTrouNoir() {
        if (AvoirTrouNoir == true) {
            AvoirTrouNoir = false;
            return true;
        } else {
            return false;
        }
    }
}
