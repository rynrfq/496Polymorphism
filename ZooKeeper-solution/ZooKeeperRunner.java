/*********************************************
 * Sample solution Activity 4.9.2
 *********************************************/
 public class ZooKeeperRunner
 {
   public static void main(String[] args)
   {
    // Step 5: students create the Elephant, Feline, Lion, and Tiger 
    // classes each in their own file
    
    // Step 6:     Elephant elephant = new Elephant();
    // step 14
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    // step 15
    elephant.forage();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    
    System.out.println();
   
    // Step 8:     Tiger tiger = new Tiger();
    // step 22
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    // step 10
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    
    System.out.println();
    
    // step 24
    Tiger tiger2 = new Tiger();
    Elephant elephant2 = new Elephant();

    // step 25
    Gorilla gorilla = new Gorilla();
    
    System.out.println();
    
    // step 27
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    
    System.out.println();
    
    // step 29
    Hippo hippo = new Hippo();
    hippo.eat();
    
    System.out.println();
  
    // Its Your Turn
    Penguin penguin = new Penguin();
    penguin.fish();
    
    System.out.println();
    
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    
    System.out.println();
    
    Animal a1 = new Animal();
    a1.sleep();
    Object a2 = new Animal();
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());
    Animal a3 = new Animal();
    System.out.println(a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
    //a.trumpet(); Animal is not a Elephant, Elephant is-a animal, so this doesn't work
   // a2.sleep();    error: cannot find symbol
   
    
   }
 }