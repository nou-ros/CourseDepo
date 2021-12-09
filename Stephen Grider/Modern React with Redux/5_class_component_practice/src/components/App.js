import  React from 'react';
import SearchBar from './SearchBar';
import youtube from '../apis/youtube';
import VideoList from './VideoList';
import VideoDetail from './VideoDetail';

class App extends React.Component{

    state = { videos: [], selectedVideo: null };

    //when the app first loads, a default search will be placed with component did mount
    componentDidMount() {
        this.onTermSubmit('cats');
    }

    onTermSubmit = async (term) => {
        // console.log(term);
     const response = await youtube.get('/search',{
            params: {
                q: term
            }
        });
        // console.log(response);
        // console.log(response.data.items);
        
        this.setState({ 
            videos: response.data.items,
            // this will make a default video appear in the videoDetail option
            selectedVideo: response.data.items[0] 
        });
    }

    onVideoSelect = (video) => {
        // console.log('from the video item it has been clicked: ', video)
        this.setState({ selectedVideo: video })
    };

    render(){
        return (
            <div className="ui container">
                <SearchBar onTermSearch={this.onTermSubmit}/>
                <div className="ui grid">
                    <div className="ui row">
                        <div className="eleven wide column">
                            <VideoDetail videoSelected={this.state.selectedVideo} />
                        </div>
                        <div className="five wide column">
                            <VideoList videos={this.state.videos} onSelectVideo={this.onVideoSelect}/>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default App;