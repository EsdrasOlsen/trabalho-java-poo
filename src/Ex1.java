public class Ex1 {

        static class Carro{
            int anoFabricacao;
            int numeroPortas;

            static final String MODELO = "Model T";
            static final String COR = "Preto";

            @Override
            public String toString() {
                return "Carro{" +
                        "Ano da Fabricação: " + anoFabricacao +
                        ", Número de Portas: " + numeroPortas +
                        ", Modelo: " + MODELO +
                        ", Cor: " + COR + '\"' +
                        '}';
            }
        }
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.anoFabricacao = 1920;
        carro.numeroPortas = 2;

        System.out.println(carro);
    }
}
