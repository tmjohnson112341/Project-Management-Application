import React from 'react'
import ACard from './ACard'
import Navbar from './Navbar'
import { useState, useEffect } from 'react'
import fetchUserData from './Login'

const url = `http://localhost:8080/announcements/company/${companyId}`


const Announcements = () => {
  const [announcementData, setAnnouncementData] = useState({});

    const companyID = JSON.parse(localStorage.getItem("companyID"))


  const loadAnnouncements = async () => {
    const response = await fetch(`http://localhost:8080/announcements/company/${companyID}`,{mode:"cors"});
    let data = await response.json();
    setAnnouncementData(data);
  }

  console.log(announcementData);
  useEffect(() => {
    loadAnnouncements();
  }, []);


  return (
    <>
    <Navbar />
    <div className="main-container">
      {/* <h4 style={{display: 'flex', alignItems: 'center', justifyContent: 'center', fontSize: '48px', fontWeight: '400', color: '#1BA098'}}>Announcements</h4>  */}
      {announcementData.length > 0 ? announcementData.map(a => (
          <div key={a.id}>
           <ACard
              name={a.user.firstName}
              date={a.date}
              description={a.message}
            />
          </div>
          )
        ):"No announcements to display!"}
    </div>
    </>
  )
}

export default Announcements