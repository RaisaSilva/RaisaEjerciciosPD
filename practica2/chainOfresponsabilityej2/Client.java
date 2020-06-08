package practica2.chainOfresponsabilityej2;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.criteriaHandler(true, false, true);

    }
}
