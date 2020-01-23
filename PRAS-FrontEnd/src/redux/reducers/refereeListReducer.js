import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function refereeListReducer(state=initialState.referee, action){

    switch (action.type) {
        case actionTypes.GET_REFEREE_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}