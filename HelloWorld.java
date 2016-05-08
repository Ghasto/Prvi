public class HelloWorld{





     public static void main(String []args){
        int SomeNumber=32;
        for(int x=1; x<SomeNumber + 1; x++) {
            if(x % 3 == 0 && x % 5 == 0){
                System.out.println("fizzbuzz");
            }
            if(x % 3 == 0){
                System.out.println("fizz");
            }
            if(x % 5 ==0){
                System.out.println("buzzzzzz");
            }
            else {
                System.out.println(x);
     }
        }
         
     }
    
}

     


