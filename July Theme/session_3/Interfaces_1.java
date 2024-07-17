  /* scenario - take like there is a company 
         * you dev an app as a project now you use laptop to do work
         * what if in another company you get a desktop what will you do
         */
        

         // case 1
// class Desktop{
//     public void code(){
//         System.out.println("Code Comiple run..");
//     }
// }
// class Laptop{
//     public void code(){
//         System.out.println("Code Comiple run..");
//     }
// }
// class Developer{
//     public void devAPP(Laptop lap){
//         lap.code();
//     }
// }
// public class lmbda_1 {
//     public static void main(String[] args) {
//         Laptop lap = new Laptop();
//         Developer Tanish= new Developer();
//         Desktop Desk = new Desktop();
//         Tanish.devAPP(Desk);// hence if i try to assign it the desktop
//         // it will not accept as it doesnt inherit its use 
//         // hence is it possible to inherit both 

      
// }
// }

// Know you try making a computer class which will iherit both
// properties


  //  case 2--------------------------------------------------------------

interface Computer{ // abstraction is a bottom hidden layer
    // probably working as generalize class for a particular group
    // in java interfce is like a contract that defines a set of methods that a class
    // must implement, w/o providing its implementation
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println(" Faster_Desktop Code Comiple run..");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code Comiple run..");
    }
}
class Developer{
    public void devAPP(Computer lap){
        lap.code();
    }
}
public class Interfaces_1 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Developer Tanish= new Developer();
        Computer Desk = new Desktop();
        Tanish.devAPP(lap);// hence if i try to assign it the desktop
        // it will not accept as it doesnt inherit its use 
        // hence is it possible to inherit both 

      
}
}