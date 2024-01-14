public class Facebook extends RedeSocial {
    @Override
    public void logar() {
        System.out.println("Logando no Facebook");
    }
    
    @Override 
    public void postagemTexto() {
        System.out.println("Post com texto no Facebook");
    }

    @Override
    public void publicar() {
        System.out.println("Publicando postagem no Facebook");
    }
}

/*
 * Fornecem implementações específicas para as etapas abstratas definidas na Classe Abstrata. 
 * Personalizam o comportamento do algoritmo sem modificar sua estrutura global.
 */