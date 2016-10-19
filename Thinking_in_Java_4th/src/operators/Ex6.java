package operators;

//class Dog{
//	String name;
//	String says;
//}

public class Ex6 {
	public static void main(String[] args){
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		dog1.name="spot";
		dog1.says="Ruff!";
		dog2.name="scruffy";
		dog2.says="Wurf!";
		System.out.println("Dog1's name: "+ dog1.name + ", says: "+ dog1.says);
		System.out.println("Dog2's name: "+ dog2.name + ", says: "+ dog2.says);
		Dog dog3=new Dog();
		dog3=dog1;
		System.out.println("Dog1 == dog3: " + (dog1==dog3));
		System.out.println("Dog1 equals dog3: " + (dog1.equals(dog3)));
		System.out.println("Dog2 == dog3: " + (dog2==dog3));
		System.out.println("Dog2 equals dog3: " + (dog2.equals(dog3)));
	}
}
