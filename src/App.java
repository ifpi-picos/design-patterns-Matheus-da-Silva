public class App {
    public static void main(String[] args) {
        RedeSocial facebook = new Facebook();
        facebook.postagemTexto();

        System.out.println("--------------------");

        RedeSocial twitter = new Twitter();
        twitter.fazerComentario();

        System.out.println("--------------------");

        RedeSocial instagram = new Instagram();
        instagram.fazerLive();

        System.out.println("--------------------");
    }
}

/*
 * Classe que contém objetos que implementam a interface ou herdam da classe abstrata.
 */