package command.ejercicio;

public class SuspenderConcrete implements ICommand {
    private Receiver receiver;

    public SuspenderConcrete(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.suspender();
    }
}
