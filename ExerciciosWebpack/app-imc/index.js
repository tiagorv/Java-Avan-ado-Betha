var calcularIMC = require('./calcular');

document.getElementById('calculando').onclick = function(){
    var nome = document.getElementById('nome').value;
    var peso = document.getElementById('peso').value;
    var altura = document.getElementById('altura').value;

    calcularIMC(nome, peso, altura, document.getElementById('saida'));
}