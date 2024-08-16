//• Recebe 2 números digitados pelo usuário (chamaremos de a e b). Compara esses números entre si. 
//Se os números forem iguais, retorna uma mensagem de sucesso.

const num1 = Number(prompt("Digite um número: "))
const num2 = Number(prompt("Digite outro número: "))

//console.log(num1, num2)

//Retorna mensagens dizendo se os números são iguais ou diferentes
// if (num1 === num2) {
//     console.log("Os números são iguais!")
    
// } else {
//     console.log("Os números são diferentes!")
// }

//Se o primeiro número é {maior/menor/igual} ao segundo número
if (num1>num2) {
    console.log("num1 é maior que num2")
} else if(num1<num2){
    console.log("num1 é menor que num2")
} else{
    console.log("num1 é igual a num2")
}