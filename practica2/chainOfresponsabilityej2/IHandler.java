package practica2.chainOfresponsabilityej2;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(boolean certificado,boolean pagos, boolean ficha);// peticion

}
