import { Fragment, useState, useEffect } from 'react';
import { useNavigate } from "react-router-dom";

import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

const Login = () => {

  const [credentials, getCredentials] = useState();
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const navigate = useNavigate();

  useEffect(() => {
    fetch('http://localhost:3001/users')
      .then(res => res.json())
      .then(data => getCredentials(data))
      .catch(err => console.error(err))
  }, []);


  
  const errors = {
    username: "invalid username",
    password: "invalid password"
  };
  
  const renderErrorMessage = (name) =>
  name === errorMessages.name && (
    <div className="error">{errorMessages.message}</div>
  );

  const handleSubmit = (event) => {
    // Prevent page reload
    event.preventDefault();

    let { username, password } = document.forms[0];

    const userData = credentials.find((user) => user.username === username.value);

    if (userData) {
      if (userData.password !== password.value) {
        // Invalid password
        setErrorMessages({ name: "password", message: errors.password });
      } else {
        setIsSubmitted(true);
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
          <Button id="loginSubmit" type="submit">
            Login
          </Button>
        </Form>
        </Fragment>
      );

}

export default Login;