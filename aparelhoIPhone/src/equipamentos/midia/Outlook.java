package equipamentos.midia;

public class Outlook implements Midia {

    @Override
    public void enviaMensagem() {
        System.out.println("Enviando email Outlook...");
    }
}
