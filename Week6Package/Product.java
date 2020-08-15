package Week6Package;

public class Product {
    String name;
    double price;
    int quantity;

    public double totalPrice(double price, int quantity){
        return (price*quantity);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
       Product obj = new Product();
       obj.setName("Order Name: ");
       System.out.println((obj.getName()));
       System.out.println("Total: "+obj.totalPrice(100.5,22));

    }

}
