public class Ex5 {

    enum Semaforo {
        AMARELO1, VERMELHO, AMARELO2, VERDE
    }

    public static void main(String[] args) {
        Semaforo sem = Semaforo.VERMELHO;

        switch (sem) {
            case AMARELO1:
                System.out.println("Sinal Amarelo! ATENÇÃO!");
            case VERMELHO:
                System.out.println("Sinal Vermelho! PARE!");
            case AMARELO2:
                System.out.println("Sinal Amarelo! ATENÇÂO!");
            case VERDE:
                System.out.println("Sinal Verde! SIGA!");
        }
    }
}
