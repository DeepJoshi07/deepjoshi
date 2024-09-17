// let arr =["apple","banana","mango"];
// let arr2 = [["one","two","three"],[1,2,3],["shield","sword","spear"]];
// let obj ={
//     name:"deep",
//     age:22,
//     occupation: "student"
// };
// let arrofobj=[
//     {   name:"deep",
//         age:22,
//         occupation: "student"},

//     {   name:"jay",
//         age:22,
//         occupation: "worker"},

//     {   name:"meet",
//         age:22,
//         occupation: "gig work"}];

// function sum(a,b){
//     return a + b;
// }
// if(a > b){

// }else{
    
// }

let student = [{
      name:"deep",
      friend:"no one",

},{
      name:"jay",
      friend:"everyone",
},{
      name:"meet",
      friend:"loner",
}]
// Arrow function
const print = () =>(console.log("Hello"));
const division = (a,b) => (a/b);
const cube = (n) =>{
   let num_cube = n*n*n;
   return num_cube;
};

// Nameless function
let multiply = function(a,b){
   return a*b;
};

// setout
// setTimeout(print,3000);

// setintervel
let id = setInterval(print,3000);
console.log(id);

// This
let company ={
   name:"Google",
   location:"USA",
   CEO:"Larry Page",
   age:12,
   name_2:this,

  name1(){
   console.log(this);
      return this.name;
   },
   name2:() => {
      console.log(this);
      return this.name;
   }

}

// for each
let runs =[4,12,8,7,0,18];
function printruns(n){
   console.log(n);
}
runs.forEach(printruns);
runs.forEach(function(run){
   console.log(run);
})
// map

let goodovers = runs.map(function (run){
   return run*2;
})

// every

let bedovers = runs.every((run) =>(run > 5));//true / false

// some

let zeroruns = runs.some((run) => (run > 0)) // true / false

// filtter

let runscored = runs.filter((run) => (run > 0));

//reduce

let levels =[12,33,45,67,8,90];
let high = levels.reduce((highest,lev) =>{
   if(highest < lev){
      highest = lev;
   }
   return highest;
})
let total = levels.reduce((sum,lev) =>{
   return sum + lev;
})

// defaulte parameters

function pow(n,p=1){
 let power = n**p;
   return power;
};

// spread

let score =[34,38,145,122,50];
console.log(...score);
let score2 =[...score];
let str ="hello world";
let cstr = [...str];
let score3 = [45,55,33,12,3,4,5,67,23,5,0];
let both_score =[...score,...score3];

// spread with objects

let obj = {...score};
let obj2 = {...str};
let obj3 = {
   name : "john",
   age : 25,
   id : 23
}
let obj_arr= {...obj3,company:"google"};

// rest

function sum2(...rest){
   let sum = 0;
   for(let i = 0;i < rest.length-1;i++){
      sum = rest[i]+rest[i+1];
   }
   return sum;
}

// Destructure

let des =[23,34,123,26,100,46];
let[first,second,third] = des;

// objects desructure

let object = {
   name : "john",
   age : 25,
   ide : 33,
   skills:["java","js","python","html"],
   city:"ahmedabad"
}
let {name,age, ide: identity ,skills,city} = object;

 
 