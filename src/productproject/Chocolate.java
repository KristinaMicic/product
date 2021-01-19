package productproject;

    class Chocolate extends Product {
            public String weight;  //Dodatni atribut
           
            public Chocolate(String name, String barcode, double price, String weight){
                super(name, barcode, price);
                this.weight = weight;                 
            }
                          
            @Override
            public String toString(){
                return super.toString() + "Weight: "+ weight;
            }
    }  
    
