package estabelecimento;

import equipamentos.Telefonia.Telefonia;
import multifuncional.EquipamentoMultifuncional;

public class iphone {
    public static void main(String[] args) {
        EquipamentoMultifuncional iphone = new EquipamentoMultifuncional();
        Telefonia telefone = iphone;

        // Ligando via iphone
        iphone.telefone();

        // Navegando na internet via iphone
        iphone.navegador();

        // Enviando mensagem via iphone
        iphone.enviaMensagem();

        // Tirando fotos via iphone
        iphone.fotografar();
    }
}
