package com.Jacob;

import com.birdbrain.Finch;

public class FinalProject {
    public static void main(String[] args) {
        DanceFinch myFinch = new DanceFinch();

        myFinch.opening();
        myFinch.taunt();
        myFinch.lightShow();

        myFinch.disconnect();
    }
}