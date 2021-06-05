class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();
    Bike s= new Bike();
    s.run();
    b.run();  
  }  
}  //Run Time Polymorphism
//Mehod Over Riding