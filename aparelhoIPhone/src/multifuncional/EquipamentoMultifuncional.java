package multifuncional;

import equipamentos.Telefonia.Telefonia;
import equipamentos.camera.Camera;
import equipamentos.midia.Midia;
import equipamentos.navegador.Navegador;

public class EquipamentoMultifuncional implements Telefonia, Navegador, Camera, Midia {

    @Override
    public void telefone() {
        System.out.println("Ligando via iphone");
    }

    @Override
    public void navegador() {
        System.out.println("Navegando na Internet via iphone");
    }

    @Override
    public void fotografar() {
        System.out.println("Tirando Foto via iphone");
    }

    @Override
    public void enviaMensagem() {
        System.out.println("Enviando Mensagem via iphone");
    }

}
