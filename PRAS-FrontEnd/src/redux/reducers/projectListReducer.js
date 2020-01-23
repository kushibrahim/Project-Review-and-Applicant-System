import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function projectListReducer(state=initialState.project, action){
    switch (action.type) {
        case actionTypes.GET_PROJECTS_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}