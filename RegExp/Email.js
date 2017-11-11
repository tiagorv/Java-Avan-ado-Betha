
var exp = /^[a-zA-Z0-9][a-zA-Z0-9\._-]+@([a-zA-Z0-9\._-]+\.)[a-zA-Z-0-9]{2,3}/;
var email = 'teste@teste.com.br';
console.log(email);
console.log(exp.test(email));