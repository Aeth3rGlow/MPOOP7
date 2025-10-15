/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import animales.*;
/**
 *
 * @author poo02alu09
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 18, 30000);
        System.out.println(emp1.getNombre());
        System.out.println(emp1.toString());
        System.out.println("El sueldo del empleado fue aumentado un 15%, el sueldo ahora es de $"+emp1.aumentarSueldo(15));

        // Gerente
        System.out.println("\nGerente");
        Gerente emp2 = new Gerente(200000, "Luis", 20, 40000);
        System.out.println(emp2.toString());

        // Ballena
        System.out.println("\nBallena");
        Ballena ballena1 = new Ballena("moby", "Atlantico", "gris", 3, 20);
        ballena1.pelearconPinocho();
        System.out.println(ballena1.toString());
        ballena1.sonido();

        // Pajaro
        System.out.println("\nPajarro");
        Pajaro pajaro1 = new Pajaro("Fede", "Canada", "cafe y rojo", 2, "Alargado");
        pajaro1.recolectarRamas();
        System.out.println(pajaro1.toString());
        pajaro1.sonido();

        // Perro
        System.out.println("\nPerro");
        Perro perro1 = new Perro("Firu", "CDMX", "cafe con negro", 4, "rojo");
        perro1.hacerTrucos();
        System.out.println(perro1.toString());
        perro1.sonido();

    }
}
