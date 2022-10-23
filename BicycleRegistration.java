public class BicycleRegistration {
	public static void main(String[] args) {
		Bicycle bike1,bike2,bike3,tagno1,tagno2;	
		String owner1,owner2,owner3, Tagnum1,Tagnum2,Tagnum3;	
		
		bike1= new Bicycle();
		bike1.setOwnerName("Leo Jorquia");
		
		bike2= new Bicycle();
		bike2.setOwnerName("Tyrone Dagalea");
		
		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();
		
		tagno1= new Bicycle();
		tagno1.setTagNo("2004-134R");
		
		tagno2= new Bicycle();
		tagno2.setTagNo("2005-456T");
		
		Tagnum1=tagno1.getTagNo();
		Tagnum2=tagno2.getTagNo();
		
		bike3= new Bicycle("2006-789B","Edwin Remegio");
		owner3=bike3.getOwnerName();
		Tagnum3=bike3.getId();
		
		System.out.println("LAB EXERCISE 1.2 OUTPUT\n");
		System.out.println("This is the output of LabExercise1.1");
		System.out.println("\t"+owner1+" owns a Bicycle with a tag number: "+Tagnum1);
		System.out.println("\t"+owner2+" also owns a  Bicycle with a tag number: "+Tagnum2);
		System.out.println("\nThis is the final output of LabExercise1.2\n\t"+owner3+" owns a Bicycle with a tag number: "+Tagnum3);
	}
}
