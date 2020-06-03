package chainOfResponsability.example;

public class Caja implements Cloneable {

    private  static Caja instance= null;
    private int montoAlmacenado= 7000;

    private Caja(){
        System.out.println("creating instance caja");
    }

    private synchronized static void makeInstance(){
        if (instance == null)
            instance = new Caja ();
    }

    public static Caja getInstance(){
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void descontar (int monto){
        if (montoAlmacenado > 0 && monto <= montoAlmacenado){
            montoAlmacenado = montoAlmacenado - monto;
            System.out.println("el monto almacenado es "+ montoAlmacenado);
        }
        System.out.println("no se puede descontar la cantidad de "+ monto);
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
