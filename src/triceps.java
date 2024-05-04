import java.util.Scanner;

public class triceps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas repetições você faz por serie de peito?");
        String repTriceps = scanner.nextLine();
        System.out.println("quantas series ?");
        String serieTriceps = scanner.nextLine();
        System.out.println("quantos exercicios");
        String exTriceps = scanner.nextLine();
        System.out.println("quantas vezes na semana");
        String freqTriceps = scanner.nextLine();
        int repTricepsint = Integer.parseInt(repTriceps);
        if (repTricepsint >= 20)
        {
            System.out.println("você faz muitas repetições");
        } else if (repTricepsint <= 8) {
            System.out.println("você faz poucas repeticões");

        }
        else{
            System.out.println("você faz uma boa margem de repetições");
        }

        System.out.println(" então você treina "+ freqTriceps+" vezes na semana faz "+ serieTriceps + " series com " + repTriceps + " repetiçoes em " + exTriceps + " execicíos " );
        int volume = Integer.parseInt(serieTriceps) * Integer.parseInt(exTriceps) * Integer.parseInt(freqTriceps) ;
        System.out.println(volume);
        int volumeint = Integer.parseInt(String.valueOf(volume));
        if (volume <= 4) {
            System.out.println("MV");
        }else if (volume <= 6 ) {
            System.out.println("MEV");
        } else if (volume <=10) {
            System.out.println("MAV");
        } else if (volume <= 14) {
            System.out.println("MAV");
        } else if (volume <= 18) {
            System.out.println("MRV");
        }else {
            System.out.println("você treina muito errado ");
        }
        System.out.println("""
                MV = volume de manutenção : volume minimo para manter sua massa muscular
                MEV = volume minimo efetivo : volume minimo para ter algum resultado
                MAV = volume maximo adaptavel : volume ideal para maximizar seus resultados 
                MRV = volume maximo recuperavel : volume maximo a qual você e capaz de se recuperar 
                essa calculadora e baseada nos estudos do DR.mike iratel""");
    }
}
