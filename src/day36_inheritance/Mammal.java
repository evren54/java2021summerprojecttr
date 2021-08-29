package day36_inheritance;

public class Mammal extends Animal{
    
    public void mD() {//parenti ile ayný
        System.out.println("NANKÖR KEDÝ");
    }
        public void mC() {
            System.out.println("cat" +"mammal");
        }
         int c=7;
         int m=4;//parenti ile ayný
        
         public Mammal() {
             this('A');
            System.out.println("p'siz mammal cons.");
        }
        public Mammal(char c) {
            super(34);//parentten p'li cons call.
            System.out.println("char p'li mammal cons.");
            
        }
}
