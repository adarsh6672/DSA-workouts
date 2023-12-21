package practice.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private HashMap<Integer,List<Integer>> graph=new HashMap<>();

    public void addVertex(int data){
        if(!graph.containsKey(data)){
            graph.put(data, new ArrayList<>());
        }
        return;
    }

    public void createEdge(int source, int dest, boolean bidir){
        if(!graph.containsKey(source)){
            graph.put(source, new ArrayList<>());
        }
        if(!graph.containsKey(dest)){
            graph.put(dest, new ArrayList<>());
        }

        graph.get(source).add(dest);
        if(bidir){
            graph.get(dest).add(source);
        }
    }

    public void display(){
        for(Map.Entry<Integer,List<Integer>> entry: graph.entrySet()){
            System.out.print( entry .getKey()+"  :  ");

            for(int data:entry.getValue()){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex(4);
        graph.addVertex(6);
        graph.createEdge(9, 67, false);
        graph.createEdge(9, 4, true);
        graph.createEdge(6, 68 , true);
        graph.display();
    }
}
