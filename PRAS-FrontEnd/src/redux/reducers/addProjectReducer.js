import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state = initialState.addProject, action) {
    switch (action.type) {
        case actionTypes.ADD_PROJECT_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}