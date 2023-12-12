import java.util.Scanner;

/**
 * UcapanTerimakasih_05
 */
public class UcapanTerimakasih_05 {

    private static final String Ucapan = null;
    public static String PenerimaUcapan() { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static String UcapanTerimaKasih(String ucapan){
        String nama = PenerimaUcapan();
        System.out.println("Thankyou for being the best teacher in the world. \n" + 
        "You inspired in me a love for learning and made me feel like i could ask you anything");
        return ucapan;

    }
    public static void ucapanTambahan( String namaPenerima){
System.out.println ("Semoga selalu sehat Bu, dan tetap tauladan untuk para mahasiswanya ");
     }
      public static void main(String[] args) {
        
        String namaPenerima = UcapanTerimaKasih();
        
        
        ucapanTambahan(namaPenerima);
        
        
        }

    private static String UcapanTerimaKasih() {
        return null;
    }
    
    
}