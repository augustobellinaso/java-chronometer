import java.util.Scanner;

/**
 * @author Augusto Loose Bellinaso
 */
public class Chronometer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo (em minutos) para executar o cronômetro: ");
        int minutosTotal = sc.nextInt();

        int hora = 0; //para armazenar quantas horas já se passaram
        for (int minuto = 0; minuto < minutosTotal; minuto++) { //loop para minutos

            for (int segundo = 0; segundo < 60; segundo++) { //loop pra segundos
                try {
                    System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
                    Thread.sleep(1000);

                } catch (Exception e) {
                }
            }

            //Verificação pra aumentar o contador das horas
            //No minuto 59, o próximo passo deve ser aumentar a hora e zerar o ponteiro dos minutos
            if (minuto == 59) {
                hora++; //Incrementa a hora em 1
                minutosTotal -= 60; //subtrai da quantidade total de minutos fornecida os 60 minutos que já passaram.
                minuto = -1;
                // coloca a variável em -1 pois antes de ir pra próxima iteração do loop ele faz o incremento
                //e assim o loop reinicia em 0, iterando da maneira correta
            }
        }
    }

}
