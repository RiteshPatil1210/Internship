

public class Assignment1 extends Thread{
    public void run(){
        int n=5;
        try{
        for(int i=1;i<=n;i++){
        System.out.println("No:"+i);
        Thread.sleep(1000);
        }
    }catch(Exception e){

    }
    }

    public static void main(String[] args) {
       Assignment1 a=new Assignment1();
       a.start();
    }
}

    

