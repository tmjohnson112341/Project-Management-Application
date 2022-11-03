import { Fragment, useState, useEffect } from 'react';
import { useNavigate } from "react-router-dom";

import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

const Login = () => {

  const [userData, setUserData] = useState([]);
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const [company, setCompany] = useState();
  const [team, setTeam] = useState();
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch('http://localhost:8080/user',{mode:"cors"})
      const newData = await response.json();
      setUserData(newData);
    };
    fetchData();
  }, []);

  let handleChange = (e) => {
    const userValue = e.target.value;
    const companyData = userData.filter((user) => user.username === userValue).map(item => item.company.id);
    const teamData = userData.filter((user) => user.username === userValue).map(item => item.team.id);
    setCompany(
        companyData
    )
    setTeam(teamData)
  }
  
  const errors = {
    username: "invalid username",
    password: "invalid password"
  };
  
  const renderErrorMessage = (name) =>
  name === errorMessages.name && (
    <div className="error">{errorMessages.message}</div>
  );

  const handleSubmit = (e) => {
    // Prevent page reload
    e.preventDefault();

    let { username, password } = document.forms[0];

    const userInfo = userData.find((user) => user.username === username.value);

    if (userInfo) {
      if (userInfo.password !== password.value) {
        // Invalid password
        setErrorMessages({ name: "password", message: errors.password });
      } else {
        setIsSubmitted(true);
        localStorage.setItem("companyID", JSON.stringify(company));
        localStorage.setItem("teamID", JSON.stringify(team));
        navigate("/home");

        
      }
    } else {
      // Username not found
      setErrorMessages({ name: "username", message: errors.username });
    }
  };

    return (
      <Fragment>
      <div className='header'>
        <h1>Cook Systems</h1>
        <h3>A Final App</h3>
      </div>
        <Form className='login' onSubmit={handleSubmit}>
          <Form.Group className="mb-3">
            <Form.Label>Username</Form.Label>
            <Form.Control type="text" name="username" placeholder="Enter username" onChange={handleChange} />
            {renderErrorMessage("username")}
          </Form.Group>
          <Form.Group className="mb-3">
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" name="password" placeholder="Password" />
            {renderErrorMessage("password")}
          </Form.Group>
          <Button id="loginSubmit" type="submit" style={{textTransform: 'uppercase', fontSize: '12px', fontWeight: '700', textAlign: 'center', backgroundColor: 'inherit', border: '1px solid #1BA098', borderRadius: '100px'}}>
            Login
          </Button>
        </Form>
        </Fragment>
      );

}

export default Login;