package org.example.MoshDSA.HashTable;

public class Main {
    public static void main(String[] args) {


        HashTable hashTable = new HashTable();
        hashTable.put(6,"A");
        hashTable.put(8,"B");
        hashTable.put(11,"C");
        System.out.println(hashTable.get(6));

//        CharFinder charFinder = new CharFinder();
//        var ch = charFinder.findFirstNonRepeatingCharacter("aah nhsh mmdjn t");
//        System.out.println(ch);
//
//        var ch1 = charFinder.noRepeater("hello mainuddin");
//        System.out.println(ch);
    }
}
