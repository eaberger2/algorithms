public class Node{

    public int data;
    public ArrayList<Edge> edges;

    public Node(int data){
        this.data = data;
    }

    public void addEdge(Node t,int length){
        this.edges.add(new Edge(t,length));
    }
    
    public ArrayList<Edge> getEdges(){
        return this.edges;
    }
}