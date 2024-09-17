function rendomcolor(){
    let red = Math.floor(Math.random()*255);
    let green = Math.floor(Math.random()*255);
    let blue = Math.floor(Math.random()*255);

    let color = `rgb(${red},${green},${blue})`;
    return color;
}
let btn = document.querySelector("button");
btn.addEventListener("click",function(){
    let h1 = document.querySelector("h1");
    let getcolor = rendomcolor();
    let div = document.querySelector("div");

    h1.innerText = getcolor;
    h1.style.color = getcolor;
    btn.style.color ="white"
    btn.style.backgroundColor = getcolor;
    div.style.backgroundColor = getcolor;
    div.style.color="white"

})