package spring16aopjingtaidaili;

import org.junit.Test;

//
public class GameTest {
    @Test
    public void test01() {

        Game wangzhe = new Game();
        JiaSuQi xunYou = new JiaSuQi();
        xunYou.setGame(wangzhe);//
        xunYou.conNet();//

    }
    }
