package estabelecimento;

import equipamentos.Player.Mp3;
import equipamentos.Player.ReproduzirMusica;
import equipamentos.Telefonia.Telefone;
import equipamentos.Telefonia.Telefonia;
import equipamentos.camera.Camera;
import equipamentos.camera.Canon;
import equipamentos.camera.Sony;
import equipamentos.midia.Gmail;
import equipamentos.midia.Midia;
import equipamentos.midia.Outlook;
import equipamentos.midia.Sms;
import equipamentos.midia.Wats;
import equipamentos.midia.Yahoo;
import equipamentos.navegador.Crome;
import equipamentos.navegador.Explorer;
import equipamentos.navegador.Firefox;
import equipamentos.navegador.Navegador;
import equipamentos.navegador.Opera;

public class fabrica {
    public static void main(String[] args) {

        // Telefone
        Telefonia telefone = new Telefone();
        telefone.telefone();

        // Internet
        Navegador crome = new Crome();
        crome.navegador();

        Navegador firefox = new Firefox();
        firefox.navegador();

        Navegador explorer = new Explorer();
        explorer.navegador();

        Navegador opera = new Opera();
        opera.navegador();

        // Máquina Fotográfica
        Camera canon = new Canon();
        canon.fotografar();

        Camera sony = new Sony();
        sony.fotografar();

        // email
        Midia gmail = new Gmail();
        gmail.enviaMensagem();

        Midia outlook = new Outlook();
        outlook.enviaMensagem();

        Midia yahoo = new Yahoo();
        yahoo.enviaMensagem();

        // mensagem de texto
        Midia sms = new Sms();
        sms.enviaMensagem();

        Midia wats = new Wats();
        wats.enviaMensagem();

        // Tocar músicas
        ReproduzirMusica mp3 = new Mp3();
        mp3.tocar();

        ReproduzirMusica coletanea = new Mp3();
        coletanea.coletanea();
    }
}
