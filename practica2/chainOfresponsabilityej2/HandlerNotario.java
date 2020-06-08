package practica2.chainOfresponsabilityej2;

public class HandlerNotario implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(boolean certificado, boolean pagos, boolean ficha) {
        //  condicion para poder hacerme responsable de esa informacion

        if (!certificado && pagos && ficha){
            System.out.println("Proceso Atendio por : HandlerConcrete2");
        } else {
            this.next.criteriaHandler(certificado, pagos, ficha);
        }

    }
}
