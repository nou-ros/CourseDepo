// Import the React and ReactDOM libraries
import React from 'react';
import ReactDOM  from 'react-dom';

function getButtonText(){
    return 'Click here.'
}


// Create a react component (function component)
const App = function(){

    const buttonText = 'Click Me!';
    const numbers = ['Hi', 'There'];
    const value = 5;

    const jsObject = { text: "Click Object" };

    const style = { backgroundColor: 'blue', color: 'white' }

    const labelText = "Enter name: "

    return (
        <div>
            {/* JSX class */}
            <label htmlFor="test" className="label">
               {labelText}
            </label>
            <input id="test" type="text"/>

            {/* JSX styling */}
            <button style={style}>
                {/* referencing JS variable inside JSX */}
                {/* {value} */}

                {/* referencing JS function inside JSX */}
                {/* {getButtonText()} */}

                {/* refrencing JS object */}
                {jsObject.text}
            </button>
        </div>
    );
};

// Take the react component and show it on the screen 
ReactDOM.render(
    <App />,
    document.querySelector('#root')
);