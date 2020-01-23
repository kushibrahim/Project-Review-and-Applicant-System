import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addRefereeReducer(state = initialState.addReferee, action) {
    switch (action.type) {
        case actionTypes.ADD_REFEREE_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}