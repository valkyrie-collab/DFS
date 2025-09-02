package com.valkyrie;

import com.valkyrie.dfs.DFS;

public class Main {
    //Rishav
    //Riya
    //Maitreyee
	//Rajarshi
    public static void main(String[] args) {
        DFS dfs = DFS.initialize(6).placeData(0, 1)
                .placeData(0, 2).placeData(1, 3)
                .placeData(1, 4).placeData(2, 5);
        dfs.start(0, new boolean[6]);
        // test
        // test2 by Rishav
        // test3 by Riya
        // test by Chakravarthy
	// test by rajarshi
    }
}
