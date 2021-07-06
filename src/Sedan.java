 
public class Sedan extends Car {
    private final int length;
    
    Sedan(int speed ,double regularprice, String color,int length){
        super(speed,regularprice,color);
        this.length=length;
    }
    public double getsaleprice(){
        
        if(length>20){
            return (super.getsaleprice()-(0.05*super.getsaleprice()));
            
        }
        else{
            return (super.getsaleprice()-(0.05*super.getsaleprice()));
        }
    }
    
    
}
