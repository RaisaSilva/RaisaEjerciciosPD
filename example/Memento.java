package memento.example;

public class Memento {
    private ConcreteCode state;

    public Memento (ConcreteCode stateSaved){
        this.state=stateSaved;
    }

    public ConcreteCode getState() {
        return state;
    }

    public void setState(ConcreteCode state) {
        this.state = state;
    }
}
