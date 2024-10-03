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