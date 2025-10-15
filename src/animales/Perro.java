package animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }
    public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }


    public void hacerTrucos(){
        System.out.println("Dando la patita");
    }

    @Override
    public String toString(){
        return super.toString()+", " + "color de su collar:" + colorCollar + '}';
    }
}
