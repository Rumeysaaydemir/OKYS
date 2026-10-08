public class KitapKopyasi {

    private int kopyaNo;
    private Kitap kitap;
    private boolean oduncteMi;

    public KitapKopyasi(int kopyaNo, Kitap kitap) {
        this.kopyaNo = kopyaNo;
        this.kitap = kitap;
        this.oduncteMi = false;
    }

    public int getKopyaNo() {
        return kopyaNo;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public boolean isOduncteMi() {
        return oduncteMi;
    }

    public void setOduncteMi(boolean oduncteMi) {
        this.oduncteMi = oduncteMi;
    }
}