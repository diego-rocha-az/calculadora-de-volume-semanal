import java.util.Scanner;

public class pernas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas repetições você faz por serie de peito?");
        String repPerna = scanner.nextLine();
        System.out.println("quantas series ?");
        String seriePerna = scanner.nextLine();
        System.out.println("quantos exercicios");
        String exPerna = scanner.nextLine();
        System.out.println("quantas vezes na semana");
        String freqPerna = scanner.nextLine();
        int repPernaint = Integer.parseInt(repPerna);
        if (repPernaint >= 14)
        {
            System.out.println("você faz muitas repetições");
        } else if (repPernaint <= 6) {
            System.out.println("você faz poucas repeticões");

        }
        else{
            System.out.println("você faz uma boa margem de repetições");
        }

        System.out.println(" então você treina "+ freqPerna+" vezes na semana faz "+ seriePerna + " series com " + repPerna + " repetiçoes em " + exPerna + " execicíos " );
        int volume = Integer.parseInt(seriePerna) * Integer.parseInt(exPerna) * Integer.parseInt(freqPerna) ;
        System.out.println(volume);
        int volumeint = Integer.parseInt(String.valueOf(volume));
        if (volume <= 8) {
            System.out.println("MV");
        }else if (volume <= 10 ) {
            System.out.println("MEV");
        } else if (volume <=12) {
            System.out.println("MAV");
        } else if (volume <= 20) {
            System.out.println("MAV");
        } else if (volume <= 22) {
            System.out.println("MRV");
        }else {
            System.out.println("você treina muito errado ");
        }
        System.out.println("""
                MV = volume de manutenção : volume minimo para manter sua massa muscular
                MEV = volume minimo efetivo : volume minimo para ter algum resultado
                MAV = volume maximo adaptavel : volume ideal para maximizar seus resultados 
                MRV = volume maximo recuperavel : volume maximo a qual você e capaz de se recuperar""");
    }
}
