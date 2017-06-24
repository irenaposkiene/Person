package person;


import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1 = new Person ("Jonas",10);
		Person p2 = new Person ("Petras",15);
		Person p3 = new Person ("Antanas",20);
		Person p4 = new Person ("Tomas",25);
		
		
		ArrayList<Person> list= new ArrayList <Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		for (Person asmenys:list) {
			System.out.println(asmenys);
		}
		
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
			}
			
			
		});
		
		System.out.println("**********");
		
		for (Person ppp:list) {
			System.out.println(ppp);
		}
		

		System.out.println("//NAUJAI//");
			
		List<Person> myList = new ArrayList<Person>(); 
		
				myList.add(new Person ("Jonas2",107));
				myList.add(new Person ("Jonas5",108));
				myList.add(new Person ("Jonas3",103));
				myList.add(new Person ("Jonas3",104));
				
				
				for (Person personai: myList ) {
					System.out.println(personai);
				}
				
				Collections.sort(myList,new Comparator<Person> () {

					@Override
					public int compare(Person p1, Person p2) {
						// TODO Auto-generated method stub
						if (p1.getAge()>p2.getAge()) {
							return 1;
						}
						
						else if  (p1.getAge()<p2.getAge()) {
							return -1;
						}
						else return 0;
					} 
					
				});
				
				
			//	System.out.println("--------");
				
								
			/*	(Person personai1: myList ) {
				System.out.println(personai1);
			}*/
				
				System.out.println("----kas antras----");
				
				for (int i =0; i<myList.size();i++) {
					
					if (i%2==0) {
						System.out.println(myList.get(i));
					}
				}
				
				/*(Person personai1: myList ) {
					System.out.println(personai1);
				}*/
				
	}

	
	
}
