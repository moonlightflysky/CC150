package chapter18;

import java.util.ArrayList;

public class Tries {
	
	public static final int R = 128;
	
	private Node root = new Node();
	
	private static class Node{
		
		private ArrayList<Integer> indexes;
		private Node[] next;
		
		public Node(){
			indexes = new ArrayList<Integer>();
			next = new Node[R];
		}
		
	}
	
	public void put (String key, int index){
		
		root = put (root, key, index, 0);
		
	}
	
	private Node put(Node node, String key, int index, int d){
		
		if (node == null){
			node = new Node();
		}
		
		if (d == key.length()){
			node.indexes.add(index);
			return node;
		}
		
		char c = key.charAt(d);
		if (d > 0){
			node.indexes.add(index);
		}
		
		node.next[c] = put(node.next[c], key, index, d + 1);
		
		return node;
	}
	
	public ArrayList<Integer> getIndexes(String key){
		
		if (getLastNode(root, key, 0) != null){
			return getLastNode(root, key, 0).indexes;
		}
		
		else{
			return null;
		}
	}
	
	private Node getLastNode(Node node, String key, int d){
		
		if (node == null){
			return null;
		}
		
		if (d == key.length()){
			return node;
		}
		
		char c = key.charAt(d);
		
		return getLastNode(node.next[c], key, d + 1);
		
	}
}
