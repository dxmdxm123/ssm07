package spring16aopjingtaidaili;
/*
* 代理对象，用于增强对象的方法
*   游戏   讯游加速器
*    王宝强  宋吉吉
*    浏览器   ypn
*    被告人   律师
*
*    请问，
* */
public class JiaSuQi {
    private Game game;//代理类才是主类， 代理对象依赖目标对象，  代理对象包含了目标对象
    private int ws;


    //代理对象的方法  而且  必须和 目标对象一样 因为 代理对象也要目标对象的方法   不然 怎么增强
    public void conNet(){
        //这个目标 要承接  目标对象的方法
        int wangsu = game.getWangsu();//目标对象的网速方法
        this.ws= wangsu-400;
        System.out.println("现在打游戏的网速 = " + this.ws);

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
