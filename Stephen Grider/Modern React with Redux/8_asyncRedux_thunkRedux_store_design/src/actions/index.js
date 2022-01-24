import _ from 'lodash';
import jsonPlaceholder from "../apis/jsonPlaceholder";


// redux thunk help us returning a function with dispatch and getState
// return async function(dispatch, getState)

export const fetchPosts = () => async (dispatch) => {
        const response = await jsonPlaceholder.get('/posts');
        // disptach will return action 
        dispatch({ type: 'FETCH_POSTS', payload: response.data })
}

// // fetch user only one time -> first approach with memoization
// // private function
// export const fetchUser = (id) => (dispatch) => _fetchUser(id, dispatch);
// const _fetchUser = _.memoize( async (id, dispatch) => {
//     const response = await jsonPlaceholder.get(`/users/${id}`);
//     dispatch({ type: 'FETCH_USER', payload: response.data })
// });

// fetch user only one time -> second approach without memoization

export const fetchPostsAndUsers = () => async(dispatch, getState) => {
    await dispatch(fetchPosts());
    // console.log(getState().posts);
//    const userIds =  _.uniq(_.map(getState().posts, 'userId'));
//     // console.log(userIds);
//     userIds.forEach(id => dispatch(fetchUser(id)));

    // refactoring the above steps with loadash chain
    _.chain(getState().posts)
    .map('userId')
    .uniq()
    .forEach(id => dispatch(fetchUser(id)))
    .value();

}

export const fetchUser = (id) => async (dispatch) => {
    const response = await jsonPlaceholder.get(`/users/${id}`);
    dispatch({ type: 'FETCH_USER', payload: response.data })
};