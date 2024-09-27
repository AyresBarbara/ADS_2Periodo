const input = document.getElementById("input-lista") 
const lista = document.getElementById("listaCompras")

function addItemLista() {
    const itemLista = input.value
    
    if (itemLista.length > 0) {
    lista.innerHTML += `<li> ${itemLista}</li>`
    input.value = ""
    }

}
