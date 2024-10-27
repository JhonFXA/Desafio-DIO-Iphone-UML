public class Navegador implements Aplicativo{
    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a pagina...");
    }
}
