package command.ejercicio;

public class Client {
    public static void main (String[]args){
        Receiver receiver = new Receiver("miguel");

        ReiniciarConcrete1 reiniciar = new ReiniciarConcrete1(receiver);
        ApagarConcrete apagar = new ApagarConcrete(receiver);
        SuspenderConcrete suspender = new SuspenderConcrete(receiver);
        CerrarSesionConcrete cerrarSesion = new CerrarSesionConcrete(receiver);


        InvokerComputadora invoker = new InvokerComputadora();

        // agregando comandos concretos
        invoker.setCommand(reiniciar);
        invoker.setCommand(apagar);
        invoker.setCommand(suspender);
        invoker.setCommand(cerrarSesion);

        // ejecutar todos los comando

        invoker.runCommand();

    }

}
