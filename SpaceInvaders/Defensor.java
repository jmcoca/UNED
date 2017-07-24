
import java.awt.Color;
import java.awt.Graphics;
/**
 * Clase defensor
 * LLama a la clase super
 * asigna color y forma
 * en este caso dos rectangulos
 * @author JMCoca
 * @version 2012
 */
public class Defensor extends Nave {
  /**
   * Constructor del defensor.
   * @param posicion Coordenadas en el tablero
   */
  public Defensor(Coordenada posicion) {
        super(posicion);
        color=Color.blue;
  }

  /**
   * posiciona la pieza en el tablero (la pinta)
   * @param g. 
   */
  public void pintar(Graphics g) {
        int x =posicion.getX();
        int y =posicion.getY();
        g.setColor(color);
        g.fill3DRect( x*escala,y*escala,escala,escala,true);
        g.fill3DRect(( (x-1)*escala),(y+1)*escala,escala*3,escala,true); 
  }

  /**
   * Nave Alcanzada
   */
  public void naveAlcanzada() {
      super.naveAlcanzada();  //llama al metodo de la super clase
      color = Color.yellow;       
  }

}
