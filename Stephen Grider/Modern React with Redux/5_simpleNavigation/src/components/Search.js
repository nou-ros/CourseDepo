import axios from 'axios';
import React, { useState, useEffect } from 'react';


const Search = () => {

    const [term, setTerm] = useState('code');
    const [results, setResults] = useState([]);
    const [debouncedTerm, setDebouncedTerm] = useState(term);

    //this will update debouncedTerm with the update of Term
    useEffect(() => {
        const timerId = setTimeout(() => {
            setDebouncedTerm(term)
        }, 1000);
        
        return () => {
              clearTimeout(timerId);
        };

    }, [term])


    useEffect(() => {
         // console.log('render');
        // async await for axios with useEffect
        const search = async () => {
            const { data } = await axios.get('https://en.wikipedia.org/w/api.php',{
                params: {
                    action:'query',
                    list:'search',
                    origin:'*',
                    format:'json',
                    srsearch: debouncedTerm
                },
            });

            // console.log(data);
            setResults(data.query.search);
        };
        
        if(debouncedTerm)
        {
            search();
        }
    }, [debouncedTerm]);


    useEffect(() => {
       
        
    }, [term]);


    const renderedResults = results.map((result) => {
        return(
            <div key={result.pageid} className="item">
                <div className="right floated content">
                    <a 
                        className="ui button"
                        href={`https://en.wikipedia.org?curid=${result.pageid}`} 
                        target="_blank" 
                        rel="noreferrer"
                    >
                        Go
                    </a>
                </div>
                <div className="content">
                    <div className="header">
                        {result.title}
                    </div>
                    <span dangerouslySetInnerHTML={{ __html: result.snippet }}></span>
                </div>
            </div>
        )
    })


    return(
        <div>
            <div className="ui form">
                <div className="field">
                    <label>Search</label>
                    <input 
                        value={term} 
                        onChange={(e) => setTerm(e.target.value)}
                        className="input"
                    />
                </div>
            </div>
            <div className="ui celled list">
                {renderedResults}
            </div>
        </div>
    )
}


export default Search;