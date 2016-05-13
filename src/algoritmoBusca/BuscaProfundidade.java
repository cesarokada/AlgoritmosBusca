package algoritmoBusca;

import java.util.List;
import java.util.Stack;

public class BuscaProfundidade {
	
	public void buscaDFS(Graph root, Graph wanted){
		Stack<Graph> stackNodes = new Stack<Graph>();
		stackNodes.push(root);
		
		while(!stackNodes.isEmpty()){
			Graph node = stackNodes.pop();
			node.setWasVisited(true);
			if (wanted.getNodeName() == node.getNodeName()) 
				break;
			
			List<Graph> sons = node.sons;
			
			for (int i = sons.size() - 1; i > 0; i--) {
				if (!sons.get(i).isWasVisited())
					stackNodes.push(sons.get(i));
			}
		}
	}
}
