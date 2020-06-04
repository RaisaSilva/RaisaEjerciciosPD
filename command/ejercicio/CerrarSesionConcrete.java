package command.ejercicio;

public class CerrarSesionConcrete implements ICommand {
    private Receiver receiver;
    private String nombre;


    public CerrarSesionConcrete(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.cerrarSesion();
    }
}
