
package com.krupf;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author LaboratorioLTI3
 */
public class JNumberField extends JTextField implements KeyListener{
    
    public JNumberField(){
        this.setSize(120, 20);
        this.setFont(new Font("Cambria", Font.PLAIN,12));
        this.addKeyListener(this);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        if( !(caracter >= '0' && caracter <= '9'))
        {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
}
