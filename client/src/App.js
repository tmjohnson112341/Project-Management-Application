import { Routes, Route } from "react-router-dom";


import NavBar from "./components/NavBar";
import Login from "./components/Login";
import Announcements from "./components/Announcements";
import Projects from "./components/Projects";

function App() {
  return (
    <div className="App">
      <NavBar />
      <Routes>
          <Route path="/" element={<Login/>}/>
          <Route path="/home" element={<Announcements />} />
        <Route path="/projects" element={<Projects />} />
      </Routes>
    </div>
  );
}

export default App;
