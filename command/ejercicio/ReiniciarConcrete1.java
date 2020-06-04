package command.ejercicio;

public class ReiniciarConcrete1 implements ICommand {
    private Receiver receiver;

    public ReiniciarConcrete1(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.reiniciar();
    }
}
