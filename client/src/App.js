import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

import NavBar from './components/NavBar';
import Login from './components/Login';
import Layout from './components/Layout'
import Announcements from './components/Announcements';
import Projects from './components/Projects';

const App = () => (
  <div style={{backgroundColor: '#051622', height: '100vh'}}>
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route element={<Layout />} >
          <Route path="/home" element={<Announcements />} />
          <Route path="/projects" element={<Projects />} />
        </Route>
      </Routes>
    </Router>
  </div>
);

export default App;
