import java.util.Scanner;

public class costas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas repetições você faz por serie de peito?");
        String repCostas = scanner.nextLine();
        System.out.println("quantas series ?");
        String serieCostas = scanner.nextLine();
        System.out.println("quantos exercicios");
        String exCostas = scanner.nextLine();
        System.out.println("quantas vezes na semana");
        String freqCostas = scanner.nextLine();
        int repCostasint = Integer.parseInt(repCostas);
        if (repCostasint >= 14)
        {
            System.out.println("você faz muitas repetições");
        } else if (repCostasint <= 6) {
            System.out.println("você faz poucas repeticões");

        }
        else{
            System.out.println("você faz uma boa margem de repetições");
        }

        System.out.println(" então você treina "+ freqCostas+" vezes na semana faz "+ serieCostas + " series com " + repCostas + " repetiçoes em " + exCostas + " execicíos " );
        int volume = Integer.parseInt(serieCostas) * Integer.parseInt(exCostas) * Integer.parseInt(freqCostas) ;
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
                MRV = volume maximo recuperavel : volume maximo a qual você e capaz de se recuperar 
                essa calculadora e baseada nos estudos do DR.mike iratel""");
    }
}
