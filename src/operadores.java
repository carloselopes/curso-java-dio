public class operadores {
    public static void main(String[] args) throws Exception {
        int numeroSoma = 1 + 2; //soma
        System.out.println(numeroSoma);
        int numeroSubtracao = 4 - 1; //subtração
        System.out.println(numeroSubtracao);
        int numeroMultiplicacao = 4 * 1; //multiplicação
        System.out.println(numeroMultiplicacao);
        int numeroDivisao = 4 / 2; //divisão
        System.out.println(numeroDivisao);

        String nomePessoa = "Carlos" + " " + "Eduardo"; //concatenação
        System.out.println(nomePessoa);

        int numero = 7;
        System.out.println(- numero); //imprime o número negativo
        System.out.println(+ numero); //imprime o número positivo
        numero++; //incrementa 1 ao numero
        System.out.println(numero);
        numero--; //drecrementa 1 ao numero
        System.out.println(numero);
        System.out.println(numero);

        int a, b;
        a = 5;
        b = 6;

        String resultado = (a==b) ? "Verdadeiro" : "Falso"; //comparador ternário
        System.out.println(resultado);

        int n1 = 5;
        int n2 = 7;

        boolean verdadeiroFalso = n1 == n2;

        verdadeiroFalso = n1 != n2;
        System.out.println(verdadeiroFalso);

        verdadeiroFalso = n1 > n2;
        System.out.println(verdadeiroFalso);
    }
}

