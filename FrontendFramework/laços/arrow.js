const lerArrays = (array) =>{
    for (const element of array) {
        console.log(element)
    }
    const tamanhoArray = array.length

    return tamanhoArray
}

const meuArray = [1, 2, 3, 4, 5, 6]
console.log(lerArrays(meuArray))