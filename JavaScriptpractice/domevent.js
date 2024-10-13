// let btns = document.querySelectorAll("button");
// for (let btn of btns) {
//     btn.onclick = () => {
//         console.log("hello there");
//     }
   
// }
// btns[0].onmouseenter = () => {
//     alert("Wanna join");
// }
// btns[1].addEventListener('dblclick',() =>{
//     alert("Bhosdike sale!");
// })
// // console.dir(btns[1].style);
// btns[4].addEventListener('click',() =>{
//     let div = document.querySelectorAll('div');
//     let h3 = document.querySelector('h3');
//     let bgc = rendomcolor();
//     h3.innerText = bgc;
    
//     div[1].style.backgroundColor = bgc;
// })

// function rendomcolor(){
//     let r = Math.floor(Math.random() * 255);
//     let g = Math.floor(Math.random() * 255);
//     let b = Math.floor(Math.random() * 255);

//     return `rgb(${r},${g},${b})`;
// }
// let h3 = document.querySelector("h3");
// h3.addEventListener("click",changeColor);


// function changeColor(){
//     this.style.backgroundColor = "purple";
// }


// mouse events
// Obj.addEventListener("events",work)


//  keyboard events
// Obj.addEventListener("events",work)

// let inp = document.querySelector("input");
// inp.addEventListener("keydown",(event) =>{
//     console.dir(event);
//     console.log(event.key);
//     console.log(event.keyCode);
//     console.log(event.code);
// } );


// form event listeners

// let form = document.querySelector("form");
// form.addEventListener("submit",(event) =>{
//     event.preventDefault();
//     console.log("form submitted");
// });


let form = document.querySelector("form");
form.addEventListener("submit",function (event){
    event.preventDefault();
    console.dir(this);
    // console.log(this.elements[0]);
    // console.log(this.elements[1])
    let user = this.elements[0];
    let pass = this.elements[1];
    console.log(user.value);
    console.log(pass.value);
});
