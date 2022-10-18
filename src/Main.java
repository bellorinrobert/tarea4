public class Main {
    public static void main(String[] args) {
        System.out.println("Tarea 4");
        Persona Simpson = new Persona();
        Simpson.setEdad(66);
        Simpson.setNombre("Homero");
        System.out.println("La edad de " +
                Simpson.getNombre() + " tiene " +
                Simpson.getEdad() + " años");
        Simpson.setTelefono("+1 555-55-55");
        System.out.println("Su número de telefono es: " + Simpson.getTelefono());

        Cliente HijoSimpson = new Cliente();

        HijoSimpson.setNombre("Bart");
        System.out.println("Cliente: " + HijoSimpson.getNombre());
        HijoSimpson.setEdad(10);
        System.out.println("Edad: " + HijoSimpson.getEdad());
        HijoSimpson.setTelefono("+1 555-55-56");
        System.out.println("Telefono: " + HijoSimpson.getEdad());
        HijoSimpson.setCredito(16);
        System.out.println("Su crédito es: " + HijoSimpson.getCredito() + "$");



    }
}

class Persona {
    private int edad;

    private String nombre;

    private String telefono;

    public void setEdad(int edad){

        this.edad = edad;

    }

    public int getEdad(){

        return this.edad;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){

        return this.nombre;

    }

    public void setTelefono(String telefono){

        this.telefono = telefono;

    }

    public String getTelefono(){

        return this.telefono;
    }
}

class Cliente extends Persona {

    private int credito;

    public void setCredito(int credito){

        this.credito = credito;

    }

    public int getCredito(){

        return this.credito;
    }
}