package Week6Package;

public class Product {
    String name;
    double price;
    int quantity;
    public Product(String name, double price, int   quantity){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double totalPrice(){
        return(price*quantity);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {

        return this.name;
    }
    public void setPrice(double price)
    {
        this.price = price;

    }
    public double getPrice()
    {
        return this.price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return this.quantity;
    }

    public static void main(String[] args) {
       Products obj = new Products("Rice",12.5,22);
       obj.setName("Banana");
       obj.setQuantity(225);
       obj.setPrice(22.5);
        System.out.println("Product Name: "+ obj.getName());
        System.out.println("Unit Price ($): "+ obj.getPrice());
        System.out.println("Quantity: "+ obj.getQuantity());
        System.out.println("Total($): "+obj.totalPrice());
    }

}
