//Ex 2
const numeros = [-9, 0.69, 58, 9, 6, -1000, 32]
let maiorNumero = numeros[0]

for( let index =0; index< numeros.length ; index++){
    if (numeros[index] > maiorNumero) {
        maiorNumero = numeros[index]
    }
}
console.log(" O maior numero é ", maiorNumero)