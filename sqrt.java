class sqrt{
    public static int findSqrt(int n){
        int i=0;
        int j=n/2+1;
        while(i<=j){
           int m=(i+j)/2;
           if(m*m==n) return m;
           else if(m*m<n)
           i=m+1;
           else 
           j=m-1;
        }
        return j;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(findSqrt(n));
    }
}