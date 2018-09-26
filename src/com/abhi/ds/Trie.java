package com.abhi.ds;

import java.util.HashMap;
import java.util.Map;


public class Trie {
	
	private class TrieNode{
	
		Map<Character,TrieNode> children;
		boolean isEndOfWord;
		int numOfOccurrences;
		
		public TrieNode() {
			children=new HashMap<>();
		}
		
	}
	
	private final TrieNode root;
	
	public Trie(){
		root=new TrieNode();
	}

	public void insert(String word) {
		
		TrieNode current=root;
		
		for(int i=0;i<word.length();i++){
		  char ch=word.charAt(i);
		  TrieNode node=current.children.get(ch);
		  if(node == null){
			 node=new TrieNode();
			 current.children.put(ch, node);
			 
		  }
		  node.numOfOccurrences++;
		  current=node;
		}
		
		current.isEndOfWord=true;
	}
	
	public boolean search(String word) {
		TrieNode current=root;
		
		for(int i=0;i<word.length();i++){
			  char ch=word.charAt(i);
			  TrieNode node=current.children.get(ch);
			  
			  if(node == null)
				  return false;
			  
			  current=node;
		}
		
		return current.isEndOfWord;
		
	}
	
	public void delete(String word){
		delete(root,word,0);
	}

	private boolean delete(TrieNode current, String word, int index) {
		
		if(index == word.length()){
			
			if(!current.isEndOfWord)
				return false;
			
			current.isEndOfWord=false;
			
			return current.children.size() == 0;
			
		}
		
		char ch=word.charAt(index);
		TrieNode node= current.children.get(ch);
		
		if(node == null)
			return false;
		
        boolean shouldDeleteCurrentNode=delete(node, word, index+1);
        
        if(shouldDeleteCurrentNode){
        	current.children.remove(ch);
        	node.isEndOfWord=false;
        	return node.children.size() == 0;
        }
		
		return false;
	}
	
	public int numOfWordsWithPrefix(String prefix){
		
		TrieNode current=root;
		for(int i=0;i<prefix.length();i++){
			char ch=prefix.charAt(i);
			TrieNode node=current.children.get(ch);
			
			if(node == null)
				return 0;
			
			current=node;
		}
		
		return current.numOfOccurrences;
	}
}
