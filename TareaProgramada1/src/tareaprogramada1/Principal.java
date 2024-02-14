/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author indir
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hola soy indira esto es una prueba
        //hola soy diego esto es una prueba
        Empleado e = new Empleado();
     
      int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    Seleccione una opción:
                    1.Ingresar Empleado regular
                    2.Ingresar Programador
                    3.Ingresar Programador Senior
                    0. Salir
                                                                  1 holaaaaaaaaa""")
            );
               
            switch (opcion) {
                case 1 -> { 
                    e.Informacion();
                    
                    JOptionPane.showMessageDialog(null, e.toString(), "Mostrar Datos", JOptionPane.INFORMATION_MESSAGE);
                }case 2 ->{ 
                    //programador
                }case 3 ->{ 
                    //Programador Senior
                }case 0 ->{ 
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                }default ->
                    JOptionPane.showMessageDialog(null, "Opción inválida. "
                            + "Por favor, seleccione nuevamente.");}
        }while (opcion != 0); 
    }
}
   

