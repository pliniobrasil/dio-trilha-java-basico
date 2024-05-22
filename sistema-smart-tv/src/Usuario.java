public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("New Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("New Status -> TV ligada? " + smartTv.ligada);


    }
}
