package productproject;

public class Main {
    public static void main(String[] args){
                      //--------------------Test za cokoladu----------------------------
                      Chocolate chocolate = new Chocolate("Milka","1234mil",100.0 , "300g"); 
                       System.out.println(chocolate.toString());
                       
                       //--------------------Test za vino--------------------------------
                      Wine wine = new Wine("Sangria", "aaa11", 200.0 , "1lit");
                     System.out.println(wine.toString());
                            
    }
}