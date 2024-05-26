package Excercise3;

class Main {
    static {
        //some hidden verification code inside this block
    }
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String type = sc.next();
            int number = sc.nextInt();
            switch (type) {
                case "Product":
                    Product[] products = getProducts(number, sc);
                    Product highestProduct = Solution3.getHighest(products);
                    System.out.println(highestProduct);
                    break;
                case "Purchase":
                    Purchase[] purchases = getPurchases(number, sc);
                    Purchase highestPurchase = Solution3.getHighest(purchases);
                    System.out.println(highestPurchase);
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }

    private static Product[] getProducts(int number, java.util.Scanner sc) {
        Product[] products = new Product[number];
        for (int i = 0; i < number; i++) {
            products[i] = new Product(sc);
        }
        return products;
    }

    private static Purchase[] getPurchases(int number, java.util.Scanner sc) {
        Purchase[] purchases = new Purchase[number];
        for (int i = 0; i < number; i++) {
            purchases[i] = new Purchase(sc);
        }
        return purchases;
    }

}