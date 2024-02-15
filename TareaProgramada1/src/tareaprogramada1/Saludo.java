/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramada1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author indir
 */
public class Saludo implements Bienvenida{
    @Override
    public void saludo(){
          JOptionPane.showMessageDialog(null, """
                                              Bienvenido a la plataforma
                                                  FideSoluciones""", "Entrada", JOptionPane.PLAIN_MESSAGE, 
                  new  ImageIcon("src/img/logo.png"));
}
}
