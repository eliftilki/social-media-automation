import java.util.ArrayList;
import java.util.Scanner;
public abstract class profil {
    private String username;
    private String sifre;
    private String email;
    public profil(String username,String sifre,String email ) {
        this.username = username;
        this.sifre=sifre;
        this.email=email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    abstract void kendibilgilerim();
    ArrayList<String> metin=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    int postS;
    int takipci;
    int takipedilen;

    public void resimGonder() {
        System.out.println("fotoğraf paylaşıldı.");
        this.postS=this.postS+1;
    }
    public void yaziGonder() {
        System.out.println("fikrinizi paylaşın:");

        String yazi=scan.nextLine();
        this.metin.add(yazi);
    }
    public void yazi() {
        int i;
        for(i=0;i<this.metin.size();i++){
            System.out.println(getUsername()+" kullanıcının "+(i+1)+". metin göderisi:"+this.metin.get(i));
        }}
    public void like(kullanici kl2) {
        if(kl2.metin.size()==0){
            System.out.println("kullanıcının gönderisi bulunmuyor.");
        }
        else{
        System.out.println("kullanıcının gönderileri:");
        kl2.yazi();
        System.out.println("beğeni göndereceğiniz gönderiyi seçiniz:");
        int gndri=scan.nextInt();
        scan.nextLine();
        System.out.println("gönderiyi beğendiniz.");
        if(kl2 instanceof unlukullanici){
            if(((unlukullanici) kl2).isReklam()==true){
                ((unlukullanici) kl2).tlike=((unlukullanici) kl2).tlike+1;}
        }
    }
    }
    public void takipetme(kullanici kl1) {
        System.out.println("tebrikler artık "+kl1.getUsername()+" adlı kullanıcıyı takip ediyorsunuz.");
        kl1.takipci= kl1.takipci+1;
        this.takipedilen=this.takipedilen+1;
    }

    public void satinal(iskullanici iki1) {
        if(iki1.isSatis()==true){
            if(iki1.urunler.size()!=0){
            System.out.println("mağazaya hoşgeldiniz");
            System.out.println("ürünlerimiz:");
            int i;
            for(i =0;i<iki1.urunler.size();i++){
                System.out.println(i+1+". "+iki1.urunler.get(i));
            }
            System.out.println("almak istediğiniz ürünü seçiniz:");
            int secim=scan.nextInt();
            System.out.println(iki1.getUsername()+" kullanıcı adlı"+iki1.getSirketad()+" şirketinten"+secim+
                    " numaralı ürün için satın alım yaptınız.");
            iki1.satismiktari=iki1.satismiktari+1;}
        else{
                System.out.println("üzgünüz satışta ürün yok");
        }
        }
        else{
            System.out.println("üzgünüz"+iki1.getUsername()+" kullanıcı adlı"+
                    iki1.getSirketad()+" şirketi satış yapmıyor.");
        }
    }
}
