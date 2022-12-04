package com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jwetherell.algorithms.data_structures.SuffixTrie;
import com.jwetherell.algorithms.data_structures.test.common.SuffixTreeTest;

public class SuffixTrieTests {

    @Test
    public void testSuffixTrie() {
        String bookkeeper = "bookkeeper";
        SuffixTrie<String> trie = new SuffixTrie<String>(bookkeeper);
        trie.getSuffixes();
        trie.add("books");
        trie.toString();
        assertTrue(SuffixTreeTest.suffixTreeTest(trie, bookkeeper));
    }
    
    @Test
    public void suffixTrieTestExtended(){
        String name = "s";
        SuffixTrie<String> trie = new SuffixTrie<String>(name);
        
        System.out.println(trie.getSuffixes());
    }
}