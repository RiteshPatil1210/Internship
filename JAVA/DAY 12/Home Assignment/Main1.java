abstract class bank{
    abstract void getinterestrate();
    
}
class SBI extends bank{
int i=10;;
void getinterestrate(){
    System.out.println("Interest Rate of SBI:"+i+"%");
}
}
class HDFC extends bank{
    int j=15;;
    void getinterestrate(){
        System.out.println("Interest Rate of HDFC:"+j+"%");
    }
    }
public class Main1 {
    public static void main(String args[]){
        HDFC h=new HDFC();
        SBI s=new SBI();
        s.getinterestrate();
        h.getinterestrate();
    }
    
}
