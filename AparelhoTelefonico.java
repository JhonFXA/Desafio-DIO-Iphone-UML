public class AparelhoTelefonico implements Aplicativo {
    public void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligacao...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
}
