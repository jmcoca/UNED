
import java.awt.Color;
/**
 * Clase disparo subclase de bala
 * 
 * @author JMCoca
 * @version 2011
 */
public class Disparo extends Balas {
  /**
   * Constructor del defensor.
   * @param posicion Coordenadas en el tablero
   */
  public Disparo(Coordenada posicion) {
        super(posicion);
        color = Color.red; 
  }

}
