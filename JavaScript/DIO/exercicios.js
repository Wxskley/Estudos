function meuNome(nome) {
    return "Meu nome é: " + nome;
}
function maioridade(idade) {
    if (idade >= 18) {
        console.log(meuNome("Weskley") + " e sou maior de idade");
    } else {
        console.log(meuNome("Weskley") + " e sou menor de idade")
    }
}
maioridade(20);