import React from "react";
import Accordion from './components/Accordion'
import Search from "./components/Search";

const items = [
    {
        title: "What is React?",
        content: "React is a JS front-end framework."
    }, 
    {
        title: "What is Django?",
        content: "Django is a python back-end framework."
    }, 
    {
        title: "What is Linux?",
        content: "Open source OS"
    }, 
]

const App = () => {
    return(
        <div>
            <Accordion items={items}/>
            <Search/>
        </div>
    )
};

export default App;