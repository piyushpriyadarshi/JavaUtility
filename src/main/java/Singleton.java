public class Singleton {

    private static Singleton reference;

    private Singleton() {
    }

    public synchronized Singleton getInstance(){
        if(reference!=null){
            return reference;
        }
        else {
            reference=new Singleton();
            return reference;
        }
    }



//    select * from products limit 25 offset 0;

}
