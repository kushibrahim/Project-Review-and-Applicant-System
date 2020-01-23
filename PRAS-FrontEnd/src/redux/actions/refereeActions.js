import * as actionTypes from "./actionTypes"

export function getRefereesSuccess(referees) {
    return { type: actionTypes.GET_REFEREE_SUCCESS, payload: referees }
}

export function addRefereeSuccess(referee) {
    return { type: actionTypes.ADD_REFEREE_SUCCESS, payload: referee }
}

export function updateRefereeSuccess(referee) {
    return { type: actionTypes.UPDATE_REFEREE_SUCCESS, payload: referee }
}

export function deleteRefereeSuccess(referee) {
    return { type: actionTypes.DELETE_REFEREE_SUCCESS, payload: referee }
}

//Add Project to REST API from React -- START
export function addRefereeApi(referee) {
    return fetch("http://localhost:8080/referees/addReferee",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(referee)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function addReferee(referee) {
    return function (dispatch) {
        return addRefereeApi(referee)
            .then(referee => dispatch(addRefereeSuccess(referee)))
            .catch(error => {
                throw error;
            })
    }
}//Add Project to REST API from React -- END

//Update Project to REST API from React -- START
export function updateRefereeApi(referee) {
    return fetch("http://localhost:8080/referees/updateReferee",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(referee)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function updateReferee(referee) {
    return function (dispatch) {
        return addRefereeApi(referee)
            .then(referee => dispatch(updateRefereeSuccess(referee)))
            .catch(error => {
                throw error;
            })
    }
}//Update Project to REST API from React -- END

//Delete Project to REST API from React -- START
export function deleteRefereeApi(referee) {
    return fetch("http://localhost:8080/referees/deleteReferee",
        {
            method: "DELETE",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(referee)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function deleteReferee(referee) {
    return function (dispatch) {
        return addRefereeApi(referee)
            .then(referee => dispatch(deleteRefereeSuccess(referee)))
            .catch(error => {
                throw error;
            })
    }
}//Delete Project to REST API from React -- END

export function getReferees() {
    return function (dispatch) {
        let url = "http://localhost:8080/referees"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getRefereesSuccess(result)))
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