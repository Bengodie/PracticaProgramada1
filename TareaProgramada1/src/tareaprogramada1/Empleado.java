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
public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        super(nombre, cedula, edad, casado);
        this.salario = salario;
    }

    public Empleado() {
        this.salario = 0.0;
    }

    @Override
    public double Bono() {
        return 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSalario=" + this.getSalario() ;
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
       public static String clasificarEdad(int edad) {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }
   
}
