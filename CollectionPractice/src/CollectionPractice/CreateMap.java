package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {
	public static void main(String[] args) {
		
		Map<String, Account> accountMap = new HashMap<>();
		
		
		accountMap.put("B001", new Account(54000, "Mirdamad", "001"));
		accountMap.put("B002", new Account(34000, "Saadat Abad", "002"));
		accountMap.put("B003", new Account(22000, "Sohanak", "003"));
		
		System.out.println("Print objects of the Map by for-each:");
		for (Map.Entry<String, Account> entry : accountMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			
		}
		
		accountMap.remove("B002");
		
		System.out.println("\nPrint objects of the Map after removing branch number B002:");
		for (Map.Entry<String, Account> entry : accountMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			
		}
	}

}
