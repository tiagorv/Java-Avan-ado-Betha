export default function calcularIMC(nome, peso, altura, elemento){

    var imc = peso / (altura * altura);

    elemento.innerText = `${nome} seu imc é de ${imc}`;
}