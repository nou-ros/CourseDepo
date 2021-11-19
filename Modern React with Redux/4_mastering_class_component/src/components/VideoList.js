import React from 'react'
import VideoItem from './VideoItem';

const VideoList = ({videos, onSelectVideo }) => {
    // console.log(videos.length);
    const renderedList = videos.map((video) => {
        return (
            <VideoItem 
                key={video.id.videoId} 
                videoOnSelect={onSelectVideo} 
                video={video}
            />
        );
    })
    return <div className="ui relaxed divided list">{renderedList}</div>
};

export default VideoList;