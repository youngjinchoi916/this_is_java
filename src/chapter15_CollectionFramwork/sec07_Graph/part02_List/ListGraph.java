package chapter15_CollectionFramwork.sec07_Graph.part02_List;

import java.util.ArrayList;

public class ListGraph {

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
	
	//ArrayList로 구현하기
	//점마다 이어지는 간선의 목록을 표현한 것입니다. 각 정점마다 각각의 연결 리스트를 갖게 하는 방식으로 표현
	private ArrayList<ArrayList<Integer>> listGraph;
	
	public ListGraph(int size) {
		this.listGraph = new ArrayList<ArrayList<Integer>>();
	}
	
	public ArrayList<ArrayList<Integer>> getListGraph() {
		return listGraph;
	}
	
	//단방향 그래프 추가
	public void addOneWayGraph(int x, int y) {
		listGraph.get(x).add(y);
	}
	
	//양방향 그래프 추가
	public void addRoundGraph(int x, int y) {
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	//그래프 출력
	public void printGraph() {
		for(int i=0 ; i<listGraph.size() ; i++) {
			if(i == 0) {
				
				for(int j=0 ; j<listGraph.get(i).size() ; j++) {
					System.out.print(j+" ");					
				}
				System.out.println();
				
			} else {
				for(int j=0 ; j<listGraph.get(i).size() ; j++) {
//					if(j==0) {
//						System.out.print(i+" ");
//					} else {
//						System.out.print();
//					}
					System.out.print(j==0 ? i+" " : listGraph.get(i).get(j)+" ");	
				}
				System.out.println();
				
			}
		}
	
	} //end main
} //end class
