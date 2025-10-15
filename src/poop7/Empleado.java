package poop7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class Empleado{
    private String nombre;
    private int numEmpleado;
    private double sueldo;

    // Sobrecarga
    public Empleado() {
    }

    public Empleado(String nombre, int numEmpleado, double sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double aumentarSueldo(int porcentaje){
        sueldo+=sueldo*porcentaje/100;
        return sueldo;
    }
    
    //Spbreescritura
    @Override
    public String toString(){
        return "nombre="+nombre+" numEmpleado: "+numEmpleado+" sueldo="+sueldo;
    }
    
    
    
}
