import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function updateProjectReducer(state=initialState.updateProject, action){
    switch (action.type) {
        case actionTypes.UPDATE_PROJECT_SUCCESS:
            return action.payload;
        
        default:
            return state;
    }
}