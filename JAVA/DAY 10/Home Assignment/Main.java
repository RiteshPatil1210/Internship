class User{
    String username;
    String email;

    User(String username,String email){
this.username=username;
this.email=email;
 }
 void display(){
    System.out.println("Username:"+username);
    System.out.println("email:"+email);
 }
}
class Admin extends User{
    int al;
    Admin(String username,String email,int al){
super(username,email);
this.al=al;

    }
    void display1(){
        super.display();
        System.out.println("Admin level:"+al);
 }
    }
    class Main{
        public static void main (String args[]){
 Admin a=new Admin("Ritesh","patilritesh998@gmail.com",5);
a.display1();
        }
    }

