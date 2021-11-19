import React from "react";

const VideoDetail = ({videoSelected}) => {
    // if video null true show loading 
    if(!videoSelected){
        return <div>loading...</div>
    }
    
    const videoSrc = `https://www.youtube.com/embed/${videoSelected.id.videoId}`

    return (
        <div>
            <div className="ui embed">
                <iframe title="video player" src={videoSrc} />
            </div>
            <div className="ui segment">
                <h4 className="ui header">{videoSelected.snippet.title}</h4>
                <p>{videoSelected.snippet.description}</p>
            </div>
        </div>
    );
};

export default VideoDetail;