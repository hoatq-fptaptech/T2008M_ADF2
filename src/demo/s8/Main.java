package demo.s8;

import config.Connector;

public class Main {
    public static void main(String[] args){
//        Connector c = new Connector(); // error
        Connector c = Connector.getInstance();
    }
}
