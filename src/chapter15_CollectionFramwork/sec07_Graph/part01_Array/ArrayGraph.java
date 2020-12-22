package chapter15_CollectionFramwork.sec07_Graph.part01_Array;

public class ArrayGraph {

	/*
	 * [그래프]
	 * 	 (1) 그래프란?
	 * 		- 객체들의 쌍들이 서로 연관되어 객체의 집합을 이루는 구조
	 * 	 	- 사물이나 추상적인 개념간의 연결관계를 표현한 것.
	 * 		- ex) 도시를 연결하는 도로망, 사람들 사이의 관계, 웹 사이트의 링크관계 등...			
	 * 		
	 *	 (2) 그래프 구성요소
	 *		- 정점(Vertex/Node) : 그래프에서의 위치
	 *		- 간선(Edge/Link/Branch) : 그래프에서의 위치 관계. 각 정점(노드)를 연결하는 선
	 *		- 인접정점(Adjacent Vertex) : 간선(Edge)에 직접 연결된 선
	 *  	- G(V, E) : 그래프 자체를 의미함.
	 *  
	 *   (3) 그래프 종류
	 *   (4) 그래프 구현 방법
	 *   	- 인접 행렬
	 *   	- 인접 리스트
	 */
	
	//2차원 배열로 그래프 구현하기
	//인접 행렬은 NxN 행렬로 graph[i][j]가 true라면 정점 i 에서 정점 j 로의 간선이 있다는 것을 의미합니다. 
	//정점의 개수가 V 라면 V^2 크기의 2차원 배열을 생성하여 1과 0을 사용하여 true/false를 구분하여 값을 저장합니다. 
	//양방향 인접행렬의 경우 대칭 행렬의 형태로 구성됩니다.
	private int[][] arrGraph;
	
	public ArrayGraph(int size) {
		this.arrGraph = new int[size+1][size+1];
	}
	
	public int[][] getArrGraph() {
		return arrGraph;
	}
	
	//단방향 그래프 추가
	public void addOneWayGraph(int x, int y) {
		this.arrGraph[x][y] = 1;
	}
	
	//양방향 그래프 추가
	public void addRoundGraph(int x, int y) {
		this.arrGraph[x][y] = this.arrGraph[y][x] = 1;
	}
	
	//그래프 출력
	public void printGraph() {
		for(int i=0 ; i<arrGraph.length ; i++) {
			if(i == 0) {
				
				for(int j=0 ; j<arrGraph[i].length ; j++) {
					System.out.print(j+" ");					
				}
				System.out.println();
				
			} else {
				for(int j=0 ; j<arrGraph[i].length ; j++) {
//					if(j==0) {
//						System.out.print(i+" ");
//					} else {
//						System.out.print();
//					}
					System.out.print(j==0 ? i+" " : arrGraph[i][j]+" ");	
				}
				System.out.println();
				
			}
		}
	
	} //end main
} //end class
