
import java.util.*;

class Edge {

    int u; // statring point 
    int v; // ending point 
    int w; // weight 

    //Constructor 
    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v; 
        this.w = w;
    }

    @Override
    public String toString() {
       return "{"+this.u+"->"+this.v+":"+this.w+"}";
    }

}

public class Construction {

    public static void addEdge(ArrayList<Edge> [] graph , int u , int v , int w){
        graph[u].add(new Edge(u,v,w));
        graph[v].add(new Edge(v,u,w));
    }

    public static void displayGraph(ArrayList<Edge>[] graph){

        for(int i=0;i<graph.length;i++){

            //Printing elements inside graph array one by one 

            //1st method : we can simply print arrayList also 
            // System.out.print(graph[i]+",");


            //2nd method :  we are using forEach loop to traverse every element in arrayList 
            for(Edge ele : graph[i]){
                System.out.print(ele+" , ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        // n is the number of vertices of graph 
        int n = 8;

        // Adjancecy List  
        //  [1]- { {1,0,10},{1,2,11},{1,3,7},{1,4,12} }
        // Array of ArrayList(inside arrayList we are storing Edge of graph )
        //here we have intialized the Array of ArrayList(Edge)
        ArrayList<Edge>[] graph = new ArrayList[n];

        // giving each index of array a different arrayList to store Edges
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding Edge to the graph 
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 1, 2, 11);
        addEdge(graph, 1, 3, 7);
        addEdge(graph, 1, 4, 12);
        addEdge(graph, 2, 4, 9);
        addEdge(graph, 2, 5, 3);
        addEdge(graph, 5, 6, 6);
        addEdge(graph, 5, 7, 5);
        addEdge(graph, 6, 7, 4);

        displayGraph(graph);

    }
}
