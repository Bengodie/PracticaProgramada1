/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaprogramada1;

import java.util.ArrayList;
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
        Bienvenida b = new Saludo();
        ArrayList empleados = new ArrayList<>();
        int opcion;
        b.saludo();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    Seleccione una opción:
                    1.Ingresar Empleado regular
                    2.Ingresar Programador
                    3.Ingresar Programador Senior
                    0. Salir
                    """)
            );

            switch (opcion) {
                case 1 -> {
<<<<<<< HEAD

                    Empleado e = new Empleado(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                            JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                            pedirEdad(),
                            EstadoCivil(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario")));

=======
                    
                  
                    Empleado e = new Empleado();
                    e = new Empleado(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                    JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                    pedirEdad(),
                    EstadoCivil(),
                    Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario")),
                    e.clasificarEdad());
                    
                   
>>>>>>> 6359bcd3baaf68e9b7a8e3be39a04e70765de826
                    empleados.add(e);
                    JOptionPane.showMessageDialog(null, e.toString());

                }
                case 2 -> {
                    Programador p = new Programador();
                    p = new Programador(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                            JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                            pedirEdad(),
                            EstadoCivil(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario")),
<<<<<<< HEAD
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
=======
                            p.clasificarEdad(),
                           Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
>>>>>>> 6359bcd3baaf68e9b7a8e3be39a04e70765de826
                            JOptionPane.showInputDialog(null, "Ingrese su lenguaje dominante"),
                            p.Bono());

                    empleados.add(p);
                    JOptionPane.showMessageDialog(null, p.toString());
                }
                case 3 -> {
                    ProgramadorMaster pm = new ProgramadorMaster();
                    pm = new ProgramadorMaster(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                            JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                            pedirEdad(),
                            EstadoCivil(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario")),
<<<<<<< HEAD
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
=======
                           pm.clasificarEdad(),
                           Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
>>>>>>> 6359bcd3baaf68e9b7a8e3be39a04e70765de826
                            JOptionPane.showInputDialog(null, "Ingrese su lenguaje dominante"),
                            pm.Bono(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años de experiencia")));
                    empleados.add(pm);
                    JOptionPane.showMessageDialog(null, pm.toString());
                }
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Opción inválida. "
                            + "Por favor, seleccione nuevamente.");
            }
        } while (opcion != 0);
    }

    public static int pedirEdad() {
        int annios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        try {
            if (annios < 18) {
                JOptionPane.showMessageDialog(null, "La edad "
                        + "ingresada corresponde a un menor edad");
                pedirEdad();
            }
            if (annios > 45) {
                JOptionPane.showMessageDialog(null, "La edad "
                        + "ingresada no esta autorizada");
                pedirEdad();

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
        return annios;
    }

    public static boolean EstadoCivil() {
        boolean casado = true;
        int estado = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                        Esta casado
                                                        1. Si
                                                        2. No
                                                        """));
        try {

            if (estado == 1) {

                casado = true;
            }
            if (estado == 2) {

                casado = false;
            }
            if (estado > 2) {
                JOptionPane.showMessageDialog(null, "opcion "
                        + "ingresada no esta autorizada");
                EstadoCivil();

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            EstadoCivil();
        }
        return casado;

    
}

    }

