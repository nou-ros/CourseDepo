
import axios from 'axios';

const callAxios = axios.create({
    baseURL: 'https://api.unsplash.com',
    headers: {
        Authorization:'Client-ID Vkgw0xU_SwagvYOh4j-x5gCucNkkowO_V21PiZT42-g'
    }
});

export default callAxios;