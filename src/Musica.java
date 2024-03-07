public class Musica {
    private String titulo;
    private int duracao;
    private Pessoa compositor;

    public Musica(String titulo, int duracao, Pessoa compositor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.println(this.titulo + " esta tocando");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public Pessoa getCompositor() {
        return compositor;
    }
}
