import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function specialistListReducer(state=initialState.specialist, action){

    switch (action.type) {
        case actionTypes.GET_SPECIALIST_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}