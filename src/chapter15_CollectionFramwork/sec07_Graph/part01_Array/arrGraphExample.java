package chapter15_CollectionFramwork.sec07_Graph.part01_Array;

public class arrGraphExample {

	public static void main(String[] args) {
		ArrayGraph graph = new ArrayGraph(6);

		graph.addOneWayGraph(1, 2);
		graph.addOneWayGraph(1, 3);
		graph.addOneWayGraph(2, 3);
		graph.addOneWayGraph(2, 4);
		graph.addOneWayGraph(3, 4);
		graph.addOneWayGraph(3, 5);
		graph.addOneWayGraph(4, 5);
		graph.addOneWayGraph(4, 5);
		
		graph.printGraph();
	}

}
