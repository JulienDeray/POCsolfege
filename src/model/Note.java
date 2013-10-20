package model;

import core.Conversion;

/**
 * Created with IntelliJ IDEA.
 * Autor: julienderay
 * Company : SERLI
 * Date: 04/10/13
 * Time: 15:47
 */

public class Note {

    private Puls temps;
    private Hauteur hauteur;
    private Touche touche;
    private Octave octave;

    private double tempsNum;
    private double hauteurNum;
    private String toucheStr;
    private double octaveNum;

    public Note(Puls temps, Hauteur hauteur, Touche touche, Octave octave) {
        this.temps = temps;
        this.hauteur = hauteur;
        this.touche = touche;
        this.octave = octave;
        this.tempsNum = Conversion.getTemps( temps );
        this.hauteurNum = Conversion.getHauteur( hauteur );
        this.toucheStr = Conversion.getTouche( touche );
        this.octaveNum = Conversion.getOctave( octave );
    }

    public String lire() {
        return this.toString();
    }

    public double getTempsNum() {
        return tempsNum;
    }

    public int getFrequence() {
        return (int) (hauteurNum * octaveNum);
    }

    public Hauteur getHauteur() {
        return this.hauteur;
    }

    @Override
    public String toString() {
        return toucheStr + "     -> " + hauteur + " | " + temps + " | " + getFrequence();
    }

    public void setDiese() {
        switch ( hauteur ) {
            case DO:
                hauteur = Hauteur.DOD;
                hauteurNum = Conversion.getHauteur( Hauteur.DOD );
                break;
            case DOD:
                hauteur = Hauteur.RE;
                hauteurNum = Conversion.getHauteur( Hauteur.RE );
                break;
            case RE:
                hauteur = Hauteur.RED;
                hauteurNum = Conversion.getHauteur( Hauteur.RED );
                break;
            case RED:
                hauteur = Hauteur.MI;
                hauteurNum = Conversion.getHauteur( Hauteur.MI );
                break;
            case MI:
                hauteur = Hauteur.FA;
                hauteurNum = Conversion.getHauteur( Hauteur.FA );
                break;
            case FA:
                hauteur = Hauteur.FAD;
                hauteurNum = Conversion.getHauteur( Hauteur.FAD );
                break;
            case FAD:
                hauteur = Hauteur.SOL;
                hauteurNum = Conversion.getHauteur( Hauteur.SOL );
                break;
            case SOLD:
                hauteur = Hauteur.LA;
                hauteurNum = Conversion.getHauteur( Hauteur.LA );
                break;
            case LA:
                hauteur = Hauteur.LAD;
                hauteurNum = Conversion.getHauteur( Hauteur.LAD );
                break;
            case LAD:
                hauteur = Hauteur.SI;
                hauteurNum = Conversion.getHauteur( Hauteur.SI );
                break;
            case SI:
                hauteur = Hauteur.DO;
                hauteurNum = Conversion.getHauteur( Hauteur.DO );
                break;

        }
    }
}
