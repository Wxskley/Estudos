const etanol = 4.80;
const gasolina = 5.20;
let tipoCombustivelCarro = "Etanol";
let gastoMedioCarro = 10;
let distanciaViagem = 180;

const consumoEtanol = distanciaViagem / gastoMedioCarro * etanol;
const consumoGasolina = distanciaViagem / gastoMedioCarro * gasolina;

// console.log("Viajando " + distanciaViagem + "KM utilizando Etanol: " + consumoEtanol.toFixed(2));
// console.log("Viajando " + distanciaViagem + "KM utilizando Gasolina: " + consumoGasolina.toFixed(2));
if (tipoCombustivelCarro === "Gasolina") {
    console.log("Viajando " + distanciaViagem + "KM utilizando Gasolina: " + consumoGasolina.toFixed(2));
} else {
    console.log("Viajando " + distanciaViagem + "KM utilizando Etanol: " + consumoEtanol.toFixed(2));
}