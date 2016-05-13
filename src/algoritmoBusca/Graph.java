package algoritmoBusca;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private boolean wasVisited;
	public List <Graph> sons = new ArrayList<Graph>();;
	private String nodeName;
	
	public Graph(String name){
		this.nodeName = name;
	}
	
	public void visitado(){
		this.wasVisited = true;
	}

	public boolean isWasVisited() {
		return wasVisited;
	}

	public void setWasVisited(boolean wasVisited) {
		this.wasVisited = wasVisited;
		System.out.println("No Visitado:  " + this.nodeName);
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
}
