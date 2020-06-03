package chainOfResponsability.example;

public class Organizador implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount) {

        AgenteCreditoLocal agenteCreditoLocal = new AgenteCreditoLocal();
        AgenteCreditoSucursal agenteCreditoSucursal = new AgenteCreditoSucursal();
        AgenteCreditoDept agenteCreditoDept = new AgenteCreditoDept();
        AgenteCreditoNac agenteCreditoNac = new AgenteCreditoNac();

        this.setNext(agenteCreditoLocal);
        agenteCreditoLocal.setNext(agenteCreditoSucursal);
        agenteCreditoSucursal.setNext(agenteCreditoDept);
        agenteCreditoDept.setNext(agenteCreditoNac);

        this.next.criteriaHandler(amount);
    }
}

