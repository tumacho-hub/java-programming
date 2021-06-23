package day_56_abstraction.transportation;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("Start th engine");
    }
    public void stop(){
        System.out.println("Shut off the engine");
    }


}
