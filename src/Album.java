import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, Pessoa artista, ArrayList<Musica> musicas){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    public void mostraTodosOsDados(){
        System.out.println("Nome do album: " + nome);
        System.out.println("Ano de lancamento: " + ano);
        System.out.println("Genero do album: " + genero);
        System.out.println("Artista do album e sua idade: " + artista.getNome() + ", " + artista.getIdade());
        for (int i = 0; i < musicas.size(); i++){
            System.out.println("Titulo da musica: " + musicas.get(i).getTitulo());
            System.out.println("Duracao da musica (em segundos): " + musicas.get(i).getDuracao());
            System.out.println("Nome e idade do compositor: " + musicas.get(i).getCompositor().getNome() + ", " + musicas.get(i).getCompositor().getIdade());
        }

    }
}
