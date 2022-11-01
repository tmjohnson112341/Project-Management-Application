import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

import Login from './components/Login'
import Announcements from './components/Announcements'
import Projects from './components/Projects'

const App = () => (
  <div style={{backgroundColor: '#051622', height: '100vh'}}>
    <Router>
      <Routes>
        <Route exact path="/" element={<Login />} />
        <Route path="/announcements" element={<Announcements />} />
        <Route path="/projects" element={<Projects />} />
      </Routes>
    </Router>
  </div>
);

export default App;
