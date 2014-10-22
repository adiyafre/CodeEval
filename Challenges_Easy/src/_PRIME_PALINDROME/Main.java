package _PRIME_PALINDROME;

class Main {

public static void main (String[] args){

    int sum=-1;
    for (int i=1,c=0;c<=1000;i++){
        if(isPrime(i)==0){
            sum=sum+i;
            c++;
        }
    }
    System.out.println(sum);
}


    public static int isPrime(int i){
        int flag=0;
        for(int j=2;j<i;j++) 
        { 
            if(i%j==0) 
            {
                flag=1;
                break; 
            }
        }
    return flag;
}
}
