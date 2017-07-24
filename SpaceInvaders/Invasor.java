import java.awt.Color;
import java.awt.Graphics;
/**
 * Clase invasor
 * formada por cuatro cuadrados
 * de color verde
 * 
 * @author JMCoca
 * @version 2012
 */
public class Invasor extends Nave
{
    public int estado;
    /**
     * Constructor del defensor.
     * @param posicion Coordenadas en el tablero
     */
    public Invasor (Coordenada posicion){
        super(posicion);
    }  
    
    /**
     * posiciona la pieza en el tablero (la pinta)
     * @param g. 
     */
    
    public void pintar(Graphics g){
        int x =posicion.getX();
        int y =posicion.getY();
        g.setColor(Color.green);
        g.fill3DRect(x*escala ,(y*escala) ,escala,escala,true);
        g.fill3DRect( (x+1)*escala ,(y*escala) ,escala,escala,true);
        g.fill3DRect( (x-1)*escala ,(y*escala) ,escala,escala,true);
        g.fill3DRect( (x*escala) ,(y+1)*escala ,escala,escala,true);
    }
}