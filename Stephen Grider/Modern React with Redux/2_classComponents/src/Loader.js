import React from "react";

const Loader = (props) => {
    return(
        <div>
              <div className="ui active dimmer">
                <div className="ui text loader">{props.message}</div>
            </div>
        </div>
    );
};

// will be used if no message prop provided as it is made as reusable component
Loader.defaultProps = {
    message: 'Loading...'
}

export default Loader;