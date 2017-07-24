/**
 * Clase Coordenadas.
 * Posiciona y mueven las naves y los disparos.
 * @author JoseM Coca de la Torre
 * version 2012
 */
public class Coordenada {
  //coordendas
  private int x,y;
  /**
   * Constructor de la clase Coordenda
   * @param fila y
   * @param columna x
   */
  public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
  }

  // consultas
  public int getX() {return x;}  //devuelve Coordenada x
  public int getY() {return y;}  //devuelve Coordenada y 
  
  //Metodos de movimiento de las piezas
  
  public void mueveX(int i) {x+=i;} // Movimiento horizontal
  public void mueveY(int i) {y+=i;} // Movimiento Vertical
}
