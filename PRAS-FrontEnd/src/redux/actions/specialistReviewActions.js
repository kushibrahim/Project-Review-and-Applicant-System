import * as actionTypes from "./actionTypes"

export function getSpecialistReviewSuccess(reviews) {
    return { type: actionTypes.GET_SPECIALISTREVIEW_SUCCESS, payload: reviews }
}

export function getSpecialistReviews() {
    return function (dispatch) {
        let url = "http://localhost:8080/specialistReview"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getSpecialistReviewSuccess(result)))
    }
}