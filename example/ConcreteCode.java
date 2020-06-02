package memento.example;

public class ConcreteCode {
    private String criterio;
    private String state;

    public ConcreteCode(String criterio, String state){
        this.criterio = criterio;
        this.state=state;
    }

    public void showData(){
        System.out.println("Mensaje : "+this.criterio);
        System.out.println("Estado: "+this.state);
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
