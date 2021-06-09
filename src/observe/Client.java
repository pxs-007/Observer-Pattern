package observe;

public class Client {
    public static void main(String[] args){
        Subjects subject=new ConcreteSubjectB();
        ObserverO obs1=new ConcreteObserver1();
        ObserverO obs2=new ConcreteObserver2();
        subject.Add(obs1);
        subject.Add(obs2);
        subject.notifyObserver();
    }
}
