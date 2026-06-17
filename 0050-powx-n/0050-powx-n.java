class Solution {
    public double myPow(double x, int n) {
        //1.method-done my me brute force but iT GIVES TLE as n is very big here
//         double prod = 1;

//         //when n is negative
//         if (n < 0) {
//             for (int j = 0; j > n; j--) {
//                 prod = prod * 1 / x;
//             }
// return prod;
//         }
//         //when n is positive
//         for (int i = 0; i < n; i++) {
//             prod = prod * x;
//         }
//         return prod;

//     }
    

//2. using inbult function,but not recommeded in interview although it is optimal

// return Math.pow(x,n);

//3/optimal approach of solution
// if(n==0) return 1.0;
// if(x==0) return 0.0;
// if(x==1) return 1.0;
// if(x==-1 && n%2==0) return 1.0;
// if(x==-1 && n%2!=0) return -1.0;

// long binform=n;
// if(n<0){
//     x=1/x;
//     binform=-binform;
// }

// double ans=1;
// while(binform>0){
//     if(binform%2==1){
//         ans*=x;
//     }
//     x*=x;
//     binform/=2;
// }
// return ans;


//4.doing it in 2026 using fast exopentiation
if(n==0) return 1.0;
if(x==0) return 0.0;
if(x==1) return 1.0;
if(x==-1 && n%2==0) return 1.0;
if(x==-1 && n%2!=0) return -1.0;

long N=n;
if(N< 0){
    x = 1/x;
    N=-N;
}
double ans = 1;
double pow = x;


while(N> 0){

    if((N & 1) == 1){
        ans *= pow;
    }

    pow *= pow;
    N >>= 1;
}

return ans;

    }
    }