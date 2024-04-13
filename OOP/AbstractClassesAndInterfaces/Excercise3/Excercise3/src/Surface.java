
//declare the interface Surface
interface Surface {
    double area();
}

//declare its implementing classes Floor, Tower, Sphere
class Floor implements Surface{
    private final double a;
    private final double b;
    public Floor(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double area(){
        return this.a * this.b;
    }
}

class Tower implements Surface {
    private final double r;
    private final double h;

    public Tower(double r, double h){
        this.r = r;
        this.h = h;
    }

    @Override
    public double area(){
        return 2 * Math.PI * this.r * this.h;
    }
}

class Sphere implements Surface{
    private final double r;

    public Sphere (double r){
        this.r = r;
    }

    @Override
    public double area(){
        return 4 * Math.PI * Math.pow(this.r, 2);
    }
}