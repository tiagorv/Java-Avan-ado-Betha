module.exports = function(nome, peso, altura, elemento){

    var imc = peso / (altura * altura);

    elemento.innerText = nome + ' seu imc é de ' + imc;
}