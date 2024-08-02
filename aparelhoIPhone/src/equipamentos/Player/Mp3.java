package equipamentos.Player;

public class Mp3 implements ReproduzirMusica {

    @Override
    public void tocar() {
        System.out.println("Tocando musica MP3...");
    }

    @Override
    public void coletanea() {
        System.out.println("Tocando coletânea Romântica...");
    }
}
