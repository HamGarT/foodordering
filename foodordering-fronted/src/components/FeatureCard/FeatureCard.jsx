
import React from "react";
import './featurecard.css'
const FeatureCard = ({title, icon : Icon , text, className})=>{
    return (
        <div className={className}>
            <Icon className="feature-card__icon"/>
            <h4>{title}</h4>
            <p>{text}</p>
        </div>
    );
}

export default FeatureCard;