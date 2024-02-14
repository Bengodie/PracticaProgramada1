/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author indir
 */
public abstract class Persona {

   private String nombre;
    String cedula;
    int edad;
    boolean casado;

    public Persona(String nombre, String cedula, int edad, boolean casado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
    }

    public Persona() {
        this.nombre = "";
        this.cedula = "";
        this.edad = 0;
        this.casado = true; 
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    

    public int pedirEdad() {
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

    public boolean EstadoCivil() {
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
                    if (estado < 2) {
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

    @Override
    public String toString() {
        return """
               Persona
                Nombre=""" + nombre
                + "\nCedula=" + cedula
                + "\nEdad=" + edad
                + "\nCasado=" + casado ;
    }

    public abstract double Bono();
    
}
