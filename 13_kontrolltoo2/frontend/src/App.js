import './App.css';
import { useEffect, useRef, useState } from 'react';

function App() {

  const[novellid, setNovellid] = useState([]);
  const pealkiriRef = useRef();
  const sisuRef = useRef();
  const aastaRef = useRef();


  useEffect(() => {
    fetch("http://localhost:8080/novellid")
      .then(response => response.json())
      .then(body => {
        console.log(body);
        setNovellid(body);
      })
  }, []);

  function kustuta(primaarivoti) {
    fetch("http://localhost:8080/novellid/" + primaarivoti, {"method": "DELETE"})
      .then(response => response.json()) 
      .then(json => {
        setNovellid(json);
      })
  }
  

  function lisa() {
    if (pealkiriRef.current.value.trim() === "") {
      return;
    }
    const novell = {
      "pealkiri": pealkiriRef.current.value,
      "sisu": sisuRef.current.value,
      "aasta": aastaRef.current.value,
    }
    fetch("http://localhost:8080/novellid", 
    {
      "method": "POST", 
      "body": JSON.stringify(novell), 
      "headers": {"Content-Type": "application/json"}
    })
      .then(response => response.json())
      .then(json => {
        setNovellid(json);
      })
  }

  return (
    <div className="App">
      
      <label>Pealkiri</label> <br/>
        <input ref={pealkiriRef} type="text" /> <br />
        <label>Sisu</label> <br/>
        <input ref={sisuRef} type="text" /> <br />
        <label>Aasta</label> <br/>
        <input ref={aastaRef} type="text" /> <br />
        
        <button onClick={() => lisa()}>Sisesta</button> <br />
        <br />

        {novellid.map(t => 
          <div>{t.id} | {t.pealkiri} | {t.sisu} | {t.aasta} <button onClick={() => kustuta(t.id)}>x</button> 
          </div> )}

    </div>
  );
}

export default App;
