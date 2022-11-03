import { Fragment, useState, useEffect } from 'react';
import { useNavigate } from "react-router-dom";

import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

const Login = () => {
  const [userData, setUserData] = useState([]);
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchUserData = async () => {
      const response = await fetch('http://localhost:3001/users')
      const newData = await response.json();
      setUserData(newData);
    }; 
    fetchUserData();
  }, []);

  // const handleChange = (e) => {
  //   const userValue = e.target.value;
  // }
  
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
        localStorage.setItem("user", JSON.stringify(userInfo));
        // localStorage.setItem("companyId", JSON.stringify(company));
        // localStorage.setItem("teamId", JSON.stringify(team));
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
            <Form.Control type="text" name="username" placeholder="Enter username" />
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