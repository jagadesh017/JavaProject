package oopsConcepts.Interface;

public class ExecutingCode implements OperatingSystem{

    @Override
    public void selenium() {

        System.out.println("this is selenium language");
        
    }

    @Override
    public void mac() {
        System.out.println("mac mechine");
        
    }

    @Override
    public void windows() {
        System.out.println("windows system");
      
    }
    public static void main(String[] args) {
        
        ExecutingCode ec = new ExecutingCode();
        ec.selenium();
        ec.mac();
        ec.windows();

    }

    


}
