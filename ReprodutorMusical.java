public class ReprodutorMusical implements Aplicativo {
    public void tocar(){
        System.out.println("Tocando musica...");
    }

    public void pausar(){
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    }
}