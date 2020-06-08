package practica2.chainOfresponsabilityej2;

public class HandlerCarnetizacion implements IHandler {

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

        if (certificado && pagos && ficha){
            System.out.println("Atendido por : Responsable de carnetizacion");
        } else {
            this.next.criteriaHandler(certificado, pagos, ficha);
        }

    }
}
