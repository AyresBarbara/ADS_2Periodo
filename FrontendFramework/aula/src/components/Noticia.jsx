import React from "react";

const Noticia = (props) => {
    return(
        <div>
            {/*<h1>Título da noticia</h1>*/}
            {/*<h3>Subtítulo da Noticia</h3> */}
            {/*<img src="https://www.voltologo.net/wp-content/uploads/2023/01/recife-antigo-onde-fica.jpg" alt="" />*/}
            <h1>{props.title}</h1> {/*Props é um objeto*/}
            <h3>{props.subTitle}</h3>
            <img src={props.image} alt="" />
            <p>{props.content}</p>

        </div>
    )
}
export default Noticia // Para utilizar/referenciar o MeuPrimeiroComponente