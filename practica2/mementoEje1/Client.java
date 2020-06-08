package practica2.mementoEje1;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        // cambiando estados del objeto concreto

        PersonasBU p1 = new PersonasBU("luz", 1234, 20);
        PersonasBU p2 = new PersonasBU("lia", 5678, 21);
        PersonasBU p3 = new PersonasBU("juan", 8907, 22);
        PersonasBU p4 = new PersonasBU("jose", 1357, 18);
        PersonasBU p5 = new PersonasBU("pepe", 1012, 19);

        List<PersonasBU> list1 = new ArrayList<>();
        List<PersonasBU> list2 = new ArrayList<>();
        List<PersonasBU> list3 = new ArrayList<>();
        List<PersonasBU> list4 = new ArrayList<>();
        List<PersonasBU> list5 = new ArrayList<>();

        list1.add(p1);
        list1.add(p3);

        list2.add(p2);
        list2.add(p4);

        list3.add(p3);

        list4.add(p1);
        list4.add(p2);
        list4.add(p3);

        list5.add(p2);

        BackUp backup;

        backup= new BackUp("BackupMarzo", list1);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new BackUp("BackupMayo",list2);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new BackUp("BackupMarzo",list3);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());


        backup= new BackUp("BackupMarzo",list4);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new BackUp("BackupMayo",list5);
        originator.setState(backup);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(1));

    }
}
