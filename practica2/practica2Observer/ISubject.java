package practica2.practica2Observer;

public interface ISubject {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver();
}
