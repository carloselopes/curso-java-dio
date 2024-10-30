public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv TV = new SmartTv();
        System.out.println("A televisão está ligada? " + TV.ligada);
        System.out.println("Qual canal está? " + TV.canal);
        System.out.println("Qual o volume da televisão? " + TV.volume);
    }
}
