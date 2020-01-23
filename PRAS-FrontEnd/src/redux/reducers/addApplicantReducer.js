import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state = initialState.addApplicant, action) {
    switch (action.type) {
        case actionTypes.ADD_APPLICANT_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}