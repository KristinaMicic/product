package productproject;
class Wine extends Product{    
    
    private String volume;
    private final double newTax = 1.1;
    
    public Wine(String name, String barcode, double price, String volume) {
        super(name, barcode, price);
        this.volume = volume;
        this.price = price; //stara cena
    }
    
    @Override //override-ujemo metodu za racunanje nove cene iz roditeljske klase Product
    public double calculatePrice(double price){
        double newPrice = price * TAX * newTax;
        return newPrice;
    }
    
    @Override
    public String toString(){
         return super.toString() + " Volume: "+ volume;
    }
}    

    
   
    
   
