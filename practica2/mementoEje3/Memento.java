package practica2.mementoEje3;

public class Memento {
    private Tesis state;

    public Memento (Tesis stateSaved){
        this.state=stateSaved;
    }

    public Tesis getState() {
        return state;
    }

    public void setState(Tesis state) {
        this.state = state;
    }
}
