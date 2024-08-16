//const pokemon = "Bulbasauro"
const pokemon = prompt("Informe o pokemom: ")

switch (pokemon) {
    case "bulbasauro":
        console.log("Tipo: planta e veneno")
        break;
    case "charmander":
        console.log("Tipo: fogo")
        break;
    case "squirtle":
        console.log("Tipo: água")
        break;

    default:
        console.log("Pokemon não encontrado")
        break;
}