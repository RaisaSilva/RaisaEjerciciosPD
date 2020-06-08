package practica2.mementoEje3;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> savedStates= new ArrayList<>();

    public void addMemento(Memento memento){
        this.savedStates.add(memento);
    }

    public Memento getMemento(int version){
        return this.savedStates.get(version);
    }

}

