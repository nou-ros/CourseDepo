import React from 'react';
import './ImageList.css'
import ImageCard from './ImageCard';

const ImageList = (props) => {
    // console.log(props.images);
    const items = props.images.map(image => {
        return <ImageCard key={image.id} image={image}/>;
    })
    return(
        <div className="image-list">
            {items}
        </div>
    )
}

export default ImageList;