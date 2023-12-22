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
import java.util.Stack;

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
    public void BFS(int n){
        Set<Integer>visited=new HashSet<>();
        BFS(n,visited);
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

    public void DFS(int n){
        Set<Integer>visited=new HashSet<>();
        DFS(n,visited);
        for(int key:graph.keySet()){
            if(!visited.contains(key)){
                DFS(key,visited);
            }
        }
    }
    public void DFS(int root,Set<Integer>visited){
        Stack<Integer>stack=new Stack<>();
        stack.push(root);
        visited.add(root);
        while(!stack.isEmpty()){
            int n=stack.pop();
            System.out.print(n+"  ");
            Iterator<Integer>i=graph.get(n).iterator();
            while(i.hasNext()){
                int s=i.next();
                if(!visited.contains(s)){
                    stack.push(s);
                    visited.add(s);
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.createEdge(0, 1, true);
        graph.createEdge(1, 2, true);
        graph.createEdge(0, 2, true);
        graph.createEdge(1, 3 , true);
        graph.createEdge(3, 4, true);
        graph.createEdge(2, 4, true);
        
        graph.display();
        System.out.println("=====================================");
        graph.DFS(0);
        System.out.println("=====================================");
        graph.BFS(0);
        
        
    }
}
