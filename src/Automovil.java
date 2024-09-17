public class Automovil {
    String marca;
    int modelo;
    int motor;

    enum tipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL}
    tipoCombustible combustible;

    enum tipoAutomovil {CARROCIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoAutomovil automovil;

    int puertas;
    int asientos;
    int velocidadMaxima;
    
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;

    int velocidadActual;

    public Automovil(String marca, int modelo, int motor, Automovil.tipoCombustible combustible,
            Automovil.tipoAutomovil automovil, int puertas, int asientos, int velocidadMaxima,
            Automovil.tipoColor color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.automovil = automovil;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void acelerar (int incrementoVelocidad){
        setVelocidadActual(velocidadActual+incrementoVelocidad);
        if (velocidadActual>velocidadMaxima){
            System.out.println("No se debe acelerar mas allá de la velocidad máxima permitida para el automóvil");
        } else {System.out.println("La velocidad actual con el incremento es = " + velocidadActual);}
    }

    void desacelerar (int decremento){
        setVelocidadActual(velocidadActual-decremento);
        if (velocidadActual < 0 ){
            System.out.println("No es posible desacelerar a una velocidad negativa");
        } else {System.out.println("La velocidad actual con la deseleración es = " + velocidadActual);}
    }

    void frenar () {
        setVelocidadActual(0);
        System.out.println("La velocidad actual al frenar es = " + velocidadActual);
    }

    public int tiempoEstimadoLlegada (int distanciaRecorrer){
        int tiempoEstimado = distanciaRecorrer/velocidadActual;
        return tiempoEstimado;
    }

    void mostrarAtributos (){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + combustible);
        System.out.println("Tipo de automóvil = " + automovil);
        System.out.println("Número de puertas = " + puertas);
        System.out.println("Cantidad de asientos = " + asientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("");
    }
    
}
