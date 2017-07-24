import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Clase Principal. LLama a la Clase PanelDeJuego
 * @autor JmCoca
 * @version mayo 2012
 */
public class SpaceInvader_IGU{
    //CAMPOS
    private JFrame ventana;
    private PanelDeJuego panelDeJuego;
    /**
     * Programa
     */
    public static void main(String args[]){ new SpaceInvader_IGU();}

    /**
     * Ejecuta la aplicacion
     * la muestra en pantalla
     */
    public SpaceInvader_IGU(){
        construirVentana();
        while (!panelDeJuego.juegoFin()){
            ejecutar();
        }
    }

    /**
     * Crea la ventana Swing y su contenido.
     */
    private void construirVentana()
    {
        ventana = new JFrame("Invasores del Espacio JMCoca Beta");
        ventana.setResizable(false);
        panelDeJuego = new PanelDeJuego(); // panel de Juego
        ventana.add(panelDeJuego);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.addKeyListener(new KeyAdapter() 
           {//control de teclas
                public void keyPressed(KeyEvent e) {

                    if(e.getKeyCode()==KeyEvent.VK_O){
                         panelDeJuego.movHorizontal(-1);//desplazamiento a la izquierda
                    }else   if(e.getKeyCode()==KeyEvent.VK_P){
                        panelDeJuego.movHorizontal(1);//desplazamiento a la derecha
                    }else if(e.getKeyCode()==KeyEvent.VK_Q){
                        panelDeJuego.movVertical(-1);//desplazamiento a la arriba
                    
                    }else if(e.getKeyCode()==KeyEvent.VK_A){
                        panelDeJuego.movVertical(1);//desplazamiento abajo
                    	
                    }
                    else   if(e.getKeyCode()==KeyEvent.VK_SPACE){
                        if (!panelDeJuego.hayDisparo()){
                            panelDeJuego.disparaDefensor();
                        }
                    }
                }
        });
        //para que la aplicacion aparezca al inicio en el centro de la pantalla
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        ventana.setLocation(d.width/2 - ventana.getWidth()/2, d.height/2 - ventana.getHeight()/2);
        
        ventana.setVisible(true);
    }

   /**
    * LLamada al bucle del juego
    * primero un pausa de 1/2 segundo
    */
    public void ejecutar(){
        wait(500);//pausa anterior a que comienze el juego
        while (!panelDeJuego.juegoFin()){
            panelDeJuego.movimientosJuego();
            wait(200);                          //control de la velocidad del juego
            panelDeJuego.disparaInvasor();
         }
   }
    
   /**
     * Para controlar el timer
     * @param tiempo en milisegundos
     */    
    public void wait(int milliseconds){
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (InterruptedException e)
        {
            // ignoring exception at the moment
        }
    }
}
