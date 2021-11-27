import React, {useState} from 'react';
import Accordion from './components/Accordion';
import Search from './components/Search';
import Dropdown from './components/Dropdown';
import Translate from './components/Translate';

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
    // console.log(selected);
    const [showDropDown, setShowDropDown] = useState(true);
    return(
        <div>
            {/* <Accordion items={contents}/>
            <Search /> */}
            {/* <button onClick={() => setShowDropDown(!showDropDown)}>
                Toggle Dropdown
            </button> */}
            {/* if showDropDown true then show dropdown or else don't show. */}
            {/* { showDropDown ?
                <Dropdown 
                    label = "Select a color"
                    selected={selected}
                    onSelectedChange={setSelected} 
                    options={options}
                />
                : null
            } */}

            <Translate/>
            
        </div>
    )
}


export default App;
