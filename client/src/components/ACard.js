import React from 'react'


const ACard = ({name, date, description}) => {
  return (
    <div className="card">
        <div className="card-body">
            <h1 className="name">{name}</h1>
            <h1 className="date">{date}</h1>
            <p className="description">{description}</p>
        </div>
    </div>
  )
}

export default ACard
