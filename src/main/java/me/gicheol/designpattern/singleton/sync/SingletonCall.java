package me.gicheol.designpattern.singleton.sync;

public class SingletonCall {

    public static void main(String[] args) {
//        Singleton ingleton = new Singleton(); private 생성자이기 때문에 new를 통해 객체 생성 불가
        Singleton instance = Singleton.getInstance();
    }

}
