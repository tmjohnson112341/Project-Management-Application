import { Routes, Route } from "react-router-dom";

import Login from "./components/Login";
import Announcements from "./components/Announcements";
import Projects from "./components/Projects";
import ProjectContainer from "./components/ProjectContainer";


function App() {
  return (
    <div className="App">
      <Routes>
          <Route path="/" element={<Login/>}/>
          <Route path="/home" element={<Announcements />} />
          <Route path="/projectlist" element={<ProjectContainer />} />
          <Route path="/projects" element={<Projects />} />
      </Routes>
    </div>
  );
}


export default App;