public class ObjectCounter {
    static int count = 0; 

    
    public ObjectCounter() {
        count++;
    }

    
    public void displayCount() {
        System.out.println("Objects created so far: " + count);
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        obj3.displayCount(); 
    }
}
