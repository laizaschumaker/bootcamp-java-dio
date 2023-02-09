public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status após chamada do método ligar -> A TV está ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Novo canal informado: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status após chamada do método desligar -> A TV está ligada? " + smartTv.ligada);

    }
}
