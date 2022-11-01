import { Routes, Route } from "react-router-dom";



import NavBar from "./NavBar";
import Login from "./Login";

function App() {
  return (
    <div className="App">
      <NavBar />
      <Routes>
          <Route path="/" element={<Login/>}/>
      </Routes>
    </div>
  );
}

export default App;
