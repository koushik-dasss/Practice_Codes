function factorial(n){
    let result = 1 ;
    for( let i = 1 ; i<=n ; i++){
        result*=i;
    }
    return result;
}
let n = 5 ; 
const result = factorial(n);
console.log("The factorial is : "+ result );

function fibo(num){
    let sum = 0 ;
    let a = 0  , b = 1 ;
    for(let i = 1 ; i<=num ; i++){
        sum = a + b ; 
        a = b ;
        b = sum;
    }
    return sum;
}
let num = 5 ;
const result2 = fibo(num);
console.log("Fibo until n is "+ result2);

function armstrong(num2){
    let number = num2;
    let sum2 = 0 ;
    while(number!==0){
        let r = number%10;
        sum2+=(r**3);
        number = Math.floor(number/10)
    }
    return sum2==num2;
}
let num2 = 153;
const result3 = armstrong(num2);
console.log(num2 + " is an  armstrong number  : "+ result3);

function sum_of_digits(number3){
    let num3 = number3;
    let sum3 = 0 ;
    while(num3!=0){
        sum3+=(num3%10);
        num3 = Math.floor(num3/10);
    }
    return sum3;
}
let number3 = 23;
const result4 = sum_of_digits(number3);
console.log("Sum of digits of " + number3 + " is : "+ result4);

function reverse(a){
    let  b = a ;
    let rev = 0 ;
    while(b!=0){
        rev = rev*10+ (b%10);
        b = Math.floor(b/10);
    }
    return rev;
}
let a = 1089;
const result5 = reverse(a);
console.log("Reverse of "+  a + " is : "+ result5);

function palindrome(c){
    let d = c ;
    let rev = 0 ;
    while(d!=0){
        rev=rev*10+(d%10);
        d=Math.floor(d/10);
    }
    return rev==c;
}
let c = 121;
const result6 = palindrome(c);
console.log(palindrome(c));

function isPrime(composite){
    if(composite<2){
        return false;
    }else{
        for(let i = 2 ; i<=Math.sqrt(composite);i++){
            if(composite%i==0){
                return false;
            }

        }
    }     
    return true;  
}
let composite = 9;
const result7 = isPrime(composite);
console.log(result7);

function sum_of_N(number2){
    let sumN = 0 ;
    for(let i = 0 ; i<= number2 ; i++){
        sumN+=i;
    }
    return sumN;
}
let number2 = 10;
const result8 = sum_of_N(number2);
console.log(result8);







