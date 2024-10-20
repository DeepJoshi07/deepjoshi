let url ="https://catfact.ninja/fact"

// fetch(url)
// .then((res)=>{
//     return res.json()
// })
// .then((data)=>{
//     console.log(data.fact);
// })
// .catch((err)=>{
//     console.log(err);
// })




// async function getfacts(){
//     try{
//         let result = await fetch(url);
//         let data = await result.json();
//         console.log(data.fact);
//     }catch(e){
//         console.log(e);
//     }
// }

let btn = document.querySelector("button");
let url2 = "https://icanhazdadjoke.com/";
btn.addEventListener('click',async()=>{
    let joke = await getJokes();
    console.log(joke);
    let p = document.querySelector("p");
    p.innerText = joke;
    // let image = document.querySelector("img");
    // image.setAttribute('src',joke);
})
async function getJokes(){
    try{
        let header = {headers :{Accept :"application/json"}}
        let joke = await axios.get(url2,header);
        return (joke.data.joke);
    }catch(e){
        console.log(e);
        return "No fact found";
    }
}

// btn.addEventListener('click',async()=>{
//     let fact = await getCatfacts();
//     console.log(fact);
//     let p = document.querySelector("p");
//     p.innerText = fact;
// })
// async function getCatfacts(){
//     try{
//         let res = await axios.get(url);
//         return (res.data.fact);
//     }catch(e){
//         console.log(e);
//         return "No fact found";
//     }
// }