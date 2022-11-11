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