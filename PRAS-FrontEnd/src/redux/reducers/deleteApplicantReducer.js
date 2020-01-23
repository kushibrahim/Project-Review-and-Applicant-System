import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addProjectReducer(state = initialState.deleteApplicant, action) {
    switch (action.type) {
        case actionTypes.DELETE_APPLICANT_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}