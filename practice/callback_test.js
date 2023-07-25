// const fetch = require('node-fetch');

// import fetch = 'node-fetch';
import fetch from "node-fetch";

// const fetch = require("node-fetch");

function userInfo() {
  const url = 'https://koreanjson.com/users/1';
  return fetch(url)
    .then((res) =>{
    return res.json();
  })
}

function userTodo() {
  const url = 'https://koreanjson.com/todos/1';
  return fetch(url)
    .then((res) => {
    return res.json(); 
  })
}

async function sumOfFetch() {
  const user = await userInfo();
  if(user.id === 1) {
   const todo = await userTodo();
   console.log(todo)
   return todo;
  }
}
sumOfFetch();