package laboratorio.mundo.pc;



public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorLg = new Monitor("Lg", 20);
        Teclado tecladoSeisa = new Teclado("3.0", "Seisa");
        Raton ratonDragon = new Raton("Usb", "Dragon");
        Computadora computadora1 = new Computadora("Lg", monitorLg, tecladoSeisa, ratonDragon);

        Monitor monitorAsus = new Monitor("Asus", 22);
        Teclado tecladoColnes = new Teclado("bluetooth", "Clones");
        Raton ratonAlien = new Raton("bluetooth", "Alien");
        Computadora computadora2 = new Computadora("Asus", monitorAsus, tecladoColnes, ratonAlien);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}
