import React from 'react'
import styles from '../styles/ACard.css'

const ACard = (props) => {
  return (
    <div className="card">
        <div className="card-body">
            <h1 className="name">{props.name}</h1>
            <h1 className="date">{props.date}</h1>
            <p className="description">{props.description}</p>
        </div>
    </div>
  )
}

export default ACard