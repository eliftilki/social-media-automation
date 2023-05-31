import java.util.ArrayList;
public class iskullanici extends kullanici implements hizmet  {
    private String sirketad;
    private boolean satis;
    public iskullanici(String username,String sifre,String email, String sirketad,boolean satis) {
        super(username,sifre,email);
        this.sirketad = sirketad;
        this.satis=satis;
    }
    public String getSirketad() {
        return sirketad;
    }

    public void setSirketad(String sirketad) {
        this.sirketad = sirketad;
    }
    public boolean isSatis() {
        return satis;
    }

    public void setSatis(boolean satis) {
        this.satis = satis;
    }
    ArrayList<String> urunler=new ArrayList<>();
    int satismiktari;
    @Override
    void kendibilgilerim() {
        System.out.println("**************************************");
        System.out.println("kullanıcı adı:"+this.getUsername());
        System.out.println("şirket adı:"+this.getSirketad());
        System.out.println("şifre:"+this.getSifre());
        System.out.println("email:"+getEmail());
        System.out.println("takipçi sayısı:"+this.takipci);
        System.out.println("takip edilen sayısı:"+this.takipedilen);
        System.out.println("satış durumu:"+this.isSatis());
        System.out.println("post sayısı:"+this.postS);
        System.out.println("yazı sayisi:"+this.metin.size());
        System.out.println("satış miktarı:"+this.satismiktari);
        System.out.println("satıştaki ürün sayısı "+this.urunler.size());
        System.out.println("**************************************");
    }
    public void urunekle(){
        while(true){
        System.out.println("eklemek istediğiniz ürünü giriniz(çıkmak için q)");
         String mal=scan.nextLine();
        if(mal.equals("q")){
            break;
        }
        else{
        this.urunler.add(mal);}
    }}

    public void reklamVer(unlukullanici uk1){
        if(uk1.isReklam()==true){
        System.out.println("tebrikler "+uk1.getGad()+" 'a reklam verdiniz.");
        uk1.treklam=uk1.treklam+1;}
        else{
            System.out.println("bu hesap reklam kabul etmiyor.");
        }
    }

    @Override
    public void hizmetucreti() {
        if(this.isSatis()==true){
            System.out.println("platform üzerinden satış yapıldığından aylık komisyon alınmıştır.");
        }
        else{
            System.out.println("hizmet bedeli bulunmuyor.");
        }}
}
