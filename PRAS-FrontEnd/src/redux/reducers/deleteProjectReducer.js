import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state=initialState.deleteProject, action){
    switch (action.type) {
        case actionTypes.DELETE_PROJECT_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}