//declare the interface Sound
interface Sound{
    String sound();
}

//declare the superclass Pet and its subclasses Cat, Dog, Cow
abstract class Pet implements Sound{
}

class Cat extends Pet{
    @Override
    public String sound(){
        return "Meow";
    }
}


class Dog extends Pet{
    @Override
    public String sound(){
        return "Arf";
    }
}

class Cow extends Pet{
    @Override
    public String sound(){
        return "Moo";
    }
}

//declare the classes Locomotive and Surprise
class Locomotive implements Sound{
    private final int year;

    public Locomotive(int year){
        this.year = year;
    }
    @Override
    public String sound(){
        return (this.year < 1981) ? "Choo-Choo" : "Choo-oo-oo";
    }
}

class Surprise implements Sound{
    private final int level;

    public Surprise(int n){
        this.level = n;
    }
    @Override
    public String sound(){
        return "Wow".repeat(level);
    }
}