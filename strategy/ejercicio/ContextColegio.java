package strategy.ejercicio;

public class ContextColegio {

    private Estudiante[] estudiantesarr;
    private IStrategy strategy;
    private Estudiante est;

    public ContextColegio(int codigo){
        estudiantesarr = new Estudiante[codigo];
    }

    public ContextColegio(Estudiante[] estudiantes){
        this.estudiantesarr = estudiantes;
    }

    public Estudiante[] getEstudiantesarr() {
        return estudiantesarr;
    }

    public void setEstudiantesarr(Estudiante[] estudiantesarr) {
        this.estudiantesarr = estudiantesarr;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Estudiante[] order (){
        return strategy.ordenar(estudiantesarr);
    }
    public void añadirEst (Estudiante estudiante){

    }
}
