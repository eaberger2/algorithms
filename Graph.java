import java.util.ArrayList;

public class Node{

    public int data;
    public ArrayList<Edge> edges;

    public Node(int data){
        this.data = data;
    }

    public void addEdge(Node t,int length){
        this.edges.add(new Edge(t,length))
    }

}

public class Edge{
    
    public int length;
    public Node end;

    public Edge(Node e,int l){
        this.end = e;
        this.length = l;
    }

    public Node getEnd(){
        return this.end;
    }

    public int getLength(){
        return this.length;
    }

}

public class Graph {

    public ArrayList<Node> nodes;

    public Graph(){
        nodes = new ArrayList<Node>();
    }

    public void addNode(Node n){
        nodes.add(n);
    }

}