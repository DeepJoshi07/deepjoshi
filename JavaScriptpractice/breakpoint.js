// function one(){
//     return 1;
// }
// function two(){
//     return 2;
// }
// function three(){
//     return one() + two();
// }
    
// let res = three();
// let h1 = document.querySelector("h1");
// function changecolor(color,delay,func){
//     setTimeout(() =>{
//         h1.style.color = color;
//         if(func){func();} 
        
//     },delay);
// }

// // Callback Hell
// // nesting of callback function
// changecolor("red",3000,() => {
//     changecolor("blue",3000,() => {
//         changecolor("green",3000);
//     });
// });
// console.log("Hello");




// Promises

// let h2 = document.querySelector("h2");

// function changeText(text,success,failiure){
    
//         let time = (Math.random()*10) + 1;
//         if(time > 5){
//             h2.innerText = text;
//             success();
//         }else{
//             failiure();
//         }
// }

// changeText("too bad",
//     ()=>{
//     console.log("success");
//     changeText(
//         "how are you?",
//         ()=>{
//         console.log("success2");
//         changeText(
//             "good to see you",
//             ()=>{
//             console.log("success3");
//         },
//         ()=>{
//             console.log("failiure3");
//         })
//     },
//     ()=>{
//         console.log("failiure2");
//     })
// },
// ()=>
//     {
//     console.log("fail");
// })
// changeText("hello there",3000,()=>{
//     changeText("hello world",3000,()=>{
//         changeText("hello earth",3000);
//     });
// })





// then() and catch()

function addData(data){
    return new Promise((resolve,rejected) =>{
        let internet = (Math.random()*10)+1;
        if(internet > 5){
            resolve("good speed");
        }else{
            rejected("no internet");
        }
    })
}
addData("hello there")
.then((result )=>{
        console.log(result);
        console.log("success");
        return addData("too bad");
    })
.then( ( result)=>{
        console.log(result);
        console.log("success2");
    })
.catch((error) =>{
        console.log("fail");
    })