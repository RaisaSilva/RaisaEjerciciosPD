package practica2.mementoEje3;

public class Client {

    public  static  void main (String[]args){

        CareTaker caretaker = new CareTaker();
        Originator originator= new Originator();

        Tesis tesis;

        // estados de la tesis


        tesis= new Tesis("estado inicial","version1");
        originator.setState(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis= new Tesis("introduccion mejorada","version2");
        originator.setState(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis= new Tesis("marco teorico mejorado","version3");
        originator.setState(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis= new Tesis("conlusion basica","version4");
        originator.setState(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis= new Tesis("conlusion terminada","version5");
        originator.setState(tesis);
        caretaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(caretaker.getMemento(2));
    }
}
