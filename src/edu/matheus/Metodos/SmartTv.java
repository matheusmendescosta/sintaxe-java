package edu.matheus.Metodos;

public class SmartTv {
        boolean ligada = false;
        int canal = 0;
        int volume = 0;

        public void ligar(){
            ligada = true;
        }
        public  void desligado(){
            ligada = false;
        }
        public void aumentarVolume(){
            volume ++;
        }
        public void diminuirVolume(){
            volume --;
        }
        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }
        public void aumentarCanal(){
            canal ++;
        }
        public void diminuirCanal(){
            canal --;
        }
}
