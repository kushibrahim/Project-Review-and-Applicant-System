import * as actionTypes from "./actionTypes"
import { updateProjectApi } from "./projectActions"

export function getSpecialistsSuccess(specialists) {
    return { type: actionTypes.GET_SPECIALIST_SUCCESS, payload: specialists }
}

export function addSpecialistSuccess(specialist) {
    return { type: actionTypes.ADD_SPECIALIST_SUCCESS, payload: specialist }
}

export function updateSpecialistSuccess(specialist) {
    return { type: actionTypes.UPDATE_SPECIALIST_SUCCESS, payload: specialist }
}

export function deleteSpecialistSuccess(specialist) {
    return { type: actionTypes.DELETE_SPECIALIST_SUCCESS, payload: specialist }
}

//Add Specialist to REST API from React -- START
export function addSpecialistApi(specialist) {
    return fetch("http://localhost:8080/specialists/specialistAdd", {
        method: "POST",
        headers: { "content-type": "application/json" },
        body: JSON.stringify(specialist)
    })
        .then(handleResponse)
        .catch(handleError)
}

export function addSpecialist(specialist) {
    return function (dispatch) {
        return addSpecialistApi(specialist)
            .then(specialists => dispatch(addSpecialistSuccess(specialists)))
            .catch(error => {
                throw error;
            })
    }
}//Add Specialist to REST API from React -- END

//Update Specialist to REST API from React -- START
export function updateSpecialistApi(specialist) {
    return fetch("http://localhost:8080/specialists/specialistUpdate", {
        method: "POST",
        headers: { "content-type": "application/json" },
        body: JSON.stringify(specialist)
    })
        .then(handleResponse)
        .catch(handleError)
}

export function updateSpecialist(specialist) {
    return function (dispatch) {
        return updateProjectApi(specialist)
            .then(result => dispatch(updateSpecialistSuccess(result)))
            .catch(error => {
                throw error;
            })
    }
}//Update Specialist to REST API from React -- END

//Delete Specialist to REST API from React -- START
export function deleteSpecialistApi(specialist) {
    return fetch("http://localhost:8080/specialists/specialistDelete", {
        method: "DELETE",
        headers: { "content-type": "application/json" },
        body: JSON.stringify(specialist)
    })
        .then(handleResponse)
        .catch(handleError)
}

export function deleteSpecialist(specialist) {
    return function (dispatch) {
        return deleteSpecialistApi(specialist)
            .then(result => dispatch(deleteSpecialistSuccess(result)))
            .catch(error => {
                throw error;
            })
    }
}//Delete Specialist to REST API from React -- END

export function getSpecialists() {
    return function (dispatch) {
        let url = "http://localhost:8080/specialists"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getSpecialistsSuccess(result)))
    }
}

export async function handleResponse(response) {
    if (response.ok) {
        return response.json();
    }

    const error = await response.text();
    throw new Error(error);
}

export function handleError(error) {
    console.error("Something went wrong")
    throw error;
}