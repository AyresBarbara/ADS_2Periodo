//• Recebe 2 números digitados pelo usuário (chamaremos de a e b). Compara esses números entre si. 
//Se os números forem iguais, retorna uma mensagem de sucesso.

const num1 = Number(prompt("Digite um número: "))
const num2 = Number(prompt("Digite outro número: "))

//console.log(num1, num2)

if (num1 === num2) {
    console.log("Os números são iguais!")
    
} else {
    console.log("Os números são diferentes!")
}