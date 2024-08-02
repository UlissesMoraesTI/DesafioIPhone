package equipamentos.midia;

public class Sms implements Midia {

    @Override
    public void enviaMensagem() {
        System.out.println("enviando mensagem texto Sms...");
    }
}
