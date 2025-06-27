


class Assignment1 {
    
    int a=10;
}
    class Base extends Assignment1{
        int b=20;
        void display1(){
System.out.println("Value:"+b);
System.out.println("Super value:"+super.a);
        }
    }
    class Main{
        public static void main(String[] args) {
            
            Base b=new Base();
            b.display1();
        }
    }
    
