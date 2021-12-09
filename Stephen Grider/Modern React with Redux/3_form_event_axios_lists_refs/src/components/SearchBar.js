import React from 'react'

class SearchBar extends React.Component{

    // first approach
    // onInputChange(event){
    //     console.log(event.target.value);
    // }

    state = { term: '' };

    // without arrow function there will be state undefined issue due to this.
    onFormSubmit = (event) => {
        event.preventDefault();
        // console.log(this.state.term);

        //sending props from child to parent component
        this.props.onSearch(this.state.term);
    }

    render() {
        return(
            <div className="ui segment">
                <form className="ui form" onSubmit={this.onFormSubmit}>
                    <div className="field">
                        <label>Image Search</label>
                        {/* event handler first approach with function*/}
                        {/* <input type="text" onChange={this.onInputChange}/> */}

                        {/* event handler second approach with arrow function for onliner */}
                        <input 
                            type="text" 
                            value={this.state.term}
                            // e.target.value.toUpperCase() 
                            onChange={(e) => this.setState({ term: e.target.value })}/>
                    </div>
                </form>
            </div>
        ); 
    }
}

export default SearchBar