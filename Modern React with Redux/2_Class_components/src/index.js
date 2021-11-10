import React from 'react'
import ReactDOM from 'react-dom'
import SeasonDisplay from './SeasonDisplay';

const App = () => {
    // mozila geo location api
    window.navigator.geolocation.getCurrentPosition
    (
        position => console.log(position),
        err => console.log(err)
    );

        return <div>Hello!</div>
};

ReactDOM.render(
    <App/>,
    document.querySelector('#root')
);