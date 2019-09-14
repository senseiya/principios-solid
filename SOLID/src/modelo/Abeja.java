/**
 * 25/08/2019 06:06:41 PM
 * Autor: Santiago Roa
 */
package modelo;

public class Abeja extends Insecto {

    public Abeja(String especie, String habitat) {
        this.especie = especie;
        this.habitat = habitat;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void comer() {
        System.out.println("Come polen de las flores.");
    }

    @Override
    public void caminar() {
        System.out.println("Tiene 6 patas para caminar.");
    }

    @Override
    public void defenderse() {
        System.out.println("Se defiende con su agijón");
    }

    @Override
    public void volar() {
        System.out.println("Tiene alas para volar.");
    }

}
