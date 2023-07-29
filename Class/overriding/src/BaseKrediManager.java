public class BaseKrediManager {
    //final : override edilmesini engeller.
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
    public String toString(){
        return getClass().getName();
    }
}
