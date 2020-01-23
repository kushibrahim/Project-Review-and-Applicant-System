import * as actionTypes from "./actionTypes"

export function getApplicantsSuccess(applicants) {
    return { type: actionTypes.GET_APPLICANT_SUCCESS, payload: applicants }
}

export function addApplicantSuccess(applicant) {
    return { type: actionTypes.ADD_APPLICANT_SUCCESS, payload: applicant }
}

export function updateApplicantSuccess(applicant) {
    return { type: actionTypes.UPDATE_APPLICANT_SUCCESS, payload: applicant }
}

export function deleteApplicantSuccess(applicant) {
    return { type: actionTypes.DELETE_APPLICANT_SUCCESS, payload: applicant }
}

//Add Applicant to REST API from React -- START
export function addApplicantApi(applicant) {
    return fetch("http://localhost:8080/applicant/userAdd",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(applicant)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function addApplicant(applicant){
    return function (dispatch){
        return addApplicantApi(applicant)
        .then(applicant => dispatch(addApplicantSuccess(applicant)))
        .catch(error =>{
            throw error;
        })
    }
}

//Add Applicant to REST API from React -- END

//Update Applicant to REST API from React -- START
export function updateApplicantApi(applicant) {
    return fetch("http://localhost:8080/applicant/userUpdate",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(applicant)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function updateApplicant(applicant){
    return function (dispatch){
        return addApplicantApi(applicant)
        .then(applicant => dispatch(updateApplicantSuccess(applicant)))
        .catch(error =>{
            throw error;
        })
    }
}
//Update Applicant to REST API from React -- END

//Delete Applicant to REST API from React -- START
export function deleteApplicantApi(applicant) {
    return fetch("http://localhost:8080/applicant/userDelete",
        {
            method: "DELETE",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(applicant)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function deleteApplicant(applicant){
    return function (dispatch){
        return addApplicantApi(applicant)
        .then(applicant => dispatch(deleteApplicantSuccess(applicant)))
        .catch(error =>{
            throw error;
        })
    }
}
//Delete Applicant to REST API from React -- END

export function getApplicants() {
    return function (dispatch) {
        let url = "http://localhost:8080/applicant"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getApplicantsSuccess(result)))
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
    console.error("Something went wrong...")
    throw error;
}