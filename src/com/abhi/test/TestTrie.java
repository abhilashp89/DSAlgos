package com.abhi.test;

import com.abhi.ds.Trie;

public class TestTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie trie=new Trie();
		trie.insert("abcd");
		trie.insert("abcde");
		trie.insert("abxy");
		trie.insert("abxyz");
		
		System.out.println(trie.numOfWordsWithPrefix("ab"));

	}

}
