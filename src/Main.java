/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.
*/



public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre="Pedro";
        cliente.edad=22;
        cliente.telefono=655522124;
        cliente.credito=120.36;
        System.out.println("Cliente: "+ cliente.nombre + ", de " + cliente.edad + " Años, Número de teléfono: "
                + cliente.telefono + " y un Crédito de: " + cliente.credito + "€");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre="Luis";
        trabajador.edad=49;
        trabajador.telefono=655458712;
        trabajador.salario=1635.89;
        System.out.println("Trabajador: "+ trabajador.nombre + ", de " + trabajador.edad + " Años, Número de teléfono: "
                + trabajador.telefono + " y un Salario de: " + trabajador.salario + "€");

    }
}
    class Persona{
        String nombre;
        int edad;
        int telefono;

}
    class Cliente extends Persona{
        double credito;

}
    class Trabajador extends Persona {
        double salario;

    }











