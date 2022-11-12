class Carro {
    marca;
    cor;
    gastoKmRodado;
    constructor(marca, cor, gastoKmRodado) {
        this.marca = marca;
        this.cor = cor;
        this.gastoKmRodado = gastoKmRodado;
    }

    precoPercurso(kmViagem, precoCombustivel) {
        return kmViagem * this.gastoKmRodado * precoCombustivel;
    }
}
const uno = new Carro("Fiat", "Verde", 1 / 12);
const gol = new Carro("Gol Sapão", "Azul", 1 / 10);
console.log(uno.precoPercurso(70, 5.37));
console.log(gol.precoPercurso(70, 5.37));