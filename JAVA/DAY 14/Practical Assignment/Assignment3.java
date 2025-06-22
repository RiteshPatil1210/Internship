class Number{
    public void run(){
        try{
        for(int i=0;i<=5;i++){
        System.out.println(i);
        Thread.sleep(1000);
        }
    }catch(Exception e){

        }
    }
    }

class Character implements Runnable{
    Number s;
    public Character(Number n){
        this.s=n;
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello world"+i);
    }
    synchronized(s){
        s.run();
    }
    
}
}
class Assignment3{
    public static void main(String[] args) {
        Number n=new Number();
        Character c=new Character(n);
        Thread t=new Thread(c);
        t.start();

    }
}