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
public class Empleado {

    private String nombre, cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, int edad, String cedula, boolean casado, double salario) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {

        this.nombre = "";
        this.cedula = "";
        this.edad = 0;
        this.casado = true;
        this.salario = 0.0;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void Informacion() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre y apellido:");
        cedula = JOptionPane.showInputDialog(null, "Ingrese su cedula:");
        edad =pedirEdad();
        casado = EstadoCivil();

        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su salario"));
    }

    @Override
    public String toString() {
        return """
               Empleado:
               Nombre Completo=""" + this.getNombre() + "\n"
                + "Cedula=" + this.getCedula() + "\n"
                + "Edad= " + this.getEdad() + "\n"
                + "Casado=" + this.isCasado() + "\n"
                + "Salario=" + this.getSalario() + '}';
    }
    public int pedirEdad(){
    int annios= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
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
            case 1 -> casado = true;
            case 2 -> casado = false;
            default -> {
                try {
                    if (estado <2 ) {
                        JOptionPane.showMessageDialog(null, "opcion "
                                + "ingresada no esta autorizada");
                        
                    } else {
                        throw new Exception("Error ");
                    }
                }catch (Exception ex) {
                    
                    JOptionPane.showMessageDialog(null, ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                    EstadoCivil();
                }
                
            }
        }
        return casado;
    }
}
       
    



