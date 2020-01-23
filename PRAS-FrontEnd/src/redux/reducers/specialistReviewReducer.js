import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function specialistReviewReducer(state=initialState.specialistReview, action){

    switch (action.type) {
        case actionTypes.GET_SPECIALISTREVIEW_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}