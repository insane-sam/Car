public class MyAutoShop{
    
   // (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) ;
    
        public static void main(String args[]){
            Sedan mysedan = new Sedan(160, 20000, "Red", 10);
            ford myFord1 = new ford (156,4452.0,"Black",2005, 10);
            ford myFord2 = new ford (155,5000.0,"Pink",1998, 5);
            Car myCar = new Car (555, 56856.0, "Red");
            truck mytruck = new truck(120,15000,"Yellow",1500);
            
            System.out.printf("MySedan Price %.2f ", mysedan.getsaleprice());
            System.out.println();

            System.out.printf("MyFord1 Price %.2f", myFord1.getsaleprice());
            System.out.println();
            System.out.printf("MyFord2 Price %.2f", myFord2.getsaleprice());
            System.out.println();
            System.out.printf("MyCar Price %.2f", myCar.getsaleprice());
            System.out.println();
            System.out.printf("MyTruck Price %.2f", mytruck.getsaleprice());
        }
        
    }