class Product {
    //declare instance constants name and price
    private final String name;
    private final int price;

    //declare a parameterized constructor
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //declare getters
    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    //declare toString
    public String toString(){
        return String.format("%s [name=%s, price=%d]",getClass().getName(),this.name,this.price);
    }
}

class Purchase {
    //declare instance constants product and number
    private final Product product;
    private final int number;

    //declare a parameterized constructor
    public Purchase(Product product, int number){
        this.product = product;
        this.number = number;
    }

    //declare getters
    public Product getProduct(){
        return this.product;
    }

    public int getNumber(){
        return this.number;
    }

    //do not change signatures of methods
    protected int getFinalCost(int baseCost) {
        return baseCost;
    }

    public final int getCost() {
        int baseCost = product.getPrice() * getNumber(); //replace 0 by a product of price by number
        return getFinalCost(baseCost);
    }

    protected String fieldsToString() {
        //replace returned expression by Java code in the given format
        //return product and number
        return " ["
                + "product=" + getProduct()
                + ", number=" + getNumber()
                + ", getCost()=" + getCost() + "]";
    }

    @Override
    public final String toString() {
        //replace returned expression by Java code in the given format
        //return class_name_part + fieldsToString() + getCost_part
        return getClass().getName() + fieldsToString();
    }
}

class TransportExpencesPurchase extends Purchase {
    //declare instance constant expences
    private final int expenses;

    //declare a parameterized constructor
    public TransportExpencesPurchase(Product product, int number, int expenses){
        super(product,number);
        this.expenses = expenses;
    }

    //do not change signatures of methods
    @Override
    protected int getFinalCost(int baseCost) {
        //put your code here
        return baseCost + expenses;
    }

    @Override
    protected String fieldsToString() {
        //put your code here
        return " ["
                + "product=" + getProduct()
                + ", number=" + getNumber()
                + ", expences=" + expenses
                + ", getCost()=" + getCost() + "]";
    }
}

class PriceDiscountPurchase extends Purchase {
    //declare instance constant discount
    private final int discount;

    //declare a parameterized constructor
    public PriceDiscountPurchase(Product product, int number,int discount){
        super(product,number);
        this.discount = discount;
    }

    //do not change signatures of methods
    @Override
    protected int getFinalCost(int baseCost) {
        //put your code here
        return baseCost - discount * getNumber();
    }

    @Override
    protected String fieldsToString() {
        //put your code here
        return " ["
                + "product=" + getProduct()
                + ", number=" + getNumber()
                + ", discount=" + discount
                + ", getCost()=" + getCost() + "]";
    }
}

class WholesalePurchase extends Purchase {
    //declare instance constant percent and class constant LIMIT
    private final double percent;
    private final static int LIMIT = 20;

    //declare a parameterized constructor
    public WholesalePurchase(Product product, int number, double percent){
        super(product, number);
        this.percent = percent;
    }

    //do not change signatures of methods
    @Override
    protected int getFinalCost(int baseCost) {
        //put your code here
        if (getNumber() >= 20){
            return (int)Math.round(baseCost * (1 - percent / 100));
        } else {
            return baseCost;
        }
    }

    @Override
    protected String fieldsToString() {
        //put your code here
        return " ["
                + "product=" + getProduct()
                + ", number=" + getNumber()
                + ", percent=" + percent
                + ", getCost()=" + getCost() + "]";
    }
}

