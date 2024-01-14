public abstract class RedeSocial {

    public final void postagem() {
        logar();
        postagemTexto();
        postagemImagem();
        fazerComentario();
        fazerLive();
        publicar();
    }

    public void logar() {
        System.out.println("Logando na rede social");
    }

    public void postagemTexto() {
        System.out.println("Post com texto");
    }
    
    public void postagemImagem(){
        System.out.println("Post com imagem");
    }

    public void fazerComentario() {
        System.out.println("Fazendo comentário");
    }

    public void fazerLive() {
        System.out.println("Fazendo live");
    }

    public void publicar() {
        System.out.println("Publicando postagem");
    }
}

/*
 * Essa classe declara o método padrão, “templateMethod()”, que define a sequência de passos do algoritmo. 
 * Contém métodos abstratos representando as etapas do algoritmo ou 
 * implementações padrão para algumas dessas etapas.
 */