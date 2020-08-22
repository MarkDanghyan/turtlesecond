package com.turtlesecondgdx.game;

import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ArrayList list1 = new ArrayList();
        System.out.println(list.getClass());
        try {
            Class cls = Class.forName("Rock");
            System.out.println(cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
