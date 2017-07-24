import java.awt.Color;
/**
 * Clase padre de las naves
 * tiene un estado (vivo o muerto)
 * @param escala: por si nos interesan otras dimensiones en el juego.
 * @param posicion: Coordendas para situar la nave en el plano
 * @author JMCoca
 * @version 2012
 */
public class Nave {
  protected int estado, escala;     //campos
  protected Coordenada posicion;
  protected Color color;

  public Nave(Coordenada posicion) {  //constructor
      this.posicion = posicion;
      escala=16;
      estado=1; // en principio nave estado vivo
  }

  // consultas
  public int getCoordenadaX() {return posicion.getX();}
  public int getCoordenadaY() {return posicion.getY();}
  public int getEstado() {return estado;}

  /**
   * Control del movimiento Horizontal de la nave
   * @param pasos que se desplaza hotizontalmente
   */
  public void moverHorizontal(int pasos) {
        posicion.mueveX(pasos);
  }

  /**
   * Control del movimiento Vertical de la nave
   * @param pasos que se desplaza Verticalmente
   */
  public void moverVertical(int pasos) {
        posicion.mueveY(pasos);
  }

  /**
   * Cambio de estado
   * @param 1 o 0 Vivo/muerto
   */
  public void setEstado(int i) {
        estado = i;
  }

  /**
   * Nave Alcanzada
   * Cuando una nave
   * es alcanzada estado muerto=0;
   */
  public void naveAlcanzada() {
        estado = 0;
  }

}