//write a program that finds all prime numbers between 2 and 100

class IsPrime {
    public static void main(String args[]){
        int i, j;
        boolean isprime;

        for(i=2; i<100; i++){
            isprime = true; 
            for(j=2; j<=i/j; j++){
                if(i%j == 0){
                    isprime = false;
                }
            }
            if (isprime){
                System.out.println(i + " is prime!");
            }
        }
    }
}