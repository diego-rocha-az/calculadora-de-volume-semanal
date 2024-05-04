import java.util.Scanner;

public class ombro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas repetições você faz por serie de peito?");
        String repOmbro = scanner.nextLine();
        System.out.println("quantas series ?");
        String serieOmbro = scanner.nextLine();
        System.out.println("quantos exercicios");
        String exOmbro = scanner.nextLine();
        System.out.println("quantas vezes na semana");
        String freqCostas = scanner.nextLine();
        int repOmbroint = Integer.parseInt(repOmbro);
        if (repOmbroint >= 14)
        {
            System.out.println("você faz muitas repetições");
        } else if (repOmbroint <= 6) {
            System.out.println("você faz poucas repeticões");

        }
        else{
            System.out.println("você faz uma boa margem de repetições");
        }

        System.out.println(" então você treina "+ freqCostas+" vezes na semana faz "+ serieOmbro + " series com " + repOmbro + " repetiçoes em " + exOmbro + " execicíos " );
        int volume = Integer.parseInt(serieOmbro) * Integer.parseInt(exOmbro) * Integer.parseInt(freqCostas) ;
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
