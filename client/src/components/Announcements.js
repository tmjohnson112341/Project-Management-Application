import React from 'react'
import ACard from './ACard'

const Announcements = () => {
  return (
    <div className="main-container">
      <h4 style={{display: 'flex', alignItems: 'center', justifyContent: 'center', fontSize: '48px', fontWeight: '400', color: '#1BA098'}}>Announcements</h4>
      <ACard />
    </div>
  )
}

export default Announcements