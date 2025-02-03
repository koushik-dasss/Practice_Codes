function greet(name){
    console.log("Hello "+ name + " !");
}
greet("Koushik");


function greeting(name = "Koushik"){
    console.log("Hello"+ name );
}
greeting();
greeting(" John Cena ")

const names= " Dean Ambrose "
function greetings(name = names ){
    console.log("Hello"+ name + ",,,,,,,,,");
}
greetings();
greetings(" John SEEMA");

const a = 20 , b = 56 ; 
const add = function(a,b){
    return a+b;
}
console.log(add(10,20));
console.log(add(a,b));

const c  = 30 , d = 40 ; 
const sub = function(c,d){
    return c-d ; 
}
console.log(sub(a,b));
console.log(sub(c,d));
const e = 20 . f = 12 ; 
const multiply  = (e,f)=> e*f;
console.log(multiply(a,b));
console.log(multiply(c,d));
console.log(multiply(10,20));

console.log(this); // {}


function showThis() {
    console.log(this);
}

showThis(); // In non-strict mode, this refers to the global object (window in the browser).
const person = {
    name: 'Koushik',
    greet: function() {
        console.log('Hello, ' + this.name);
    }
};

person.greet(); // Output: Hello, Koushik


const person2 = {
    name: 'Koushik',
    greet: () => {
        console.log('Hello, ' + this.name);
    }
};

person2.greet(); // Output: Hello, undefined


function Person(name,age){
    this.name = name ;
    this.age = age ;
}
Person.prototype.greet = function() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
};

const koushik = new Person("Koushik", 20);
koushik.greet(); 










