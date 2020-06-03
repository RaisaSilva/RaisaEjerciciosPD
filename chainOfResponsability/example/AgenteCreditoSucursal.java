package chainOfResponsability.example;

public class AgenteCreditoSucursal implements IHandler {

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
    public void criteriaHandler(int amount) {
        //  condicion para poder hacerme responsable de esa informacion

        if (amount >= 10000 && amount < 20000){
            Caja.getInstance().descontar(amount);
            System.out.println("Proceso Atendio por : Agente de Credito Sucursal");

        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
