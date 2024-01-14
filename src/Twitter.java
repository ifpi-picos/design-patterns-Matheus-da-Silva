public class Twitter extends RedeSocial {
    @Override
    public void fazerComentario() {
        System.out.println("Fazendo comentário no Twitter");
    }

    @Override
    public void publicar() {
        System.out.println("Publicando comentário no Twitter");
    }
}

/*
 * Fornecem implementações específicas para as etapas abstratas definidas na Classe Abstrata. 
 * Personalizam o comportamento do algoritmo sem modificar sua estrutura global.
 */