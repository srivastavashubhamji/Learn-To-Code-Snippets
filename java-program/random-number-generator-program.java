## Java Random Number Programs : 

[Find Complete Guide](https://shubhamklogic.com/random-number-generator-java/)


Structure of java.util.Math:
---------------------------

java.lang.Object          // Super Class or Parent Class
     java.lang.Math       // Math Class
     
Definition of class Math:
------------------------

public final class Math
	     extends Object
       
       
Definition of Math.random():
---------------------------

public static double random()
{
    //...method definition
    // ...returns double type random number
}


// Program 1 : Generate 100 random numbers in java
============ ============ ============ ============ 

public class FirstRandomNumberProgram
{
    public static void main( String []arguments )
    {
        // Generating 100 Random Numbers
        for( int i=0; i<100; i++ )
              System.out.println("\nRandom Number : " + Math.random());
    }
}


Output:
======

Random Number : 0.19312083785977052

Random Number : 0.9392575411297682

//... 98 times more


import java.util.Random;

// Java program to generate a random number from 0 to 100 in Java?
// Make use of class java.util.Random;




// 2) java.util.Random class:
----------------------------


// Program 2: How do you generate a random number from 0 to 100 in Java?
============ ============ ============ ============ ============ =======

public class SecondRandomNumberProgram
{
	public static void main(String args[]) 
	{ 
		// Step 1: create instance of Random class 
		Random rand = new Random(); 

		// Step 2: Generate a random integer in range 0 to 100 
		int random_int = rand.nextInt(100);

		// Step 3: Print that random integer
		System.out.println("Random Integer: " + random_int);

		// Optional: 
                // If you need 'double type' random integers,
		// Here is how-

                double random_double1 = rand.nextDouble();
                double random_double2 = rand.nextDouble();
		
                System.out.println("Random Double 1 -: " + random_double1);
		System.out.println("Random Double 2 -: " + random_double2);
	}
}



Output:
======

Random Integer: 41

Random Double 1 -: 0.3045839101520478

Random Double 2 -: 0.909197304072948



// 3) ThreadLocalRandom class:
=============================

// Program 3: Java program to generate random numbers using class ThreadLocalRandom ...

import java.util.concurrent.ThreadLocalRandom; 

public class ThirdRandomNumberProgram
{
    public static void main( String []arguments ) 
    { 
        // Default range is 0 to 999 for generating random numbers-
        int random_int1 = ThreadLocalRandom.current().nextInt(); 
        int random_int2 = ThreadLocalRandom.current().nextInt(); 
  
        // Printing random numbers-
        System.out.println("Random Integer : " + random_int1); 
        System.out.println("Random Integer : " + random_int2); 
  
        // Method nextDouble() would return double type Random values-
        double random_dub1 = ThreadLocalRandom.current().nextDouble(); 
        double random_dub2 = ThreadLocalRandom.current().nextDouble(); 
  
        // Printing random values (of double type)
        System.out.println("Random Double : " + random_dub1); 
        System.out.println("Random Double : " + random_dub2); 
  
        // Method nextBoolean() would return boolean type random values-
        boolean random_bool1 = ThreadLocalRandom.current().nextBoolean(); 
        boolean random_bool2 = ThreadLocalRandom.current().nextBoolean(); 
  
        // Printing random Booleans 
        System.out.println("Random Boolean : " + random_bool1); 
        System.out.println("Random Boolean : " + random_bool2); 
    } 
} 


Output:
======

Random Integer : 1340382768
Random Integer : -968777093
Random Double : 0.6695573904219136
Random Double : 0.6755849575303099
Random Boolean : true
Random Boolean : false



4) Secure Random Number
-----------------------


Program 4:Secure Random Number
========= ========= ===========
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
 
public class FourthRandomNumberProgram
{
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException 
    {
        SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG", "SUN");
         
        // Getting 128 random bytes
        byte[] randomBytes = new byte[128];
        secureRandomGenerator.nextBytes(randomBytes);
         
        // Get 2 random integers
        int theRandomNumber1 = secureRandomGenerator.nextInt();
        int theRandomNumber2 = secureRandomGenerator.nextInt();
        System.out.println( "\n1st Random Number : "+ theRandomNumber1 );
        System.out.println( "\n2nd Random Number : "+ theRandomNumber2 );

        // Get 2 random integer in a particular range
        int theRandomNumInRange1 = secureRandomGenerator.nextInt(1000);
        int theRandomNumInRange2 = secureRandomGenerator.nextInt(1000);

        System.out.println( "\n1st Random No. In Range : "+ theRandomNumInRange1 );
        System.out.println( "\n2nd Random No. In Range : "+ theRandomNumInRange2 );

    }
}



Output:
======
1st Random Number : 1113009595
2nd Random Number : 656521261
1st Random No. In Range : 998
2nd Random No. In Range : 48



Going to the Next Level: How to generate random number in Java using Math.random() method and some range:
--------------------------------------------------------------------------------------------------------

// Program 5: Program to generate random number between 1 to 10 using Math.random()

public class FirstRandomNumberProgram
{
    public static void main( String []arguments )
    {
        // Assume the given lower range is 1
        int min = 1;
        // Assume the given upper range is 10
        int max = 10;
        // Assume we want 5 random numbers
        int totalRandomNumbers = 5;

        for(int k=0; k<totalRandomNumbers; k++)
        {   
            // Calculate the range of random number
            int range = (max - min) + 1;

            // Type Casting the double type random numbers into integer type
            int integerTypeRandomNumber = (int)((Math.random() * range) + min);
            System.out.println("Random Number(" +min+ "," +max+ ")= "+ integerTypeRandomNumber);
        }
    }
}
Output:
--------- Running First Time ------------
C:\Users\ShubhamKLogic_com\>javac FirstRandomNumberProgram.java
C:\Users\ShubhamKLogic_com\>java FirstRandomNumberProgram
Random Number(1,10)= 5
Random Number(1,10)= 4
Random Number(1,10)= 2
Random Number(1,10)= 4
Random Number(1,10)= 1

--------- Running Second Time ------------
C:\Users\ShubhamKLogic_com\>java FirstRandomNumberProgram
Random Number(1,10)= 3
Random Number(1,10)= 7
Random Number(1,10)= 1
Random Number(1,10)= 10
Random Number(1,10)= 10

--------- Running Third Time ------------
C:\Users\ShubhamKLogic_com\>java FirstRandomNumberProgram
Random Number(1,10)= 6
Random Number(1,10)= 1
Random Number(1,10)= 8
Random Number(1,10)= 1
Random Number(1,10)= 3
