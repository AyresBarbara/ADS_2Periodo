import logo from './logo.svg';
import './App.css';
import MeuPrimeiroComponente from './components/MeuPrimeiroComponente';
import Noticia from './components/Noticia';

function App() {
  return (
    <div className="App">
      {/*Formas de chanmar meu componente*/ }
      {/*<MeuPrimeiroComponente/>*/}
      {/*<MeuPrimeiroComponente></MeuPrimeiroComponente>*/}
      <Noticia 
      title = {"Primeira Noticia"}
      subTitle = {"Primeiro subtitulo"}
      image = {"https://picsum.photos/id/237/400"}
      content ={"Conteudo da primeira Noticia"}
      />
      <Noticia 
      title = {"Segunda Noticia"}
      subTitle = {"Segundo subtitulo"}
      image = {"https://fastly.picsum.photos/id/1084/536/354.jpg?grayscale&hmac=Ux7nzg19e1q35mlUVZjhCLxqkR30cC-CarVg-nlIf60"}
      content ={"Conteudo da primeira Noticia"}
      />
    </div>
  );
}

export default App;
