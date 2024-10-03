function sum(a,b){
    console.log(`the sum is${a+b}` )
    return;
    
}
let arrow = () =>{
    console.log("hello world");
    return;
};
let arrow2 = (a,b) =>(a+b);
let arrow3 = (a,b) => {a*b};

try{
    if(action === "do it"){
        console.log("do it");
    }
}catch{
    console.log("there is no action variable");
}
setTimeout(() =>{
    console.log("hello world");
},4000)
let id = setInterval(() => {
    console.log("hello user");
},5000)
console.log(id);

// forEach loop for arr
let arr =[1,2,33,4,56,7];
// uasecase 1
let print = function(el){
    console.log(el);
}
arr.forEach(print);

// usecase 2
arr.forEach(function(el){
    console.log(el);
});

// usecase 3
arr.forEach((el) => {
    console.log(el);
});

// usecase 4
// for objects
let obj =[{
    name:"john",
    age:25
    },{
        name:"jane",
        age: 36
    },{
        name:"deep",
        age:22
}];
obj.forEach((ob) =>{
    console.log(ob.name);
    console.log(ob.age);
})

// map()
let arrmap =[2,4,6,8];
let double = arrmap.map((el) =>{
    return el*2;
});
console.log(double);
let sqr = arrmap.map((el) => {
    return el*el;
});
console.log(sqr);

// usecase 2
let selected = obj.map((el) =>{
    return el.name;
});
console.log(selected);

// filtter
let marks = [95,85,75,65,98,89];
let smart = marks.filter((el) => {
    return el > 70;
})
console.log(smart);
let survivors = marks.filter((el) =>{
    return el > 90;
})
console.log(survivors);
// every()
let result = marks.every((el) => {
    return el > 50;
})
console.log(result);

// some

let result2 = marks.some((el) => {
    return el > 95;
})
console.log(result2);
