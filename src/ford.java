
public class ford extends Car {
    private final int year;
    private final int manufacturediscount;
    
    ford(int speed ,double regularprice, String color,int year,int manufacturediscount){
        super(speed,regularprice,color);
        this.manufacturediscount = manufacturediscount;
        this.year=year;
    }
        
    @Override
        public double getsaleprice(){
            
            return(super.getsaleprice()-manufacturediscount);
        }
        
    }

