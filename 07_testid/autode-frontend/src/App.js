//import logo from './logo.svg';
import './App.css';
import { useEffect, useRef, useState } from 'react';

function App() {
  const [kogus, setKogus] = useState(0);
  const [autod, setAutod] = useState([]);
  const tootjaRef = useRef();
  const mudelRef = useRef();
  const aastaRef = useRef();
  const labisoitRef = useRef();

  useEffect(() => {
    fetch("http://localhost:8080/api/autod")
      .then(response => response.json())
      .then(json => {
        setKogus(json.length);
        setAutod(json);
      })
  }, []);

  function kustuta(primaarvoti) {
    fetch("http://localhost:8080/api/autod/" + primaarvoti, {"method": "DELETE"})
      .then(response => response.json())
      .then(json => {
        setKogus(json.length);
        setAutod(json);
      })
  }

  function lisa() {
    if (tootjaRef.current.value.trim() === "") {
      return;
    }
    const auto = {
      "tootja": tootjaRef.current.value,
      "mudel": mudelRef.current.value,
      "aasta": aastaRef.current.value,
      "labisoit": labisoitRef.current.value
    }
    fetch("http://localhost:8080/api/autod", 
    {
      "method": "POST", 
      "body": JSON.stringify(auto), 
      "headers": {"Content-Type": "application/json"}
    })
      .then(response => response.json())
      .then(json => {
        setKogus(json.length);
        setAutod(json);
      })
  }


  return (
    <div className="App">
      Mul on {kogus} autot
      <br /><br />

      <label>Autotootja</label> <br />
      <input ref={tootjaRef} type="text" /> <br />

      <label>Automudel</label> <br />
      <input ref={mudelRef} type="text" /> <br />

      <label>Auto aasta</label> <br />
      <input ref={aastaRef} type="text" /> <br />

      <label>Auto läbisõit</label> <br />
      <input ref={labisoitRef} type='text' /> <br />

      <button onClick={() => lisa()}>Sisesta</button> <br />
      <br />

      {autod.map(t => <div>{t.tootja} <button onClick={() => kustuta(t.tootja)}>x</button> </div> )}
    
    </div>
  );
}

export default App;
