package algoritmoBusca;

public class Main {
	
	public static void main(String[] args){
		
		Graph A = new Graph("A");
		Graph B = new Graph("B");
		Graph C = new Graph("C");
		Graph D = new Graph("D");
		Graph E = new Graph("E");
		Graph F = new Graph("F");
		Graph G = new Graph("G");
		Graph H = new Graph("H");
		Graph I = new Graph("I");
		Graph K = new Graph("K");
		Graph L = new Graph("L");
		Graph M = new Graph("M");
		Graph N = new Graph("N");
		Graph P = new Graph("P");
		Graph Q = new Graph("Q");
		Graph R = new Graph("R");
		Graph S = new Graph("S");
		Graph T = new Graph("T");
		Graph U = new Graph("U");
		Graph V = new Graph("V");
		Graph W = new Graph("W");
		
		//A sons
		A.sons.add(I);
		A.sons.add(B);
		//B sons
		B.sons.add(I);
		B.sons.add(A);
		B.sons.add(C);
		B.sons.add(T);
		//C sons
		C.sons.add(B);
		C.sons.add(D);
		C.sons.add(E);
		//D sons
		D.sons.add(C);
		D.sons.add(E);
		//E sons
		E.sons.add(D);
		E.sons.add(C);
		E.sons.add(G);
		//F sons
		F.sons.add(K);
		F.sons.add(W);
		F.sons.add(M);
		//G sons
		G.sons.add(E);
		G.sons.add(H);
		G.sons.add(K);
		//H sons
		H.sons.add(G);
		H.sons.add(K);
		//I sons
		I.sons.add(A);
		I.sons.add(B);
		I.sons.add(N);
		I.sons.add(L);
		//K sons
		K.sons.add(G);
		K.sons.add(H);
		K.sons.add(F);
		//L sons
		L.sons.add(I);
		L.sons.add(M);
		//M sons
		M.sons.add(L);
		M.sons.add(F);
		//N sons
		N.sons.add(I);
		N.sons.add(P);
		//P sons
		P.sons.add(N);
		P.sons.add(Q);
		P.sons.add(U);
		//Q sons
		Q.sons.add(P);
		Q.sons.add(R);
		//R sons
		R.sons.add(Q);
		R.sons.add(S);
		//S sons
		S.sons.add(R);
		S.sons.add(T);
		//T sons
		T.sons.add(B);
		T.sons.add(S);
		T.sons.add(V);
		T.sons.add(W);
		//U sons
		U.sons.add(P);
		U.sons.add(V);
		//V sons
		V.sons.add(U);
		V.sons.add(T);				
		//W sons
		W.sons.add(T);
		W.sons.add(F);
		
		//System.out.println("-----------------Busca em Profundidade--------------");
		//BuscaProfundidade busca = new BuscaProfundidade();
		//busca.buscaDFS(I, F);
		System.out.println("-----------------Busca em Largura--------------");
		BuscaLargura buscaL= new BuscaLargura();
		buscaL.buscaLargura(I, F);

	}

}
