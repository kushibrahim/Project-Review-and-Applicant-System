import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function applicantListReducer(state=initialState.applicant, action){

    switch (action.type) {
        case actionTypes.GET_APPLICANT_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}