public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        //volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
         //volume = volume - 1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        //canal = canal + 1;
    }

    public void diminuirCanal(){
        canal--;
        //canal = canal - 1;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
