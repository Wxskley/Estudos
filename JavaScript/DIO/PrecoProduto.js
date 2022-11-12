const tipoPagamento = "4 vezes";
const precoProduto = 100;
const vistaDebito = (precoProduto / 100) * 90;
const dinheiro = (precoProduto / 100) * 85;
const PIX = (precoProduto / 100) * 85;
const duasVezes = precoProduto;
const acimaDuasVezes = (precoProduto / 100) * 110;
if (tipoPagamento === "Débito") {
    console.log(vistaDebito);
} else if (tipoPagamento === "Dinheiro") {
    console.log(dinheiro);
} else if (tipoPagamento === "PIX") {
    console.log(PIX);
} else if (tipoPagamento === "Duas Vezes") {
    console.log(duasVezes);
} else {
    console.log(acimaDuasVezes);
}