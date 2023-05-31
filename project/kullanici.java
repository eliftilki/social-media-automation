public class kullanici extends profil implements hizmet{
    public kullanici(String username,String sifre,String email) {

        super(username,sifre,email);
    }
    @Override
    void kendibilgilerim() {
        System.out.println("**************************************");
        System.out.println("kullanıcı adı:"+this.getUsername());
        System.out.println("şifre:"+this.getSifre());
        System.out.println("email:"+getEmail());
        System.out.println("takipçi sayısı:"+this.takipci);
        System.out.println("takip edilen sayısı:"+this.takipedilen);
        System.out.println("post sayısı:"+this.postS);
        System.out.println("yazı sayisi:"+this.metin.size());
        System.out.println("**************************************");
    }
    @Override
    public void hizmetucreti() {
        System.out.println("hizmet ücreti bulunmuyor.");
    }

    @Override
    public void bilgileriniGor(kullanici kl4) {
        System.out.println("**************************************");
        System.out.println("kullanıcı adı:"+kl4.getUsername());
        System.out.println("takipçi sayısı:"+kl4.takipci);
        System.out.println("takip edilen sayısı:"+kl4.takipedilen);
        if(kl4 instanceof iskullanici){
            System.out.println("şirket adı:"+((iskullanici) kl4).getSirketad());
            System.out.println("satış durumu:"+((iskullanici) kl4).isSatis());
            System.out.println("satıştaki ürün miktarı:"+((iskullanici) kl4).urunler.size());
        }
        if(kl4 instanceof unlukullanici){
            System.out.println("kişi:"+((unlukullanici) kl4).getGad());
            System.out.println("toplam like sayısı:"+((unlukullanici) kl4).tlike);
            System.out.println("reklam durumu:"+((unlukullanici) kl4).isReklam());
        }
        System.out.println("**************************************");
    }
}
