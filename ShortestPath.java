import Graph;
import java.util.ArrayList;

public ShortestPath{

    public static void main(String[] args){
        Graph g = new Graph();
        Node n1 = new Node(6);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(27);
        n1.addEdge(n2,4);
        n1.addEdge(n3,2);
        n2.addEdge(n3,3);
        n3.addEdge(n4,1);
        n4.addEdge(n1,7);
        n4.addEdge(n5,4);
        n5.addEdge(n3,6);
        g.addNode(n1);
        g.addNode(n2);
        g.addNode(n3);
        g.addNode(n4);
        g.addNode(n5);
    }

    public int findShortestPath(Graph g,Node start,Node end){
        ArrayList<Integer> distance = new ArrayList<Integer>();
        ArrayList<Node> correspondingNode = new ArrayList<integer>();
        distance.add(0);
        correspondingNode.add(start);
        start.getEdges();
    }

}