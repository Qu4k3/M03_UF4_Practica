package Utils;

public class Messages {

    // --- Input ---
    public static void inputData() {
        System.out.print("\n" + Colors.ANSI_PURPLE + "> " + Colors.ANSI_RESET);
    }

    // --- General ---
    public static void error() {
        System.out.println("\n" + Colors.ANSI_RED + "> Ha habido un error" + Colors.ANSI_RESET);
    }

    public static void success() {
        System.out.println("\n> " + Colors.ANSI_GREEN + "Realizado con exito" + Colors.ANSI_RESET);
    }

    public static void notFound() {
        System.out.println("\n> " + Colors.ANSI_YELLOW + "No encontrado" + Colors.ANSI_RESET);
    }

    // --- Info ---
    public static void inputMustBeInt() {
        System.out.println("\n" + Colors.ANSI_RED + "El valor ha de ser un entero" + Colors.ANSI_RESET);
    }

    // --- Arrays ---
    public static void arrayFilledOk() {
        System.out.println("\n> " + Colors.ANSI_GREEN + "Datos cargados con éxito" + Colors.ANSI_RESET);
    }

    public static void arrayAlreadyFilled() {
        System.out.println("\n> " + Colors.ANSI_YELLOW + "Array ya rellenado" + Colors.ANSI_RESET);
    }

    public static void arrayFillProblem() {
        System.out.println("\n> " + Colors.ANSI_RED + "Ha habido un problema rellenando el array" + Colors.ANSI_RESET);
    }

    public static void arrayNotFilled() {
        System.out.println("\n> " + Colors.ANSI_BLUE_BACKGROUND + " No hay datos, carga primero los datos en el punto 1 " + Colors.ANSI_RESET);
    }

    // -- Exit ---
    public static void exitSec() {
        System.out.println("\n" + Colors.ANSI_PURPLE_BACKGROUND + " Seguro quieres salir? (s/n) " + Colors.ANSI_RESET);
    }

    public static void deleteSec() {
        System.out.println("\n" + Colors.ANSI_PURPLE_BACKGROUND + " Seguro quieres borrar todo? (s/n) " + Colors.ANSI_RESET);
    }

    // --- Menu ---
    public static void optionNotFound() {
        System.out.println("\n> " + Colors.ANSI_RED + "No existe tal opción, por favor vuelve a intentarlo" + Colors.ANSI_RESET);
    }

    // --- Archivo ---
    public static void fileMistake() {
        System.out.println("\n> " + Colors.ANSI_RED + "No se puede leer correctamente el fichero, verifica que los datos se hayan introducido correctamente" + Colors.ANSI_RESET);
    }

}
