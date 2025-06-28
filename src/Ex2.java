public class Ex2 {

    static class Aluno {
        private static int contadorAlunos = 0;

        public Aluno() {
            contadorAlunos++;
        }

        public static int getTotalAlunos() {
            return contadorAlunos;
        }

        public static void main(String[] args) {
            Aluno a1 = new Aluno();
            Aluno a2 = new Aluno();
            Aluno a3 = new Aluno();
            Aluno a4 = new Aluno();
            Aluno a5 = new Aluno();
            Aluno a6 = new Aluno();
            Aluno a7 = new Aluno();
            Aluno a8 = new Aluno();
            Aluno a9 = new Aluno();
            Aluno a10 = new Aluno();

            System.out.println("Total de alunos criados: " + Aluno.getTotalAlunos());
        }
    }
}
