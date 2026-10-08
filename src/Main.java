public class Main {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap(
                "9789750719387",
                "Suç ve Ceza",
                "Fyodor Dostoyevski"
        );

        KitapKopyasi kopya1 = new KitapKopyasi(1, kitap1);

        Kullanici kullanici1 = new Kullanici(
                1001,
                "Rümeysa Aydemir"
        );

        OduncKaydi odunc1 = new OduncKaydi(
                kullanici1,
                kopya1
        );

        System.out.println("Kullanıcı: " + odunc1.getKullanici().getAdSoyad());
        System.out.println("Kitap: " + odunc1.getKitapKopyasi().getKitap().getKitapAdi());
        System.out.println("Kopya No: " + odunc1.getKitapKopyasi().getKopyaNo());
        System.out.println("Ödünçte mi: " + odunc1.getKitapKopyasi().isOduncteMi());
    }
}