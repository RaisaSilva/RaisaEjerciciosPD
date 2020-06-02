package memento.example;

public class Client {

    public  static  void main (String[]args){

        VersionsCode versions = new VersionsCode();
        Originator originator= new Originator();

        ConcreteCode concreteObjeto;

        concreteObjeto= new ConcreteCode("Hello world","version1");
        originator.setState(concreteObjeto);
        versions.addMementoMap("version1",originator.createMemento()); //  creando mi version/state 1  [1]

        concreteObjeto= new ConcreteCode("primer commit","version2");
        originator.setState(concreteObjeto);
        versions.addMementoMap("version2", originator.createMemento());

        concreteObjeto= new ConcreteCode("segundo commit","version3");
        originator.setState(concreteObjeto);
        versions.addMementoMap("version3", originator.createMemento());

        originator.restoreFromMemento(versions.getMementoMap("version1")); //

    }
}
