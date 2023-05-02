public class Main {

    public static void main(String[] args) {
        int numeroInteiro = 3;
        float numeroReal = 2134.44f;
        char letra = 'J';
        boolean terminado = false;

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("Lógico: " + terminado);
        System.out.println("================================");

        System.out.printf("O valor do float: %.1f \n", numeroReal);

        System.out.println("================================");
        String nome = "Rafael";
        float media = 8.9f;
        System.out.printf("A nota de %s é %.3f \n", nome, media);
        System.out.format("A nota de %s é %.3f \n", nome, media);

    }
}