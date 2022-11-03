import React from 'react';
import NavBar from './NavBar';

//import 'bootstrap/dist/css/bootstrap.css';

const Projects = () => {
  return (
    <>
    <NavBar />
    <div className="card-container">
      <h4 className="card-title">Team name projects</h4>
      <ul className="list-group list-group-flush" style={{ display: 'flex', paddingTop: '20vh',  width: '80rem' }}>
        <li className="list-group-item" style={{ backgroundColor: 'inherit', color: 'white', border: 'solid beige' }}>Item 1</li>
        <li className="list-group-item" style={{ backgroundColor: 'inherit', color: 'white', border: 'solid beige' }}>Item 2</li>
        <li className="list-group-item" style={{ backgroundColor: 'inherit', color: 'white', border: 'solid beige' }}>Item 3</li>
        <li className="list-group-item" style={{ backgroundColor: 'inherit', color: 'white', border: 'solid beige' }}>Item 4</li>
      </ul>
    </div>
    </>
  );
}

export default Projects