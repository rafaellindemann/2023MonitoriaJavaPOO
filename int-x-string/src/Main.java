public class Main {
    public static void main(String[] args) {
        ///////// int to str
        int idade = 18;
        String texto = Integer.toString(idade);
        System.out.println("Texto convertido: " + texto);

//        System.out.println("Texto convertido: " + Integer.toString(idade));

        /////////// str to int
        String textoParaConverter = "30";
        int valorConvertido = Integer.parseInt(textoParaConverter);
        System.out.println("Valor convertido: "+valorConvertido);

        /////////// str to float
        textoParaConverter = "3.04";
        float floatConvertido = Float.parseFloat(textoParaConverter);
        floatConvertido += 1.5;
        System.out.println("Float convertido: "+floatConvertido);


    }
}