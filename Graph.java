import java.util.ArrayList;
import Node.java;
import Edge.java;

public class Graph {

    public ArrayList<Node> nodes;

    public Graph(){
        this.nodes = new ArrayList<Node>();
    }

    public void addNode(Node n){
        nodes.add(n);
    }

}