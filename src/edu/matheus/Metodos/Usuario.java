package edu.matheus.Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("Tv ligada? " +smartTv.ligada);
        System.out.println("Canal: " +smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " +smartTv.ligada);

        smartTv.desligado();
        System.out.println("Tv ligada? " +smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual " +smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual " +smartTv.canal);
    }
}
