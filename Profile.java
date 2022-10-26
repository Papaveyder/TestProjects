import java.util.Scanner; 

public class Profile {
    public static void main(String[] args) { 
        
        class Student {
    
    private int age; 
    private String name; 
    
    public int getAge(){
        return age; 
    }
    
    public void setAge(int x){
        
        this.age = x; 
    }
    
    public String getName(){
        
        return name; 
    }
    
    public void setName (String s) {
        
        this.name = s; 
    }
}
		
		Scanner scan = new Scanner(System.in); 
		Student student = new Student(); 
	
		System.out.print("Hello There! Plese enter your Name: ");  String newName = scan.nextLine(); 
		System.out.print("your Age: "); int newAge = scan.nextInt();  
		
		student.setName(newName); student.setAge(newAge); 
		
		boolean test = true; 
		
		while (test) {
		
		if (student.getAge() <=0){
		    
		   System.out.println("Invalid Age! \n" + "Name: " + student.getName() + "\n" + "Age: " + student.getAge()); 
		   
		   System.out.print("Please enter your age again: "); newAge = scan.nextInt();
		   
		   student.setAge(newAge); 
		   
		}
		
		else {
		    
		    test = false; 
		}
		}
		    System.out.println("Name: " + student.getName() + "\n" + "Age: " + student.getAge()); 
		
	}
		
		
		
		
	}

