package InstanceOf;

public class TestInstanceOf {
    public static void main(String[] args) {


       Empleado empleado = new Empleado("Maria", 500.0);
       determinbarTipo(empleado);
       empleado = new Gerente("Karla", 1000, "Contabilidad");
       //determinbarTipo(empleado);


    }

    public static void determinbarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente.getDepartamento() = " + gerente.getDepartamento());

        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
           // Gerente gerente = (Gerente) empleado;
            System.out.println("empleado = " + empleado.getNombre());
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
}
