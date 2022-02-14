public class CafeJava {
    // VARIABLES DE LA APP
    // Líneas de texto que aparecerán en la app 
    static String saludoGeneral = "Bienvenido al Café Java, ";
    static String mensajePendiente = ", tu pedido estará listo en breve";
    static String mensajeListo = ", tu pedido está listo";
    static String mensajeMostrarTotal = "Tu total es $";
    
    // Variables de menú (agrega las tuyas a continuación)
    static double precioMocha = 3.5;
    static double precioFiltro = 2.5;
    static double precioLeche = 4.5;
    static double precioCapuchino = 5.0;

    public static double calcularTotal(String tipo, Integer cantidad) {
        double total = 0;

        if (tipo.equals("mocha")) {
            total = precioMocha * cantidad;
        } else if (tipo.equals("filtro")) {
            total = precioFiltro * cantidad;
        } else if (tipo.equals("leche")) {
            total = precioLeche * cantidad;
        } else if (tipo.equals("capuchino")) {
            total = precioCapuchino * cantidad;
        }

        return total;
    }

    public static void mostrarMensaje(String cliente, String tipo, Integer cantidad, boolean estaListo) {
        if(!estaListo) {
            System.out.println(cliente + mensajePendiente);
        } else {
            System.out.println(cliente + mensajeListo);
            System.out.println(mensajeMostrarTotal + calcularTotal(tipo, cantidad));
        }
    }

    public static void arreglarPedido(String cliente, String tipoPrevio, Integer cantidadPrevia, String tipoNuevo, Integer cantidadNueva, boolean estaListo) {
        if(!estaListo) {
            System.out.println(cliente + mensajePendiente);
        } else {
            System.out.println(cliente + mensajeListo);

            double totalAnterior = calcularTotal(tipoPrevio, cantidadPrevia);
            double totalActual = calcularTotal(tipoNuevo, cantidadNueva);
            System.out.println(mensajeMostrarTotal + (totalActual - totalAnterior));
        }
    }

    public static void main(String[] args) {
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = true;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        mostrarMensaje(cliente1, "filtro", 1, estaListoOrden1);
        mostrarMensaje(cliente4, "capuchino", 1, estaListoOrden4);
        mostrarMensaje(cliente2, "leche", 2, estaListoOrden2);
        arreglarPedido(cliente3, "filtro", 1, "leche", 1, estaListoOrden3);
        
    }
}