import * as actionTypes from "./actionTypes"

export function getRefereeReviewSuccess(reviews) {
    return { type: actionTypes.GET_REFEREEREVIEW_SUCCESS, payload: reviews }
}

export function getRefereeReviews() {
    return function (dispatch) {
        let url = "http://localhost:8080/refereeReview"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getRefereeReviewSuccess(result)))
    }
}