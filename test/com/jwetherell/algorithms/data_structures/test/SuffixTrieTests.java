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
        //add tire.add branch.
        trie.add("keeper");
        //add getSuffixes() function branch.
        trie.getSuffixes();
        //add toString() branch.
        trie.toString();
        assertTrue(SuffixTreeTest.suffixTreeTest(trie, bookkeeper));
    }
}
