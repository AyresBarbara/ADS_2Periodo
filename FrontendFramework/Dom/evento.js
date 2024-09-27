const paragrafo = document.getElementById("cont-Cliques")
let cliques = 0

function adicionaClique() {
    //console.log("Clicou no botão mais!")
    cliques++
    paragrafo.innerHTML = cliques
}
function subtraiClique(){
    cliques--
    paragrafo.innerHTML = cliques
}