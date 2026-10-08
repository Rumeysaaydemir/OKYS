public class OduncKaydi {

    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;

        kitapKopyasi.setOduncteMi(true);
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public KitapKopyasi getKitapKopyasi() {
        return kitapKopyasi;
    }
}