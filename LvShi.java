package spring16aopjingtaidaili;

public class LvShi {
    private BeiGaoren beiGaoren;
    private int aj;

    private void newanjian(){
        System.out.println("案件本身是 = " + this.aj);
    }

    public BeiGaoren getBeiGaoren() {
        return beiGaoren;
    }

    public void setBeiGaoren(BeiGaoren beiGaoren) {
        this.beiGaoren = beiGaoren;
    }

    public int getAj() {
        return aj;
    }

    public void setAj(int aj) {
        this.aj = aj;
    }
}
