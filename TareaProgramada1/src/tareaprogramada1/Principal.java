/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaprogramada1;

import java.util.ArrayList;
import java.util.Iterator;

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
        Bienvenida b=  new Saludo();
       
       
        int opcion;
        b.saludo();
         ArrayList empleados = new ArrayList<>();
        
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
                    
                  
                    Empleado e = new Empleado();
                    e = new Empleado(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                    JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                    pedirEdad(),
                    EstadoCivil(),
                    Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario")),
                    e.clasificarEdad());
                    
                      JOptionPane.showMessageDialog(null, e.toString());

                   int preg = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                 ¿desea aumentar el salario del empleado? 
                                                                                 1. si 
                                                                                 2. no"""));
                     if(preg ==1){
                     e.aumentarSalario(  Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el porcentaje de aumento con base al salario")));
                     JOptionPane.showMessageDialog(null, e.toString());
                     }if(preg==2){
                           JOptionPane.showMessageDialog(null, "su salario queda igual");
                     }else{
                         
                     }
                        empleados.add(e);
                }

               case 2 -> {
                    Programador p= new Programador();
                    p= new Programador(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                            JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                            pedirEdad(),
                            EstadoCivil(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario")),
                            p.clasificarEdad(),
                           Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
                            JOptionPane.showInputDialog(null, "Ingrese su lenguaje dominante"),
                            p.Bono());
                            
                    empleados.add(p);
                         JOptionPane.showMessageDialog(null, p.toString());
                }
                case 3 -> {
                   ProgramadorMaster pm= new ProgramadorMaster(); 
                   pm=  new ProgramadorMaster(JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:"),
                            JOptionPane.showInputDialog(null, "Ingrese su cedula:"),
                            pedirEdad(),
                            EstadoCivil(),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario")),
                           pm.clasificarEdad(),
                           Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total de lineas trabajadas por hora")),
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
        Iterator<Empleado> nomIt = empleados.iterator();
        while (nomIt.hasNext()) {
            Empleado s = nomIt.next();
            System.out.print(s + " / ");
    }
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
        switch (estado) {
            case 1 ->
                casado = true;
            case 2 ->
                casado = false;
            default -> {
                try {
                    if (estado > 2) {
                        JOptionPane.showMessageDialog(null, "opcion "
                                + "ingresada no esta autorizada");

                    } else {
                        throw new Exception("Error ");
                    }
                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                    EstadoCivil();
                }

            }
        }
        return casado;
    }
    
    
}


