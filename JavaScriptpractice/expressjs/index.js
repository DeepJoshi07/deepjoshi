const express = require("express");
const app = express();

// console.log(app);
let port = 3000;

app.listen(port,()=>{
    console.log(`server is running on port ${port}`);
})
// app.use((req,res)=>{
//     console.log("request recieved");
//     let code ="<h1>friends list</h1><ol><li>no one</li><li>like litraly no-one</li></ol>";
//     res.send(code);
// })
app.get("/",(req,res)=>{
    res.send("hello there!");
})
app.get("/2",(req,res)=>{
    res.send("how are you");
})
app.get("/3",(req,res)=>{
    res.send("good to see you");
})
app.get("*",(req,res)=>{
    res.send("you mother fuker!");
})
app.post("/",(req,res)=>{
    res.send("too bad");
})