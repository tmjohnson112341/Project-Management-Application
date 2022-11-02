import { Routes, Route } from "react-router-dom";


import NavBar from "./components/NavBar";
import Login from "./components/Login";
import Announcements from "./components/Announcements";
import Projects from "./components/Projects";
import Layout from "./components/Layout";
import ProjectsList from "./components/ProjectsList";

function App() {
  return (
    <div className="App">
      <Routes>
          <Route path="/" element={<Login/>}/>
          <Route element={<Layout/>}>
              <Route path="/home" element={<Announcements />} />
              <Route path="/projects" element={<Projects />} />
          </Route>
      </Routes>
    </div>
  );
}


export default App;
