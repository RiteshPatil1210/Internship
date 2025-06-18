class Calculator{
    int add(int a,int b){
return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}

 class Main3 {
    public static void main(String args[]){
    Calculator c=new Calculator();
    System.out.println("Additon:"+c.add(5,20));
    System.out.println("Additon:"+c.add(10.00,25.05));
    }
}
