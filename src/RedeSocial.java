public abstract class RedeSocial {

    // TemplateMethod()
    public final void executar() { 
        logar();
        postagem();
        publicar();
    }

    public void logar() {
        System.out.println("Você está logado!");
    }

    // Método abstrato com implementação específica em cada classe concreta
    abstract void postagem(); 

    public void publicar() {
        System.out.println("Postagem realizada com sucesso!");
    }
}

/*
 * Essa classe declara o método padrão, “templateMethod()” aqui chamado de 'executar()', que define a sequência de passos do algoritmo. 
 * Contém métodos abstratos representando as etapas do algoritmo ou 
 * implementações padrão para algumas dessas etapas.
 */