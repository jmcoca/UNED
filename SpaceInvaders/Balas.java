import java.awt.Color;
import java.awt.Graphics;
/**
 * Clases Balas. Super clase
 * para crear disparos de las naves
 * @param poscicion: Coordenadas del disparo
 * escala: escala para establecer el tamaño del disparo
 * color: Color del disparo.
 * @author JMCoca
 * @version 2014
 * 
 */
public class Balas {
  //campos
  private Coordenada posicion;
  private int escala;
  private int estado;
  protected Color color;

  /**
   * Construcor de la clase bala
   * @param posicio en el tablero
   * estado inicial vivo=1
   */
  public Balas(Coordenada posicion) {
       this.posicion = posicion;
       escala =16; //campo escala por siqueremos cambiar el tamañoe
       estado=1;
  }

  //consultas
  
  public int getCoordenadaX() {return posicion.getX();}
  public int getCoordenadaY() {return posicion.getY();}
  public int getEstado() {return estado;}

  /**
   * Control del movimiento Vertical de la bala
   * @param pasos que se desplaza hotizontalmente
   */
  public void moverVertical(int pasos) {
         this.posicion.mueveY(pasos);
  }

  /**
   * Nave Alcanzada
   * si es una bomba invasora y alcanza
   * al defensor
   * cambia de color a amarillo
   */
  public void naveAlcanzada() {
        estado=0;
        color=Color.yellow;
  }

    /**
   * pinta las balas
   * es un rectangulo de medidas la mitad
   * que un cuadrado de la nave.
   * el +4 es para centrarlo
   * en el morro de la nave
   */
  public void pintar(Graphics g) {
       g.setColor(color);
       g.fill3DRect((posicion.getX()*escala)+4,posicion.getY()*escala,escala/2,escala,true);
  }
}
