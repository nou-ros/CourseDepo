import React from 'react'
import ReactDOM  from 'react-dom'
import faker from 'faker';
import CommentDetail from './CommentDetail';
import ApprovalCard from './ApprovalCard';

// nesting components
const App = () => {
    return (
        <div className="ui container comments">
            {/* reusable component - props.children */}
            <ApprovalCard>
                <div>
                    <h4>Warning!</h4>
                    Are you sure you want to do this? 
                </div>
            </ApprovalCard>

            <ApprovalCard>
                {/* use of props  */}
                <CommentDetail author="Sam" time="Today at 4.12pm" content="Nice post" avatar={faker.image.avatar()}/>
            </ApprovalCard>    

            <ApprovalCard>
                <CommentDetail author="Lia" time="Today at 2.10pm" content="Nice post" avatar={faker.image.avatar()}/>
            </ApprovalCard>    

            <ApprovalCard>    
                <CommentDetail author="Tim" time="Today at 8.00am" content="Nice post" avatar={faker.image.avatar()}/>
            </ApprovalCard>    
            
        </div> 
    );
};

ReactDOM.render(<App />, document.querySelector('#root'));