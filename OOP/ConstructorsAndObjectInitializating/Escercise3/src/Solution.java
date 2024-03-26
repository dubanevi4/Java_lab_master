import java.util.Locale;
import java.util.Scanner;


class Material {
    //declare private instance constants: name and density
    private final String name;
    private final double density;

    //declare and implement the parameterized constructor
    public Material(String name, double density){
        this.name = name;
        this.density = density;
    }

    //declare getters and implement them
    public String getName(){
        return this.name;
    }

    public double getDensity(){
        return this.density;
    }

    //do not change the toString() code
    @Override
    public String toString() {
        return String.format("%s;%.1f", name, density);
    }
}

class Subject {

    //declare private instance fields: name, material, and volume
    private String name;
    private Material material;
    private double volume;

    //declare and implement the parameterized constructor
    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    //declare getters/setters and implement them
    public String getName(){
        return this.name;
    }

    public Material getMaterial(){
        return this.material;
    }

    public double getVolume(){
        return this.volume;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMaterial(Material material){
        this.material = material;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    //implement the method
    public double getMass() {
        //put your code here
        return this.volume * this.material.getDensity();
    }

    //do not change the toString() code
    @Override
    public String toString() {
        return String.format("%s;%s;%.2f;%.1f", name, material, volume, getMass());
    }

}

class Solution {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) {
            //input material’s name and density
            String materialName = sc.next();
            double densityOfMaterial = sc.nextDouble();

            //input subject’s name and volume
            String subjectName = sc.next();
            double subjectVolume = sc.nextDouble();

            //create a Subject instance that consists of the given material with input values
            Material materialOfSubject = new Material(materialName,densityOfMaterial);
            Subject sub = new Subject(subjectName,materialOfSubject,subjectVolume);

            //output a Subject instance
            System.out.printf("%s ",sub.toString());

            //update a subject material by the "copper" whose density is 8500.0
            sub.setMaterial(new Material("copper",8500.0));

            //output the mass of the updated subject to 2 decimal places after a space character
            System.out.printf("%.2f", sub.getMass());
        }
    }
}


