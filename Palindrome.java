public class Palindrome {
    public static void main(String[]args){
        int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a valid number");
        int n=sc.nextInt();
        System.out.println("This is the entered number: " + n);
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("palindrome number");
        else
        System.out.println("not palindrome");
    }
}