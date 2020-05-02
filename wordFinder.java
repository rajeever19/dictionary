
class Dog 
{ 
    // Instance Variables 
    public String name[]={"123","456","1234","789"}; 
    String breed; 
    int age; 
    String color; 
  
    // Constructor Declaration of Class 
    public Dog(String breed, 
                   int age, String color) 
    { 	int k=0;
    	for (int i=0;i<name.length;i++ ) {
			char a=breed.charAt(0);
			if(name[i].charAt(0)==a)
			{
				//System.out.println(ar[i]);
				//this.b=ar[i];
				if(k==0)
				{
				this.color=name[i];
				}
				if(k==1)
				{
					this.breed=name[i];
				}
				k++;
				//b[i]=ar[i];
			}

		}

        //this.name = name; 
        //this.breed = breed; 
        this.age = age; 
       // this.color = color; 
    } 
  
    // method 1 
    public String getName() 
    { 
        return name[0]; 
    } 
  
    // method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    // method 3 
    public int getAge() 
    { 
        return age; 
    } 
  
    // method 4 
    public String getColor() 
    { 
        return color; 
    } 
  
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ 
               ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getAge()+ 
               ","+ this.getColor()); 
    } 
  
    public static void main(String[] args) 
    { 
        Dog tuffy = new Dog("123", 5, "white");

        System.out.println(tuffy.toString()); 
    } 

	
}