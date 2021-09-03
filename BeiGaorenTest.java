package spring16aopjingtaidaili;

import org.junit.Test;

public class BeiGaorenTest {
    @Test
    public void test(){
        BeiGaoren anjian =new BeiGaoren();
        LvShi aj = new LvShi();
        aj.getBeiGaoren();
        System.out.println("案子的本身 = " + aj);

    }
}
