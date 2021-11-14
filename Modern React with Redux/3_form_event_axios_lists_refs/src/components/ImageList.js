import React from 'react';

const ImageList = (props) => {
    // console.log(props.images)
                    // destructed map item to 
    const items = props.images.map(({description, id, urls }) => {
        return <img key={id} src={urls.regular} alt={description}/>
    })
    return(
        <div>
            {items}
        </div>
    )
}

export default ImageList;