package command.ejercicio;

public class ApagarConcrete implements ICommand {
    private Receiver receiver;

    public ApagarConcrete(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.apagar();
    }
}
