
public class Car {
    private int speed;
    private double regularprice;
    private String color;
    
    Car(int speed ,double regularprice, String color){
        this.speed=speed;
        this.regularprice=regularprice;
        this.color=color;
        
    }
    public double getsaleprice(){
        return regularprice;
        
    }
}    
   
    
    

