public class tiposDeVariaveis {
    public static void main(String[] args) throws Exception {
        //AULA 1 - TIPOS E VARIAVEIS
        byte numberByte = 126; //range -128 at 127
        short numberShort = 32766; //range -32.768 at 32.767
        int numberInt = 2147483646; //range -2.147.483.648 at 2.147.483.647
        long numberLong = 9223372036854775807L; //range -9.223.372.036.854.775.808 at 9.223.372.036.854.775.807 //Necessário colocar o L ao final do numero

        double numberDouble = 3.822; //range -1,7976E + 308 at 1,7976E + 308, prec 15 dig MORE USED
        float numberFloat = 3.822F; //range -3,4028E + 38 at 3,4028E + 38, prec 6 – 7 díg //necessário colocar F ao final do numero

        boolean trueOrFalse = true;

        char wordChar = 'P'; //char recebe apenas um caracter
        String wordString = "Palabras"; //pode receber um conjunto de palavras

        final double NUMBER_CONST_DOUBLE = 3.14; //constante que não pode ser alterada

        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println(numberDouble);
        System.out.println(numberFloat);
        System.out.println(trueOrFalse);
        System.out.println(wordChar);
        System.out.println(wordString);
        System.out.println(NUMBER_CONST_DOUBLE);

        //NUMBER_CONST_DOUBLE = 3.15;
    }
}
