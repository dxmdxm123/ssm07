package spring16aopjingtaidaili;
//目标对象  他的方法不行，想让另一个 对象帮他
public class Game {
    public int wangsu =460;
    public int getWangsu(){
        return wangsu;
    }
    //目标对象的目的：目标对象自身的方法 是不行的 想要在不改变这个源代码的基础上 增强这个方法
    public void conNet() {
        System.out.println("游戏本身的网速是 " + this.wangsu);
    }

}
