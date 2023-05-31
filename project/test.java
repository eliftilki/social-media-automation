public class test {

    public static void main(String[] args){

        kullanici k1= new kullanici("a","1234","a.mail");
        kullanici k2= new kullanici(k1.getUsername(),"1234","b.mail");

        iskullanici ik1=new iskullanici("c","1234","c.mail","abc",true);
        iskullanici ik2=new iskullanici("d","1234","d.mail","def",false);

        unlukullanici unkl1=new unlukullanici("e","1234","e.mail",true,"abc");
        unlukullanici unkl2=new unlukullanici("f","1234","f.mail",false,"def");

    }
}
