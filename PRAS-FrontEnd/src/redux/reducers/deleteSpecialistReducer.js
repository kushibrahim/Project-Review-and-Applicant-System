import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state=initialState.deleteSpecialist, action){
    switch (action.type) {
        case actionTypes.DELETE_SPECIALIST_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}