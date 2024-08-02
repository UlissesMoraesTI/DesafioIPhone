package equipamentos.midia;

public class Yahoo implements Midia {

    @Override
    public void enviaMensagem() {
        System.out.println("Enviando email Yahoo...");
    }
}
