import axios from 'axios';

const KEY = 'AIzaSyDILst0mFxD-ja38_SFmh4jrKXCO26cvHo';

export default axios.create({
    baseURL: 'https://www.googleapis.com/youtube/v3',
    params: {
        part: 'snippet',
        type: 'video',
        maxResults: 5,
        key: KEY
    }
});