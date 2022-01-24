import './SeasonDisplay.css';
import React from "react";

const seasonConfig = {
    summer: {
        text: "Let's hit the beach",
        iconName: 'sun'
    },

    winter: {
        text: "It's chilly!",
        iconName: 'snowflake'
    },
};

const getSeason = (latitude, month) => {
    if (month>2 && month<9){
        return latitude > 0 ? 'summer':'winter';
    }
    else{
        return latitude > 0 ? 'winter':'summer';
    }
}

const SeasonDisplay = (props) => {
    const season = getSeason(props.latitude, new Date().getMonth())
    // console.log(props.latitude);
    console.log(season);

    const { text, iconName } = seasonConfig[season]; //{text, iconName}

    return (
        <div className={`season-display ${season}`}>
            <i className={`icon-left ${iconName} icon massive`}/>
            <h1>{text}</h1>
            <i className={`icon-right ${iconName} icon massive`}/>
        </div>
    );
}

export default SeasonDisplay;