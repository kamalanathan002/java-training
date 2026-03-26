
bool isPalindrome(int x) {
    //scanf("%d",&x);
    long long int n1=x;
    long long int dig=0,sum=0;
    while(x>0)
    {
        dig=x%10;
        sum=(sum*10)+dig;
        x=x/10;
    }
    return n1==sum;
    
}