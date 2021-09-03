package spring16aopjingtaidaili;

public class BeiGaoren {
    public int anjian;
    public int getanjian(){
        return getanjian();
    }
    private void newanjian(){
        System.out.println("案件本身是 = " + this.anjian);
    }
}
