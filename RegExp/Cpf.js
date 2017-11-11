var exp = /[0-9]{3}.[0-9]{3}.[0-9]{3}\-[0-9]{2}/;
var cpf = '023.453.444-00';
console.log(cpf);
console.log(exp.test(cpf));

exp = /[0-9]{2}.[0-9]{3}.[0-9]{3}\/[0-9]{4}\-[0-9]{2}/;
var cnpj = '02.453.444/0001-02';
console.log(cnpj);
console.log(exp.test(cnpj));
