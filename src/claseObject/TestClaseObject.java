package claseObject;

public class TestClaseObject {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienes distintas referencias en memoria");
        }

        if (empleado1.equals(empleado2)){
            System.out.println("Los objectos sin igules en contenido");
        }else {
            System.out.println("Los objectos no son igulaes en contenido");
        }

        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        }else{
            System.out.println("El valor hashcode es diferente");
        }


    }


}
