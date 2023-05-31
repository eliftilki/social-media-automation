public class unlukullanici extends kullanici implements hizmet {
    private boolean reklam;
    private String realname;
    public unlukullanici(String username,String sifre,String email,boolean reklam,String realname) {
        super(username,sifre,email);
        this.reklam = reklam;
        this.realname=realname;
    }
    public boolean isReklam() {
        return reklam;
    }

    public void setReklam(boolean reklam) {
        this.reklam = reklam;
    }
    public String getGad() {
        return realname;
    }
    public void setGad(String gad) {
        this.realname = realname;
    }
    int tlike;
    int treklam;

    @Override
    void kendibilgilerim() {
        System.out.println("**************************************");
        System.out.println("kullanıcı adı:"+this.getUsername());
        System.out.println("kişi:"+this.realname);
        System.out.println("şifre:"+this.getSifre());
        System.out.println("email:"+getEmail());
        System.out.println("takipçi sayısı:"+this.takipci);
        System.out.println("takip edilen sayısı:"+this.takipedilen);
        System.out.println("post sayısı:"+this.postS);
        System.out.println("yazı sayisi:"+this.metin.size());
        System.out.println("toplam like sayısı:"+this.tlike);
        System.out.println("toplam reklam sayısı:"+this.treklam);
        System.out.println("reklam durumu: "+this.isReklam());
        System.out.println("**************************************");
    }

    @Override
    public void hizmetucreti() {
        if(this.isReklam()==true){
            System.out.println("platform üzerinden ücretli reklam yapıldığından aylık komisyon alınmıştır.");
        }
        else{
            System.out.println("hizmet bedeli bulunmuyor.");
        }
    }
}
