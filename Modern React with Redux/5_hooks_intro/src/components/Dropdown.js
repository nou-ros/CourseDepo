import React, { useState, useEffect, useRef } from 'react';


const Dropdown = ({ label, options, selected, onSelectedChange }) => {

    // this will hande the dropdown active class
    const [open, setOpen] = useState(false);
    const ref = useRef();


    useEffect(() => {
        const onBodyClick = (event) => {
            // console.log(event.target);
            if(ref.current.contains(event.target)){
                return;
            }
            setOpen(false);
        };

        document.body.addEventListener('click', onBodyClick, { capture: true });

        // cleanup function will handle null operation for dropdown with button toggle
        return () => {
            //detach body event listener
            document.body.removeEventListener('click', onBodyClick,  { capture: true });
        };
    }, []);

    const renderedOptions = options.map((option) => {
        //to ensure selected option don't show in the dropdown
        if (option.value === selected.value)
        {   
            // with null react will not render anything.
            return null;
        }
        return(
            <div 
                key={option.value} 
                className="item"
                onClick={() => {onSelectedChange(option)}}
            >
                {option.label}
            </div>
        );
    });

    // console.log(ref.current);

    // console.log(renderedOptions);
    return(
        <div ref={ref} className="ui form">
            <div className="field">
                <label className="label">{label}</label>
                <div 
                    onClick={() => setOpen(!open)} 
                    className={"ui selection dropdown"}
                >
                    <i className="dropdown icon"></i>
                    <div className="text">{selected.label}</div>
                    <div className={`menu ${ open ? 'visible transition':''}`}>
                        {renderedOptions}
                    </div>
                </div>
            </div>
        </div>
    )
}


export default Dropdown;