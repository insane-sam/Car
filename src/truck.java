public class truck extends Car{
        private final int weight;
    
        
        truck(int speed ,double regularprice, String color,int weight){
        super(speed,regularprice,color);
        this.weight = weight ;
        
      
        }
        @Override
        public double getsaleprice(){
            if(weight>2000){
                return super.getsaleprice() -(0.1*super.getsaleprice()); 
            }
            else{
                return super.getsaleprice()-10;
            }
            
        }
        
    }