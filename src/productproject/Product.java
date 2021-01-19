package productproject;
public abstract class Product {
    
    public String name;
    public String barcode;
    public double price;
    public final double TAX = 1.2;
    
    public Product(String name, String barcode, double price){
        this.name = name;
        this.barcode = barcode;
        this.price = price; //stara cena 
    }
    
    public double calculatePrice(double price){
       return price * TAX;
    }
    
    @Override
    public String toString(){
       // newPrice = calculatePrice(price); //pozivamo metodu za racunanje nove cene
        StringBuilder output = new StringBuilder();
        output.append("Product: "+ this.name + ", ");
        output.append("Barcode: " + barcode + ", ");
        output.append("New price: " + calculatePrice(price) + ", ");
        return output.toString();
    }   
}
