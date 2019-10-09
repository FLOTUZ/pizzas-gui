
package pizzas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class PanelImagen extends javax.swing.JPanel {
    ImageIcon fondo;
    
    public PanelImagen() {
        initComponents();
        fondo = new ImageIcon(getClass().getResource("fondo.jpg"));
    }
    //Agregamos este metodo para repintar la imagen
    //para que cuando pase ina ventana sobre el cuadro de dialogo
    //la imagen n se pierda
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Para obtener el tamaño de un componente
        Dimension dimension = this.getSize();
        
        g.drawImage(fondo.getImage(), 0, 0, dimension.width, dimension.height, null);
    }

    public void fijarTam(Dimension d){
        // Setea el tamaño
        this.setSize(d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
