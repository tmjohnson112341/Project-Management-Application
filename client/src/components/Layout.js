import Announcements from "./Announcements";
import NavBar from "./NavBar";
import Projects from "./Projects";

const Layout = () => {

   return (
    <>
        <NavBar />
        <div>
            <Announcements />
            <Projects />
        </div>
    </>
   )
}


export default Layout;
