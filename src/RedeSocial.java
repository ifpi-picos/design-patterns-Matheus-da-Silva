public abstract class RedeSocial {

    public final void executar() { // TemplateMethod()
        logar();
        postagem();
        publicar();
    }

    abstract void logar();
    abstract void postagem();
    abstract void publicar();
}

/*
 * Essa classe declara o método padrão, “templateMethod()” aqui chamado de 'executar()', que define a sequência de passos do algoritmo. 
 * Contém métodos abstratos representando as etapas do algoritmo ou 
 * implementações padrão para algumas dessas etapas.
 */