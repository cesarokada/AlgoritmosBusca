package algoritmoBusca;

import java.util.List;
import java.util.ArrayList;

public class BuscaLargura {

	public void buscaLargura(Graph root, Graph wanted) {
		ArrayList<Graph> nodeList = new ArrayList<Graph>();
		nodeList.add(root);
		while (!nodeList.isEmpty()) {
			Graph node = nodeList.remove(0);
			node.setWasVisited(true);
			if (wanted.getNodeName() == node.getNodeName()) {
				break;
			}
			List<Graph> sons = node.sons;
			for (Graph graphNode : sons) {
				if (!graphNode.isWasVisited() && !nodeList.contains(graphNode))
					nodeList.add(graphNode);
			}
		}
	}

}
