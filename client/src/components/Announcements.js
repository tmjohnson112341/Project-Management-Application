import React from 'react'
import ACard from './ACard'
import NavBar from './NavBar'

const Announcements = () => {
  return (
    <>
    <NavBar />
    <div className="main-container">
      <h4 style={{display: 'flex', alignItems: 'center', justifyContent: 'center', fontSize: '48px', fontWeight: '400', color: '#1BA098'}}>Announcements</h4>
      <ACard 
        name="Chris, CEO"
        date="11/1/2022"
        description="Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum 
        Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum
        Lorem ipsum our announcements go here! Our business has been going great and we are going to announce the winners of employee of the month! Lorem ipsum"
      />
    </div>
    </>
  )
}

export default Announcements