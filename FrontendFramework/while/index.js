let valorUsuario = Number(prompt("Informe um número"))
let somaValoresUsuario = 0 

while(valorUsuario !== 0){
    // somaValoresUsuario = somaValoresUsuario + valorUsuario
    somaValoresUsuario += valorUsuario
    valorUsuario = Number(prompt("Informe um número"))
}
console.log("A soma é: ", somaValoresUsuario)