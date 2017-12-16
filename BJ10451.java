package javaBackjoon;

import java.util.Scanner;
import java.util.ArrayList;

public class BJ10451 {
	static class Edge {
		private boolean isVisited;
		private int connectedEdge;
		
		Edge() {
			isVisited = false;
		}
		
		Edge(int val) {
			isVisited = false;
			connectedEdge = val;
		}
		
		public void setConnectedEdge(int val) {
			connectedEdge = val;
		}
		
		public boolean isVisitedEdge() {
			return isVisited;
		}
		
		public void setVisited() {
			this.isVisited = true;
		}
		
		public int connectedEdgeIdx() {
			return this.connectedEdge;
		}
	}
	
	static int circleCnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		
		while(testCase-- != 0) {
			ArrayList<Edge> graph = new ArrayList<Edge>();
			
			int edgeCnt = input.nextInt();
			for(int i = 0; i < edgeCnt; i++) {
				graph.add(new Edge(input.nextInt()));
			}
			
			for(int i = 0; i < edgeCnt; i++) {
				if(graph.get(i).isVisitedEdge()) {
					continue;
				}
				else {
					DFS(graph, i);
					circleCnt++;
				}
			}
			
			System.out.println(circleCnt);
			circleCnt = 0;
		}
		
		input.close();
		
	}
	
	public static void DFS(ArrayList<Edge> graph, int idx) {
		if(graph.get(idx).isVisitedEdge()) {
			return;
		}
		
		graph.get(idx).setVisited();
		
		// connected edge number should subtract one because list index start 0
		DFS(graph, graph.get(idx).connectedEdgeIdx() - 1);
	}

}
