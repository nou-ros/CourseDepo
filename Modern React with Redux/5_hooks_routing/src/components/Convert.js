import React, {useState, useEffect} from "react";
import axios from 'axios';
//AIzaSyCHUCmpR7cT_yDFHC98CZJy2LTms-IwDlM

const Convert = ({language, text}) => {
    const [translated, setTranslated] = useState('');
    const [debouncedText, setdebouncedText] = useState(translated);

    useEffect(() => {
        const timerId = setTimeout (() => {
            setdebouncedText(text)
        }, 500);

        return () => {
            clearTimeout(timerId);
        }
    }, [text]);

    useEffect(() => {
        const doTranslation = async () => {
             // console.log('New language or text');
           const {data} = await axios.post('https://translation.googleapis.com/language/translate/v2', {}, {
                params: {
                    q: debouncedText,
                    target: language.value,
                    key: 'AIzaSyCHUCmpR7cT_yDFHC98CZJy2LTms-IwDlM',
                }
            });
            // console.log(data.data.translations[0].translatedText);

            setTranslated(data.data.translations[0].translatedText);
        };

        doTranslation();
    }, [language, debouncedText]);

    return(
        <div>
            <h1 className="ui header">{translated}</h1>
        </div>
    )
};

export default Convert;