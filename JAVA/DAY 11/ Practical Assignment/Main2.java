class Device{
    void powerOn(){

    }
}
class Smarthphone extends Device{
    @Override
    void powerOn(){
System.out.println("Smartphone is starting up.");
    }
}
class Tablet extends Device{
    @Override
    void powerOn(){
System.out.println("Tablet is booting up.");
    }
}
class Main2 {
    public static void main(String[]args) {
        Tablet t=new Tablet();
t.powerOn();
Smarthphone s=new Smarthphone();
    s.powerOn();

    }
     
}
