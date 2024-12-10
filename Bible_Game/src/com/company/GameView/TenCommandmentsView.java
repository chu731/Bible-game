package com.company.GameView;

import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView{

    public ArrayList<TenCommandment> getStones() {
        return stones;
    }

    private ArrayList<TenCommandment> stones = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    private int count;

    public TenCommandmentsView() {
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        count = 0;

        stones.add(new TenCommandment(5,5));
        stones.add(new TenCommandment(1,5));
        stones.add(new TenCommandment(2,4));
        stones.add(new TenCommandment(2,3));
        stones.add(new TenCommandment(4,4));
        stones.add(new TenCommandment(6,6));
        stones.add(new TenCommandment(8,1));
        stones.add(new TenCommandment(8,2));
        stones.add(new TenCommandment(1,3));
        stones.add(new TenCommandment(5,4));

        elements.addAll(stones);
    }
}
