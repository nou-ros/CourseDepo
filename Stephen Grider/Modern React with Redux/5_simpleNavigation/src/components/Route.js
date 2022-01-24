import { useEffect, useState } from "react";

const Route = ({path, children}) => {

    const [currentPath, setCurrentPath] = useState(window.location.pathname);

    // informing the route that url has chaged 
    useEffect(() => {
        const onLocationChange = () => {
            // console.log('Location Changed');
            setCurrentPath(window.location.pathname);
        };
        window.addEventListener('popstate', onLocationChange);

        return () => {
            window.removeEventListener('popstate', onLocationChange);
        }
    }, []);

    return currentPath === path ? children : null;
};

export default Route; 