public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Novo canal : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal : " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("TV Ligada : " + smartTv.canal);
        System.out.println("TV Ligada : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}