package observe;

public class ConcreteSubjectA extends Subjects{
    public ConcreteSubjectA(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("A目标发生改变");
        for(ObserverO obs:observers){
            obs.response();
        }
    }
}
