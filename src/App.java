public class App {
    public static void main(String[] args) throws Exception {
        Automovil coche = new Automovil("Ford", 2009, 1600, Automovil.tipoCombustible.DIESEL, Automovil.tipoAutomovil.COMPACTO, 5, 5, 180, Automovil.tipoColor.NEGRO, 100);

coche.mostrarAtributos();
coche.setVelocidadActual(100);

        coche.acelerar(20);
        coche.desacelerar(50);
        coche.frenar();


    }
}
