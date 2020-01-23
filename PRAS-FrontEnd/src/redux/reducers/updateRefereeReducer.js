import * as actionTypes from "../actions/actionTypes"
import initialState from "./initialState";

export default function addRefereeReducer(state = initialState.updateReferee, action) {
    switch (action.type) {
        case actionTypes.UPDATE_REFEREE_SUCCESS:
            return action.payload;
        default:
            return state;
    }
}