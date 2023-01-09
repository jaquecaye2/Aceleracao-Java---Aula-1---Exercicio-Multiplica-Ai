public class App {

    public static void main(String[] args) {
        int multiplicador = 5;

        System.out.println("Tabela de multiplicação de " + multiplicador);

        for (int i = 0; i <= 10; i++){
            int resultado = i * multiplicador;
            System.out.println(multiplicador + " x " + i + " = " + resultado);
        }

    }

}
