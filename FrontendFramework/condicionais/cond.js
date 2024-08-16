// //Uma pessoa pode estudar em uma faculdade se:
// • Tiver concluído o ensino médio
// • Tiver 18 anos ou mais
// • Não estiver cursando outra faculdade 

const idade = 20
const concluiuEnsMed = true
const regularMat = false

if(idade >= 18 && concluiuEnsMed && !regularMat){
    console.log("O aluno foi matriculado")
} else {
    console.log("O aluno não está apto")
}