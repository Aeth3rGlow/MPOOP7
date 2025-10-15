package animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class AnimalAereo extends Animal{
    private int numAlas;

    AnimalAereo(){
    }
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }


    public int getNumAlas() {
        return numAlas;
    }
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }


    public void volar(){
        System.out.println("'Volando por los cielos'");
    }
    public void comer(){
        System.out.println("'Comiendo'");
    }
}
