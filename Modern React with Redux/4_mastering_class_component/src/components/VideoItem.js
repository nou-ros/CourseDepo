import React from "react";
import './VideoItem.css'

const VideoItem = ({video, videoOnSelect}) => {
    return (
        // with videoOnSelect we are sending the video data to VideoList parent to APP parent
        <div onClick={() => videoOnSelect(video) } className="item video-item">
            <img className="ui image" src={video.snippet.thumbnails.medium.url} alt={video.snippet.title}/>
            <div className="content">
                <div className="header">{video.snippet.title}</div>
            </div>
            
        </div>
    )
};

export default VideoItem;