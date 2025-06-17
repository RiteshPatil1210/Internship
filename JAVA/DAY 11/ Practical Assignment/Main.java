


class Teacher{
    String f;
    String s;
    Teacher(String f,String s){
        this.f=f;
        this.s=s;
    }
}
class Mathteacher extends Teacher{
    int e;
    Mathteacher(String f,String s,int e){
        super(f,s);
        this.e=e;
    }
    void display(){
        System.out.println("fields name: "+f);
        System.out.println("subject: "+s);
        System.out.println("experienceYears: "+e);
    }
}
class Main{
    public static void main (String[] args){
        Mathteacher m = new Mathteacher("IF","Maths",5);
        m.display();
    }
}