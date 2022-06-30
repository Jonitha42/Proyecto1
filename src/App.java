public class App {
    public static void main(String[] args) throws Exception {
        
    int resultado = sumatoria(10,20,30);

    System.out.println("Primera parte del Ejercicio ---------- ");
    System.out.println("Resultado: " + resultado + "\n");

    Coche miCoche = new Coche();

    miCoche.incrementarPuertas();

    System.out.println("Segunda parte del Ejercicio ---------- " );
    System.out.println("El coche tiene: " + miCoche.cantidadPuertas + " Puerta/s");
    }

    public static int sumatoria(int a, int b, int c){
        return a + b + c;
    }
}


// Primera parte:

// Crear una función con tres parámetros que sean números que se suman entre sí.

// Llamar a la función en el main y darle valores.

//------------------------------------------------------

// Segunda parte:

// Crear una clase coche.

// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

// Una función que incremente el número de puertas que tiene el coche.

// Crear un objeto miCoche en el main y añadirle una puerta.

// Mostrar el número de puertas que tiene el objeto.
