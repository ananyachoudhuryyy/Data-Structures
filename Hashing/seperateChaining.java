package Hashing;

import java.util.ArrayList;
import java.util.List;

public class seperateChaining{
    // Number of buckets
    private int bucketCount ;

    // List of lists to store chains
    private List<List<Integer>> table ;

    // Constructor to initialize the hash 
    // table with given bucket count
    public Hash(int buckets) {
        bucketCount = buckets ;
        table = new ArrayList<>() ;
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
    }

    // Function to insert a key into hash table
    public void insert(int key) {
        // Get the hash index for the key
        int index = getHashIndex(key);

        // Insert the key into the corresponding bucket
        table.get(index).add(key);
    }

    // Function to delete a key from hash table
    public void remove(int key) {
        // Get the hash index for the key
        int index = getHashIndex(key);

        // Find and remove the key from the bucket
        table.get(index).remove(Integer.valueOf(key));
    }

    // Function to display the hash table
    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.print(i);

            // Print all keys in current bucket
            for (int key : table.get(i)) {
                System.out.print(" --> " + key);
            }

            System.out.println();
        }
    }

    // Simple hash function to map key to index
    private int getHashIndex(int key) {
        return key % bucketCount;
    }

    public static void main(String[] args) {
        int[] keys = {7, 18, 12, 25};

        Hash hashTable = new Hash(7);

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.remove(12);
        hashTable.display();
    }
}