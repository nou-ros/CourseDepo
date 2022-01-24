import { combineReducers } from "redux";
import postsReducer from './postsReducer'
import usersReducer from "./usersReducer";

export default combineReducers({
    // to hide error message in console
    // dummyStoreData: () => 10
    posts: postsReducer,
    users: usersReducer
})