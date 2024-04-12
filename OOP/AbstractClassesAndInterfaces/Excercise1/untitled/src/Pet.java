//declare the superclass Pet
abstract class Pet{
    private final String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String voice();
}

//declare the subclasses Cat, Dog, Cow
class Cat extends Pet{

    public Cat(String name){
        super(name);
    }
    @Override
    public String voice(){
        return "Meow";
    }
}

class Dog extends Pet{

    public Dog(String name){
        super(name);
    }
    @Override
    public String voice(){
        return "Arf";
    }
}

class Cow extends Pet{

    public Cow (String name){
        super(name);
    }
    @Override
    public String voice(){
        return "Moo";
    }
}

