import React, {useState} from 'react';
import Accordion from './components/Accordion';
import Search from './components/Search';
import Dropdown from './components/Dropdown';
import Translate from './components/Translate';
import Route from './components/Route';
import Header from './components/Header';

const contents = [
    {
        title: 'What is django?',
        content: 'Django is a python backend framework.'
    },
    {
        title: 'What is DRF?',
        content: 'Django rest framework for building api.'
    },
    {
        title: 'What is React?',
        content: 'JavaScript frontend framework.'
    }
]

const options = [
    {
        label: "The Color Red",
        value: 'red'
    },
    {
        label: "The Color Green",
        value: 'green'
    },
    {
        label: "A Shade of Blue",
        value: 'blue'
    }
]


const App = () => {
    const [selected, setSelected] = useState(options[0]);
    return(
        <div>
            <Header />
            <Route path="/">
                <Accordion items={contents}/>
            </Route>
            <Route path="/search">
                <Search /> 
            </Route>
            <Route path="/dropdown">
                <Dropdown
                    label = "Select a color"
                    selected={selected}
                    onSelectedChange={setSelected} 
                    options={options}
                />
            </Route>
            <Route path="/translate">
                <Translate />;
            </Route>
        </div>
    )
}


export default App;
