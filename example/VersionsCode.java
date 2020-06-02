package memento.example;

import java.util.HashMap;

public class VersionsCode {

    private HashMap<String,Memento> codeMap = new HashMap<>();

    public void addMementoMap(String state, Memento memento){
        this.codeMap.put(state, memento);
    }

    public Memento getMementoMap(String state){
        return codeMap.get(state);
    }

}
