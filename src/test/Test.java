/**
 * Created with IntelliJ IDEA.
 * Autor: julienderay
 * Company : SERLI
 * Date: 04/10/13
 * Time: 16:03
 */
package test;

import core.Conversion;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        init();
        superMario();
    }

    private static void init() {
        System.out.println("    *   *   *   *");
        System.out.println("    |   |   |   |");
    }

    private static void testTempo() {
        System.out.println( Conversion.fromBPMtoSec(30) );
        System.out.println( Conversion.fromBPMtoSec(60) );
        System.out.println( Conversion.fromBPMtoSec(120) );
        System.out.println( Conversion.fromBPMtoSec(240) );
    }

    private static void auClairDeLaLune() throws InterruptedException {
        Partition partoch = new Partition("Au clair de la lune", 100);
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.DO, Touche.F1, Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.DO, Touche.F1, Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.DO, Touche.F1, Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.RE, Touche.F2, Octave.O3) );

        partoch.addNote( new Note(Puls.BLANCHE, Hauteur.MI, Touche.F3, Octave.O3) );
        partoch.addNote( new Note(Puls.BLANCHE, Hauteur.RE, Touche.F2, Octave.O3) );

        partoch.addNote( new Note(Puls.NOIRE, Hauteur.DO, Touche.F1 , Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.MI, Touche.F3 , Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.RE, Touche.F2 , Octave.O3) );
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.RE, Touche.F2 , Octave.O3) );

        partoch.addNote( new Note(Puls.NOIRE, Hauteur.DO, Touche.F1 , Octave.O3) );

        partoch.lire();
    }

    private static void superMario() throws InterruptedException {
        Partition partoch = new Partition("Super Mario Bros", 60);

        List<Hauteur> dieses = new ArrayList<Hauteur>();
        dieses.add( Hauteur.DO );
        dieses.add( Hauteur.FA );
        partoch.setDieses( dieses );

        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.SOLD, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SOLD, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.SOLD, Touche.F2, Octave.O3));
        partoch.addNote( new Soupire(Puls.DCROCHE) );
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.MI, Touche.F1, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SOL, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.MI, Touche.F4, Octave.O4));
        partoch.addNote( new Note(Puls.NOIRE, Hauteur.LA, Touche.F1, Octave.O3));

        partoch.addNote( new Note(Puls.CROCHE, Hauteur.RED, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.LA, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F1, Octave.O3));
        partoch.addNote( new Soupire(Puls.DCROCHE) );
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.DOD, Touche.F4, Octave.O3));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.DO, Touche.F3, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F2, Octave.O3));

        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F1, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F2, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F4, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.SOL, Touche.F1, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F4, Octave.O4));
        partoch.addNote( new Soupire(Puls.DCROCHE) );
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.RE, Touche.F1, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.MI, Touche.F2, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.DO, Touche.F1, Octave.O4));

        partoch.addNote( new Note(Puls.CROCHE, Hauteur.RED, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.LA, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F1, Octave.O3));
        partoch.addNote( new Soupire(Puls.DCROCHE) );
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F2, Octave.O3));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.DOD, Touche.F4, Octave.O3));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.DO, Touche.F3, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F2, Octave.O3));

        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F1, Octave.O3));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F2, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.SI, Touche.F4, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.SOL, Touche.F1, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.LA, Touche.F4, Octave.O4));
        partoch.addNote( new Soupire(Puls.DCROCHE) );
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.FA, Touche.F3, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.RE, Touche.F1, Octave.O4));
        partoch.addNote( new Note(Puls.DCROCHE, Hauteur.MI, Touche.F2, Octave.O4));
        partoch.addNote( new Note(Puls.CROCHE, Hauteur.DO, Touche.F1, Octave.O4));

        partoch.lire();
    }
}
