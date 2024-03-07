import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do compositor: ");
        String nomeP1 = input.next();
        System.out.println("Digite a idade do compositor: ");
        int idadeP1 = input.nextInt();

        System.out.println("Digite o nome do segundo compositor: ");
        String nomeP2 = input.next();
        System.out.println("Digite a idade do segundo compositor: ");
        int idadeP2 = input.nextInt();

        Pessoa p1 = new Pessoa(nomeP1, idadeP1);
        Pessoa p2 = new Pessoa(nomeP2, idadeP2);

        System.out.println("Digite o nome da primeira musica: ");
        String nomeM1 = input.next();
        System.out.println("Digite a duracao da primeira musica: ");
        int duracaoM1 = input.nextInt();

        System.out.println("Digite o nome da segunda musica: ");
        String nomeM2 = input.next();
        System.out.println("Digite a duracao da segunda musica: ");
        int duracaoM2 = input.nextInt();

        System.out.println("Digite o nome da terceira musica: ");
        String nomeM3 = input.next();
        System.out.println("Digite a duracao da terceira musica: ");
        int duracaoM3 = input.nextInt();

        Musica m1 = new Musica(nomeM1, duracaoM1, p1);
        Musica m2 = new Musica(nomeM2, duracaoM2, p2);
        Musica m3 = new Musica(nomeM3, duracaoM3, p1);

        System.out.println("Digite o genero do album: ");
        String genero = input.next();
        System.out.println("Digite o ano do album: ");
        int ano = input.nextInt();
        System.out.println("Digite o nome do album: ");
        String nome = input.next();
        ArrayList<Musica> musicas = new ArrayList<>();
        musicas.add(m1);
        musicas.add(m2);
        musicas.add(m3);

        Album a1 = new Album(genero, ano, nome, p2, musicas);

        a1.mostraTodosOsDados();

    }
}