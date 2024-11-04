public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTV(){
        ligada = true;
    }

    public void desligarTV(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume--;
    }

    public void diminuirVolume(){
        volume++;
    }
    
    public void trocarCanal(int canalNovo){
        //canal = System.out.readline(canalNovo);
    }
}