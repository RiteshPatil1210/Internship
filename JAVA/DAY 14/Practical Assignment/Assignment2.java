 class Assignment2 implements Runnable{
    public void run(){
        int n=5;
        try{
        for(int i=1;i<=n;i++){
        System.out.println("hello from Thread"+i);
        Thread.sleep(1000);
        }
    }catch(Exception e){

    }
    }

    public static void main(String[] args) {
       Assignment2 a=new Assignment2();
       Thread t =new Thread(a);
       t.start();
    }
}
