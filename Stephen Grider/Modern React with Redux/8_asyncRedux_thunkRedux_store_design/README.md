installed packages: npm install --save redux react-redux axios redux-thunk

redux : redux library
react-redux : integration layer between react and redux
axios : helps us make network requests
reduxt-thunk : middleware to help us make requests in a redux application

- Components are generally responsible for fetching data they need by calling an action creator
- Action creators are responsible for making API requests(this is where redux-thunk comes into play)
- We get fetched data into a component by generating new state in our redux store, then getting that into our component through mapStateToProps