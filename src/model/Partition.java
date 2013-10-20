package model;

import core.Conversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Autor: julienderay
 * Company : SERLI
 * Date: 04/10/13
 * Time: 15:44
 */

public class Partition {

    private String titre;
    private double tempo;
    private List<Note> partition;

    private List<Hauteur> dieses;

    public Partition(String titre, int tempo) {
        this.titre = titre;
        this.tempo = Conversion.fromBPMtoSec( tempo );
        this.partition = new ArrayList<Note>();
    }

    public void setDieses(List<Hauteur> dieses) {
        this.dieses = dieses;
    }

    public void addNote( Note note ) {
        partition.add( note );
    }

    public void lire() throws InterruptedException {
        applyDieses();

        for ( Note note : partition ) {
            System.out.println( note.lire() );

            long time = (long) (tempo * ((long) (note.getTempsNum()) / (double) Conversion.multiplicateur) * 1000);
            //System.err.println( time );
            Thread.sleep( time );
        }
    }

    private void applyDieses() {
        for ( Hauteur diese : dieses ) {
            for ( Note note : partition ) {
                if ( note.getHauteur() == diese )
                    note.setDiese();
            }
        }
    }
}
