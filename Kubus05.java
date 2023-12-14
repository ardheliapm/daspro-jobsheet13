public class Kubus05 {
    private double sisi;
    public static void main(String[] args) {
       double sisiKubus = 4;
       Kubus05 kubus = new Kubus05();
        kubus.sisi = sisiKubus;
       System.out.println("Volume Kubus dengan sisi " + sisiKubus + " : " + kubus.hitungVolume());
       System.out.println("Luas Permukaan Kubus dengan sisi " + sisiKubus + "  : " + kubus.hitungLuasPermukaan());
     }  public double hitungVolume (){
    return sisi * sisi * sisi;
}
public double hitungLuasPermukaan (){
    return 6 * sisi * sisi;
} }
