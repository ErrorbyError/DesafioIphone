package Iphone;

import componentes.AparelhoTelefonico;
import componentes.NavegadorWeb;
import componentes.ReprodutoMusical;

public class SmartPhone  implements ReprodutoMusical, AparelhoTelefonico, NavegadorWeb {
    private String modelo;

    public SmartPhone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
        System.out.println("através do " + modelo);
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
        System.out.println("através do " + modelo);

    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando a pagina");
        System.out.println("através do " + modelo);
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica");
        System.out.println("através do " + modelo);

    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
        System.out.println("através do " + modelo);
    }

    @Override
    public void selecinandoMusica() {
        System.out.println("Selecioando a musica");
        System.out.println("através do " + modelo);
    }


    @Override
    public void ligar() {
        System.out.println("Ligando...");
        System.out.println("através do " + modelo);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
        System.out.println("através do " + modelo);

    }

    @Override
    public void iniciarCorreiosVoz() {
        System.out.println("Inicando o correio de voz");
        System.out.println("através do " + modelo);
    }
}