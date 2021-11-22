import React, { useState, useEffect } from 'react';
import axios from 'axios';

const Search = () => {
    const [term, setTerm] = useState('Coding');
    const [results, setResults] = useState([]);

    const inputOnChange = (e) => {
        // console.log(e.target.value);
        setTerm(e.target.value);
    } 

    // console.log(results);
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
                    {/* xss security */}
                    <span dangerouslySetInnerHTML={{ __html: result.snippet }}></span>
                </div>
            </div>
        )
    })

    useEffect(() => {
        // console.log('effect');
        // with each key press the search will happen in async manner
        const search = async () => {
           const { data } = await axios.get('https://en.wikipedia.org/w/api.php', {
                params: {
                    action: 'query',
                    list: 'search',
                    origin: '*',
                    format: 'json',
                    srsearch: term
                }
            });
            
            // console.log(data.query.search);
            setResults(data.query.search);
        };

        if(term){
            search();
        }
    }, [term]);

    return(
        <div>
            <div className="ui form">
                <div className="field">
                    <label>Enter Search</label>
                    <input 
                        className="input"
                        value={term}
                        onChange={inputOnChange}
                    />
                </div>

                <div className="ui celled list">
                    {renderedResults}
                </div>
            </div>
        </div> 
    )
};

export default Search;