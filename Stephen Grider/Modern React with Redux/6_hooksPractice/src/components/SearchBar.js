import  React, {useState} from 'react';


const SearchBar = ({onTermSearch}) => {

    const [term, setTerm] = useState('');

    const onInputChange = (event) => {
        // console.log(event.target.value);
        setTerm(event.target.value)
    };

    const onFormSubmit = (event) => {
        event.preventDefault();
        //child to parent component
        onTermSearch(term);
    }

    return (
        <div className="search-bar ui segment">
            <form className="ui form" onSubmit={onFormSubmit}>
                <div className="field">
                    <label>Video Search</label>
                    <input 
                    type='text' 
                    onChange={onInputChange}
                    value={term} 
                    />
                </div>
            </form>
        </div>
    )
}


export default SearchBar;