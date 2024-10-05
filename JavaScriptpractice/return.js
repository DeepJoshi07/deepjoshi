                    // Arrow function
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


                    // try and catch
try{
    if(action === "do it"){
        console.log("do it");
    }
}catch{
    console.log("there is no action variable");
}


                    // setTimeout
setTimeout(() =>{
    console.log("hello world");
},4000)


                    // setInterval
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



                        // reduce
let mul_arr =[1,2,3,4,5,6];
let mul = mul_arr.reduce((res,el) => {
    return res*el;
});
console.log(mul);

let sum_arr =[20,50,95,78,93,47];
let sum2 = sum_arr.reduce((res,el) => {
    return res+el;
});
console.log(sum2);

let maximum = sum_arr.reduce((res,el) => {
    if(res < el){
        return el;
    }else{
        return res;
    }
});
console.log(maximum);



                        // Spread
let arr1 = [1,2,3,4,5];
console.log(...arr1);

let str1 ="Deep Joshi";
console.log(...str1);

console.log(...[23,45,67,89,20]);
console.log(..."Hello there");

// Spread with array literals
let c_arr1 = [...arr1];
console.log(c_arr1);

let odd =[1,3,5,7,9];
let even =[2,4,6,8,10];
let all = [...odd,...even];
console.log(all);

let str2 = "Hoe are you";
let str_arr =[...str2];
console.log(str_arr);

// Spread with object literals
let test ={
    name:"Deep Joshi",
    age:25,
    height:181
};
let c_test ={...test};
console.log(c_test);

let c_test2 ={...test,weight:"94",skin:"brown"};
console.log(c_test2);

let sarr =[20,34,57,68,90];
let sobj ={...sarr};
console.log(sobj);

let s_str ="deepjoshi";
let s_obj = {...s_str};
console.log(s_obj);


                        // Rest
function myStrings(...rest){
    for(let i = 0; i < rest.length;i++){
        console.log(rest[i]);
    }
}
function sum_y(a,b,c,d,f,e){
    console.log(arguments);
    for(let i = 0; i < arguments.length;i++){
        console.log(arguments[i]);
    }
}


                        // Destructuring
let names =["deep","jay","meet","vishal","vijay","amit","lalu"];

// let winner = names[0];
// let runner_up = names[1];
// let third = names[2];

let[winner,runner_up,third,...others] = names;
console.log(winner);
console.log(runner_up);
console.log(third);
console.log(others);

// objects
const infoUser ={
    name:"Deep Joshi",
    age:25,
    height:181,
    weight:94,
    username:"deep@joshi",
    password:"2002"
}

// let {username,age} = infoUser;
// console.log(username);
// console.log(age);

let{username:user,password:pass} = infoUser;
console.log(user);
console.log(pass);
let{city="Ahmedabad"} = infoUser;
console.log(city);