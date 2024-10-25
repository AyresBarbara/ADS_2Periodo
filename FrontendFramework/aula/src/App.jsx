import logo from './logo.svg';
import './App.css';
import MeuPrimeiroComponente from './components/MeuPrimeiroComponente';
import Noticia from './components/Noticia';

function App() {
  return (
    <div className="App">
      {/*Formas de chanmar meu componente*/ }
      {/*<MeuPrimeiroComponente/>*/}
      <MeuPrimeiroComponente></MeuPrimeiroComponente>
      <Noticia></Noticia>
    </div>
  );
}

export default App;
