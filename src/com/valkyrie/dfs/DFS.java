package com.valkyrie.dfs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS {
    private final int vertex;
    private final List<List<Integer>> graph = new ArrayList<>();

    private DFS(int vertex) {
        this.vertex = vertex;
        createGraph();
    }

    public static DFS initialize(int vertex) {
        return new DFS(vertex);
    }

    private void createGraph() {
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public DFS placeData(int ver, int data) {
        graph.get(ver).add(data);
        return this;
    }

    public void start(int startpoint, boolean[] visited) {
        visited[startpoint] = true;
        System.out.printf(" -> %d", startpoint);

        for (int visit : graph.get(startpoint)) {

            if (!visited[visit]) {
                start(visit, visited);
            }

        }
    }
}
