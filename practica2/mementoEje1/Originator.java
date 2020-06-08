package practica2.mementoEje1;

public class Originator {
    private ConcreteObjeto state;


    public ConcreteObjeto getState() {
        return state;
    }

    public void setState(BackUp state) {
        System.out.println("Set ----> Alias");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Alias");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
       System.out.println("Restore --- > Alias");
        this.state.showData();

    }

}
