package advance_java;
import java.util.*;
public class hashset_in_java {
public static void main(String args[]) {
//	hashing is the technique to convert key values to indexes:
//	hash set is a collection of unique items
	HashSet<Integer> hash1 = new HashSet<>();// by defaul the size if 16 
	HashSet<Integer> hash2 = new HashSet<>(32);// by defaul the size will be given
	HashSet<Integer> hash3 = new HashSet<>(32,0.5F);// by defaul the size will be given and load factor also
	hash1.add(4);
	hash1.add(6);
	hash1.add(7);// here only added one element onew time
	hash1.add(7);
	hash1.add(7);
	
	System.out.println(hash1);
	System.out.println(hash1.contains(4));
	hash1.clear();
	System.out.println(hash1.isEmpty());
	hash1.add(4);
	hash1.add(6);
	hash1.add(7);// here only added one element onew time
	hash1.add(7);
	hash1.add(7);
	
	
	
	
	
	
}

}
