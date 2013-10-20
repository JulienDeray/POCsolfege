/**
 * Created with IntelliJ IDEA.
 * Autor: julienderay
 * Company : SERLI
 * Date: 04/10/13
 * Time: 16:46
 */
package core;

import model.Hauteur;
import model.Octave;
import model.Puls;
import model.Touche;

public abstract class Conversion {

    public static final int multiplicateur = 4;

    public static double getTemps(Puls puls) {
        switch ( puls ) {
            case RONDE:
                return 16;
            case BLANCHE:
                return 8;
            case NOIRE:
                return 4;
            case CROCHE:
                return 2;
            case DCROCHE:
                return 1;
            default:
                return 0;
        }

    }

    public static double getHauteur(Hauteur hauteur) {
        switch ( hauteur ) {
            case DO:
                return 32.70;
            case DOD:
                return 34.65;
            case RE:
                return 36.71;
            case RED:
                return 38.89;
            case MI:
                return 41.20;
            case FA:
                return 43.65;
            case FAD:
                return 46.25;
            case SOL:
                return 49.00;
            case SOLD:
                return 51.91;
            case LA:
                return 55.00;
            case LAD:
                return 58.27;
            case SI:
                return 61.74;
            case SOUPIRE:
                return 1;
            default:
                return 0;
        }
    }

    public static double fromBPMtoSec(int bpm) {
        return 60 * Math.pow(bpm, -1);
    }

    public static String getTouche(Touche touche) {
        switch ( touche ) {
            case F1:
                return "    F1  |   |   |";
            case F2:
                return "    |   F2  |   |";
            case F3:
                return "    |   |   F3  |";
            case F4:
                return "    |   |   |   F4";
            case NONE:
                return "    |   |   |   |";
            default:
                return "-- ERROR --";
        }
    }

    public static double getOctave(Octave octave) {
        switch ( octave ) {
            case O0:
                return 1;
            case O1:
                return 2;
            case O2:
                return Math.pow(2, 2);
            case O3:
                return Math.pow(2, 3);
            case O4:
                return Math.pow(2, 4);
            case O5:
                return Math.pow(2, 5);
            case O6:
                return Math.pow(2, 6);
            case O7:
                return Math.pow(2, 7);
            default:
                return 1.;
        }
    }
}
