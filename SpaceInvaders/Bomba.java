import java.awt.Color;
/**
 * clase Bomba
 * @author JMCoca
 * @version 2017
 * 
 */
public class Bomba extends Balas {
  /**
   * Constructor del defensor.
   * @param posicion Coordenadas en el tablero
   */
  public Bomba(Coordenada posicion) {
        super(posicion);   
        color = Color.magenta; //Color de la bomba
    }
}
