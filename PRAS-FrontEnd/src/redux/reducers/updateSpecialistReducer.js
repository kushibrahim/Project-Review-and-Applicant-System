import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function updateProjectReducer(state=initialState.updateSpecialist, action){
    switch (action.type) {
        case actionTypes.UPDATE_SPECIALIST_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}