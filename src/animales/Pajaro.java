package animales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo02alu09
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    Pajaro(){
    }
    public Pajaro(String nombre, String lugarOrigen, String color, int numAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numAlas);
        this.tipoPico = tipoPico;
    }


    public String getTipoPico() {
        return tipoPico;
    }
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public void recolectarRamas(){
        System.out.println("'Recolectando ramitas'");
    }

    @Override
    public String toString(){
        return super.toString()+", " + "tipo de Pico:" + tipoPico + '}';
    }
}
