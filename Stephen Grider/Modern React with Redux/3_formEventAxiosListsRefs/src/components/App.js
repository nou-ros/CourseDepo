import React from 'react';

import SearchBar from './SearchBar';
import callAxios from '../api/Unsplash';
import ImageList from './ImageList';

class App extends React.Component{

    state = { images: [] }

    // async await to get data from api
     onSearchSubmit = async(term) => {
        // console.log(term)
        const response = await callAxios.get('/search/photos', {
            params: { query: term },
        });

        console.log(response.data);
        this.setState({ images: response.data.results });
    }

    render() 
    {   
        return(
            <div className="ui container" style={{ marginTop: '10px' }}>
                <SearchBar onSearch={this.onSearchSubmit}/>
                {/* Found: { this.state.images.length } */}
                {/* parent to child props */}
                <ImageList images={this.state.images}/>
            </div>
        )
    }
}

export default App;