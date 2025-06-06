package com.Jacob;

import com.birdbrain.Finch;

public class DanceFinch extends Finch {

    public void opening() {
        setMove("B",30,100);
        setTurn("R",180,100);
        setMove("B",30,100);
        setTurn("R",180,100);
    }

    public void taunt() {
        print("WATCHTHIS");
        pause(6);
        for(int i=0;i<2;i++){
            setTurn("L",360,100);
        }
    }

    public void lightShow() {
        int[] violet = {99, 1, 76};
        int[] orange = {99, 56, 1};
        int[] blue = {4, 1, 99};

        setTail("all",violet[0],violet[1],violet[2]);
        setBeak(violet[0],violet[1],violet[2]);
        pause(2);

        setTail("all",orange[0],orange[1],orange[2]);
        setBeak(orange[0],orange[1],orange[2]);
        pause(2);

        setTail("all",blue[0],blue[1],blue[2]);
        setBeak(blue[0],blue[1],blue[2]);
        pause(2);

        setTail("all",0,0,0);
        setBeak(0,0,0);
    }
}