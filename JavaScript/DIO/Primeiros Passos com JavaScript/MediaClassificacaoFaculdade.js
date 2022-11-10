const nota1 = 2;
const nota2 = 3.1;
const nota3 = 6;

const media = (nota1 + nota2 + nota3 / 3);
if (media < 5) {
    console.log("Reprovado");
    console.log(media.toFixed(1));
} else if (media > 5 && media <= 7) {
    console.log("Recuperação");
    console.log(media.toFixed(1));
} else {
    console.log("Passou de semestre");
    console.log(media.toFixed(1));
}