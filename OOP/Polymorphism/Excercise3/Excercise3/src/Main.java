class Main {
    static {
        //some hidden verification code inside this block
    }
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            int number = sc.nextInt();
            Product product = new Product(name, price);
            Purchase purchase;
            switch (id) {
                case 2:
                    int discount = sc.nextInt();
                    purchase = new PriceDiscountPurchase(product, number, discount);
                    break;
                case 1:
                    int expenses = sc.nextInt();
                    purchase = new TransportExpencesPurchase(product, number, expenses);
                    break;
                case 3:
                    double percent = sc.nextDouble();
                    purchase = new WholesalePurchase(product, number, percent);
                    break;
                default:
                    purchase = new Purchase(product, number);
            }
            System.out.println(purchase);
        }
    }
}