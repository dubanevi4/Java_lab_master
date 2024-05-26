package Excercise3;
import javax.swing.text.html.Option;
import java.util.Scanner;

//declare a parameterized interface Higher
interface Higher<T> {
    boolean isHigher(T object);
}

//update the class header
class Product implements Higher<Product>{
    private final String name;
    private final int price;

    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Product(Scanner sc) {
        name = sc.next();
        price = sc.nextInt();
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean isHigher(Product product) {
        return name.compareTo(product.name) < 0;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

//update the class header
class Purchase implements Higher<Purchase>{
    private final Product product;
    private final int number;

    public Purchase(Product product, int number) {
        super();
        this.product = product;
        this.number = number;
    }

    public Purchase(Scanner sc) {
        product = new Product(sc);
        number = sc.nextInt();
    }

    public int getCost() {
        return product.getPrice() * number;
    }

    @Override
    public boolean isHigher(Purchase purchase) {
        return getCost() > purchase.getCost();
    }

    @Override
    public String toString() {
        return "Purchase [product=" + product + ", number=" + number + ", getCost()=" + getCost() + "]";
    }

}

class Solution3 {
    //declare a static method getHighest
    //that accepts an array of objects of the type parameter T
    //and returns the highest element of the array.
    public static <T extends Higher<T>> T getHighest(T[] objects){
        try {
            if (objects.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Wrong data");
            }
            T maxObject = objects[0];
            for (T object : objects) {
                if (object.isHigher(maxObject)) {
                    maxObject = object;
                }
            }
            return maxObject;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return null;
    }
}