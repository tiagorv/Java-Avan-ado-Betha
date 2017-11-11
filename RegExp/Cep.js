var exp = /[0-9]{2}.[0-9]{3}\-[0-9]{3}/;

var cep1 = '22.280-280';
console.log(cep1);
console.log(exp.test(cep1));

var cep2 = '22280-280';
console.log(cep2);
console.log(exp.test(cep2));