import React, { useState } from 'react';

const Accordion = ({items}) => {

    // state in fucntion with useState hooks
    const [activeIndex, setActiveIndex] = useState(null);

    const onTitleClick = (index) => {
        // console.log('Title clicked', index)
        setActiveIndex(index)
    };

    console.log('rendered')

    const renderedItems = items.map((item, index) => {

        // checking if the clicked index and state are equal
        const active = index === activeIndex ? 'active' : '';

        return <React.Fragment key={item.title}>
            <div 
                className={`title ${active}`}
                onClick={() => onTitleClick(index)}
            >
            <i className="dropdown icon"></i>
                {item.title}
            </div>
            <div className={`content ${active}`}>
                <p>{item.content}</p>
            </div>
        </React.Fragment>
    })
    return(
        <div className="ui styled accordion">
            {renderedItems}
        </div>
    )
}

export default Accordion;