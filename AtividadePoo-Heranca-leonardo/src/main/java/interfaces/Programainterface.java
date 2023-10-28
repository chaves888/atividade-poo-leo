package interfaces;

public class Programainterface {
    public static void main(String[] args) {
        var teclado = new Teclado();
        var mouse = new Mouse();

        conectarComNote(mouse);
        conectarComNote(teclado);

    }

    private static void conectarComNote(Usb periferico) {
        periferico.conectar();
    }

}
