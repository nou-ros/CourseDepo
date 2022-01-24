import React from 'react'
import ReactDOM from 'react-dom'
import SeasonDisplay from './SeasonDisplay'
import Loader from './Loader';
import './index.css';

// Classbased Component
class App extends React.Component{
    //initializing state in constructor (first approach)
    // constructor(props){
    //     super(props);
    //     this.state = { lat: null, errorMessage: '' };
    // }

    //initializing state (second/alternate approach)
    state = {latitude: null, errorMessage: ''};

    // data is loading here
    componentDidMount(){
         // mozila geolocation api
         window.navigator.geolocation.getCurrentPosition
         (
            // console.log(position),
            position => this.setState({ latitude: position.coords.latitude }), // updating the state with setState
            err => this.setState({ errorMessage: err.message })
         );
    };

    //helper function
    renderContent() {
        // conditionals to return JSX
        if(this.state.errorMessage && !this.state.latitude){
            return <div>Error:{ this.state.errorMessage }</div>
        }

        if(!this.state.errorMessage && this.state.latitude){
            // return <div>Latitude:{ this.state.lat }</div>
            // sending props to child component 
            return <SeasonDisplay latitude={this.state.latitude} />
        }
    
        // reusualbe component 
        return <Loader message="Please accept location request!"/>;
    }

    render(){
        return (
            <div className="border-red">
                {this.renderContent()}
            </div>
        )
    }
}

ReactDOM.render(
    <App/>,
    document.querySelector('#root')
);