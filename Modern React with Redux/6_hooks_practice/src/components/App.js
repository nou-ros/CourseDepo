import  React, {useState, useEffect } from 'react';
import SearchBar from './SearchBar';
import VideoList from './VideoList';
import VideoDetail from './VideoDetail';
import useVideos from '../hooks/useVideos';

const App = () => {
    
    const [selectedVideo, setSelectedVideo] = useState(null);
    const [videos, search] = useVideos('cats');

    useEffect(() => {
        setSelectedVideo(videos[0]);
    }, [videos]);


    return (
        <div className="ui container">
            <SearchBar onTermSearch={search}/>
            <div className="ui grid">
                <div className="ui row">
                    <div className="eleven wide column">
                        <VideoDetail videoSelected={selectedVideo} />
                    </div>
                    <div className="five wide column">
                        <VideoList videos={videos} onSelectVideo={(video) => {setSelectedVideo(video)}}/>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default App;