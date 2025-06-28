import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    static class Aluno {
        private String nome;
        private int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("Ana", 20));
        lista.add(new Aluno("Bruno", 22));
        lista.add(new Aluno("Carlos", 19));

        System.out.println("Usando for tradicional:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\nUsando for aprimorado:");
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }

        System.out.println("\nUsando forEach com lambda:");
        lista.forEach(aluno -> System.out.println(aluno));
    }
}
