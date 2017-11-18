import calcularIMC from './calcular';

document.getElementById('calculando').onclick = function(){
    let nome = document.getElementById('nome').value;
    let peso = document.getElementById('peso').value;
    let altura = document.getElementById('altura').value;

    calcularIMC(nome, peso, altura, document.getElementById('saida'));
}