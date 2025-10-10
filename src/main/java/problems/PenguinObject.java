/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package problems;

/**
 *
 * @author Legop
 */
public enum PenguinObject {
    species,
    height,
    weight,
    diet,
    eggs;

    private String value;

    PenguinObject() {
        // Default constructor for enum constants without value
    }

    PenguinObject(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value != null ? value : name();
    }

    public static PenguinObject getSpecies() {
        return species;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public static void setSpecies(String value) {
        species.setValue(value);
    }

    public static void setHeight(String value) {
        height.setValue(value);
    }
    
}

class Penguin{

    public static void main(String[] args) {
        PenguinObject.setSpecies("Lil Penguin");
        PenguinObject species = PenguinObject.species;
        System.out.println("Penguin attribute: " + species);


        
    }


    
}