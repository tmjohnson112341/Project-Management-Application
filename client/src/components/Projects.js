import Navbar from './Navbar'
import { useState, useEffect } from 'react'

const Projects = () => {
  const [teamData, setTeamData] = useState({});

  const teamID = JSON.parse(localStorage.getItem("teamID"))

  const loadTeam = async () => {
    const response = await fetch(`http://localhost:8080/project/team/${teamID}`,{mode:"cors"});
    let data = await response.json();
    setTeamData(data);
  }

  console.log(teamData);
  useEffect(() => {
    loadTeam();
  }, []);


  return (
    <>
    <Navbar />
    <div className="card-container">
      <h4 className="card-title">Team name projects</h4>
      <ul className="list-group list-group-flush" style={{ display: 'flex', paddingTop: 'fit-content',  width: '80rem' }}>
        {teamData.length > 0 ? (teamData.map((team) => (
          <li className="list-group-item" style={{ backgroundColor: 'inherit', color: 'white', borderBottom: '1px solid beige', paddingBottom: '10px' }}>{team.description}</li>
        ))):"No projects to display!"}
      </ul>
    </div>
    </>
  );
}

export default Projects