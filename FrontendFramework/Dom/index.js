const bananinha = document.getElementById("main")
//console.log(bananinha)
let numPar = 0

while (numPar < 5) {
    bananinha.innerHTML += `<p class="text-blue"> Item ${numPar+1}</p>`
    numPar++
}
