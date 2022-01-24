import React from "react";

const Link = ({ className, href, children }) => {

    const onClick = (event) => {
        //ctrl+link to open the page in new tab - normal behavior
        if(event.metaKey || event.ctrlKey)
        {
            return;
        }
        // restric the default render 
        event.preventDefault();
        // restrict refresh of a page while switching to a diffrent link
        window.history.pushState({},'',href);

        const navEvent = new PopStateEvent('popstate');
        window.dispatchEvent(navEvent);
    }

    return(
        <a onClick={onClick} className={className} href={href}>
            {children}
        </a>
    )
};

export default Link; 