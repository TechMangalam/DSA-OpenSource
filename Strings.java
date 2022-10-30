public class Strings{
    public static void main(String args[]){
    // String name1="Tony";
    // String name2="Tony";
    // if(name1.equals(name2))
    // {
    //     System.out.println("Strings are equal");
    // }
    // else{
    //     System.out.println("Strings are unequal");
    // }
    // if(name1==name2){
    //     System.out.println("Strings are equal");
    // }
    // else{
    //     System.out.println("Strings are unequal");
    // }
    // don't use == for string equality check, it only checks for length
    // if(new String("Trony")==new String("Trony")){ // can also define string like this
    //     System.out.println("Same string");
    // }
    // else{
    //     System.out.println("Different string");
    // }
    /*Accessing character of a string
    String firstName = "Tony";
       String secondName = "Stark";
 
       String fullName = firstName + " " + secondName;
 
       for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
       }
    */
    /*substring
    String name = "TonyStark";
       System.out.println(name.substring(0, 4));
    */
    //integer to string
    // String str = "123";
    //    int number = Integer.parseInt(str);
    //    System.out.println(number);
    int number = 123;
      String str = Integer.toString(number);
      System.out.println(str);
    // strings are immutable in java
    }
}