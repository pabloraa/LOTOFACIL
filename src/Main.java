import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        menuOpcoes();

        int opcao;

        System.out.println("DIGITE A OPÇÃO: ");

        opcao = entrada.nextInt();

            do {

                switch (opcao) {

                    case 1:

                        System.out.println(" 1 - APOSTA DE 0 ATÉ 100");

                        System.out.println("DIGITE UM NÚMERO ENTRE 0 E 100: ");

                        int x = entrada.nextInt();

                        if(x > 100 || x < 0){

                        System.out.println("APOSTA INVÁLIDA");

                        }

                        if (x == geraNumerosAleatorios()) {

                            System.out.println("VOCÊ GANHOU R$ 1000");

                        } else {

                            System.out.println("QUE PENA O NÚMERO SORTEADO FOI: " + x);

                        }
                        break;

                    case 2:

                        System.out.println(" 2 - APOSTAR DE A À Z ");

                        System.out.println("DIGITE UMA LETRA ENTRE A E Z: ");

                        char letra = entrada.next().charAt(0);

                        char letraPremiada = 'P';

                        if(!Character.isLetter(letra)){

                        System.out.println("APOSTA INVÁLIDA, DIGITE UM CARACTER VÁLIDO");

                        }

                        if (letra == gerarLetrasAleatorias()) {

                            System.out.println("VOCÊ GANHOU R$ 500 REAIS");
                        } else {

                            System.out.println("QUE PENA A LETRA SORTEADA FOI: " + letraPremiada);
                        }
                        break;

                    case 3:

                        System.out.println(" 3 - APOSTAR EM PAR OU ÍMPAR ");

                        System.out.println("DIGITE UM NÚMERO INTEIRO");

                        int numero = entrada.nextInt();

                        if(numero%2 == 0){

                            System.out.println("VOCÊ GANHOU R$ 100 REAIS");

                        }
                        else{

                            System.out.println("QUE PENA! O NÚMERO DIGITADO É IMPAR E A PREMIAÇÃO É PARA NÚMERO PARES");
                        }
                        break;

                    case 4:

                        System.out.println("VOCÊ ESCOLHEU A OPÇÃO SAIR");

                        break;
                }

                System.out.println("DESEJA FAZER OUTRA APOSTA?");

                opcao = entrada.nextInt();

            } while (opcao != 0);
    }

        public static void menuOpcoes(){

            System.out.println("\n");

            System.out.println("--------------------MENU DE OPÇÕES DA LOTO FÁCIL RANGEL---------------------\n");

            System.out.println("****************************************************************************\n");

            System.out.println("                      1 - APOSTAR DE 0 A 100\n ");

            System.out.println("                      2 - APOSTAR DE A A Z\n ");

            System.out.println("                      3 - APOSTAR EM PAR OU ÍMPAR\n ");

            System.out.println("                      0 - SAIR\n ");

            System.out.println("\n****************************************************************************");


        }

        public static int geraNumerosAleatorios(){

            Random aleatorio = new Random();

            int numeroAleatorio = aleatorio.nextInt(101);

            return numeroAleatorio;

        }
        public static char gerarLetrasAleatorias(){

            Random aleatorio = new Random();

            char letraAleatoria = (char) (aleatorio.nextInt(26) + 'a');

            System.out.println(letraAleatoria);

            //return letraAleatoria;

            return Character.toUpperCase(letraAleatoria);
        }
}