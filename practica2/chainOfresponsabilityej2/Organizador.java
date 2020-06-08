package practica2.chainOfresponsabilityej2;

public class Organizador implements IHandler {
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

        HandlerCarnetizacion carnetizacion = new HandlerCarnetizacion();
        HandlerNotario notario = new HandlerNotario();
        HandlerCajero cajero = new HandlerCajero();
        HandlerHelpCliente ayudaCliente = new HandlerHelpCliente();

        // orden de la cadena responsabilidad
        this.setNext(carnetizacion);
        carnetizacion.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(ayudaCliente);

        this.next.criteriaHandler(certificado, pagos, ficha);
    }
}
