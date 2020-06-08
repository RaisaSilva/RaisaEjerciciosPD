package practica2.mementoEje1;
import java.util.List;

public class BackUp {

    public class Backup {
        private String alias;
        private String state;
        private List<PersonasBU> personasbu;

        public Backup(String alias, List<PersonasBU> personas) {
            this.alias = alias;
            this.personasbu = personas;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void showData() {
            System.out.println("nombre : " + this.alias);
            System.out.println("Nº personas: " + this.personasbu.size());
            for (int i = 0; i < personasbu.size(); i++) {
                System.out.println("Persona# " + i + 1);
                System.out.println("Nombre: " + personasbu.get(i).getNombre());
                System.out.println("Edad: " + personasbu.get(i).getEdad());
                System.out.println("Ci: " + personasbu.get(i).getCi());
            }
        }
    }
}

