import {LinkContainer} from 'react-router-bootstrap'

//CSS imports
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import Offcanvas from 'react-bootstrap/Offcanvas';


const NavBar = () => {

    return (
        <>
            <Navbar expand={false} className="mb-3 navbar">
                <Container fluid>
                    <Navbar.Brand href="#">Navbar Offcanvas</Navbar.Brand>
                    <Navbar.Toggle>Menu</Navbar.Toggle>
                    <Navbar.Offcanvas placement="end">
                        <Offcanvas.Header closeButton>
                            <Offcanvas.Title>
                                Menu
                            </Offcanvas.Title>
                        </Offcanvas.Header>
                        <Offcanvas.Body>
                            <Nav className="justify-content-end flex-grow-1 pe-3">
                                <LinkContainer to='/home'>
                                    <Nav.Link>Announcements</Nav.Link>
                                </LinkContainer>
                                <LinkContainer to='/projects'>
                                    <Nav.Link >Projects</Nav.Link>
                                </LinkContainer>
                                <LinkContainer to='/'>
                                    <Nav.Link >Logout</Nav.Link>
                                </LinkContainer>
                            </Nav>
                        </Offcanvas.Body>
                    </Navbar.Offcanvas>
                </Container>
            </Navbar>
        </>
    )
}

export default NavBar;