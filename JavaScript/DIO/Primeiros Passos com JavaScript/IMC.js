const peso = 150;
const altura = 1.83;
const imc = peso / (altura * altura);
if (imc <= 18.5) {
    console.log("Abaixo do peso");
    console.log(imc.toFixed(1));
} else if (imc >= 18.5 && imc < 25) {
    console.log("Peso normal");
    console.log(imc.toFixed(1));
} else if (imc >= 25 && imc < 30) {
    console.log("Acima do peso");
    console.log(imc.toFixed(1));
} else if (imc >= 30 && imc < 40) {
    console.log("Obeso");
    console.log(imc.toFixed(1));
} else {
    console.log("Obesidade grave")
    console.log(imc.toFixed(1));
}