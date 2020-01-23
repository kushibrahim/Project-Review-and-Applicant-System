import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state = initialState.addSpecialist, action) {
    switch (action.type) {
        case actionTypes.ADD_SPECIALIST_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}