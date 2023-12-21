package practice.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
        if(!graph.get(source).contains(dest)){
            graph.get(source).add(dest);
            
        }
        
        if(bidir && !graph.get(dest).contains(source)){
            graph.get(dest).add(source);
            
            
        }
    }

    public void deleteVertex(int vert){
        graph.remove(vert);
        for(Map.Entry<Integer,List<Integer>> entry:graph.entrySet()){
            if(entry.getValue().contains(vert)){
                entry.getValue().remove(Integer.valueOf(vert));
            }
        }
    }

    public void deleteEdge(int source , int dest){
        if(graph.containsKey(source)){
            if(graph.get(source).contains(dest)){
                graph.get(source).remove(Integer.valueOf(dest));
            }
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

    public int getVertexCount(){
        return graph.size();
    }

    public int getEdgeCount(){
        int count=0;
        for(Map.Entry<Integer,List<Integer>> entry:graph.entrySet()){
            count=count+entry.getValue().size();
        }
        return count;
    }
    public void BFS(){
        Set<Integer>visited=new HashSet<>();
        for(int key:graph.keySet()){
            if(!visited.contains(key)){
                BFS(key,visited);
            }
            
        }
        
    }

    public void BFS(int src,Set<Integer>visited){
        
        Queue<Integer>queue=new LinkedList<>();

        visited.add(src);
        queue.add(src);
        while(!queue.isEmpty()){
            src=queue.poll();
            System.out.print(src+"  ");
            Iterator<Integer> i=graph.get(src).iterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited.contains(n)){
                    queue.add(n);
                    visited.add(n);
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex(4);
        graph.addVertex(6);
        graph.createEdge(9, 67, false);
        graph.createEdge(9, 67, false);
        graph.createEdge(9, 4, true);
        graph.createEdge(6, 68 , true);
        
        graph.display();
        
        System.out.println("=====================================");
        graph.BFS();
        
        
    }
}
