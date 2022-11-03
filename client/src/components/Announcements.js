import React from 'react'
import ACard from './ACard'
import NavBar from './NavBar'
import { useState, useEffect } from 'react'
import fetchUserData from './Login'

const url = `http://localhost:8080/announcements/company/${companyId}`

const Announcements = () => {
  const [company, setCompany] = useState(JSON.parse(localStorage.getItem("company")));
  const [announcementData, setAnnouncementData] = useState({});
  const [name, setName] = useState();
  const [date, setDate] = useState();
  const [description, setDescription] = useState({description: "Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum"});

  

  const loadAnnouncements = async (id) => {
    const response = await fetchUserData(`${id}`);
    const data = await response.json();
    console.log("data: " + data);
    return data;
  }

  useEffect(() => {
    const fetchData = async () => {
      setAnnouncement(data);
    }; 
    fetchData();
  }, []);

  return (
    <>
    <NavBar />
    <div className="main-container">
      <h4 style={{display: 'flex', alignItems: 'center', justifyContent: 'center', fontSize: '48px', fontWeight: '400', color: '#1BA098'}}>Announcements</h4> 
      <ACard 
        name="Chris, CEO"
        date="11/1/2022"
        description="Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum"
      />
    </div>
    </>
  )
}

export default Announcements