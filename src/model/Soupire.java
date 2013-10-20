/**
 * Created with IntelliJ IDEA.
 * Autor: julienderay
 * Company : SERLI
 * Date: 14/10/2013
 * Time: 13:55
 */
package model;

public class Soupire extends Note {
    public Soupire(Puls temps) {
        super(temps, Hauteur.SOUPIRE, Touche.NONE, Octave.O0);
    }
}
