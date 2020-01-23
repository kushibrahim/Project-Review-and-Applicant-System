import * as actionTypes from "./actionTypes"

export function getProjectsSuccess(projects) {
    return { type: actionTypes.GET_PROJECTS_SUCCESS, payload: projects }
}

export function addProjectSuccess(project) {
    return { type: actionTypes.ADD_PROJECT_SUCCESS, payload: project }
}

export function updateProjectSuccess(project) {
    return { type: actionTypes.UPDATE_PROJECT_SUCCESS, payload: project }
}

export function deleteProjectSuccess(project) {
    return { type: actionTypes.DELETE_PROJECT_SUCCESS, payload: project }
}


//Add Project to REST API from React -- START
export function addProjectApi(project) {
    return fetch("http://localhost:8080/projects/projectAdd",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(project)
        })
        .then(handleResponse)
        .catch(handleError);
}

export function addProject(project) {
    return function (dispatch) {
        return addProjectApi(project)
            .then(addedProject => dispatch(addProjectSuccess(addedProject)))
            .catch(error => {
                throw error;
            });
    }
}//Add Project to REST API from React -- END

//Update Project to REST API from React -- START
export function updateProjectApi(project) {
    return fetch("http://localhost:8080/projects/projectUpdate",
        {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(project)
        })
        .then(handleResponse)
        .catch(handleError);
}

export function updateProject(project) {
    return function (dispatch) {
        return updateProjectApi(project)
            .then(updatedProject => dispatch(updateProjectSuccess(updatedProject)))
            .catch(error => {
                throw error;
            })
    }
}//Update Project to REST API from React -- END

//Delete Project to REST API from React -- START
export function deleteProjectApi(project) {
    return fetch("http://localhost:8080/projects/projectDelete",
        {
            method: "DELETE",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(project)
        })
        .then(handleResponse)
        .catch(handleError)
}

export function deleteProject(project) {
    return function (dispatch) {
        return deleteProjectApi(project)
            .then(deletedProject => dispatch(deleteProjectApi(deletedProject)))
            .catch(error => {
                throw error;
            })
    }
}//Delete Project to REST API from React -- END

//Get Projects to React from REST API -- START
export function getProjects() {
    return function (dispatch) {
        let url = "http://localhost:8080/projects"
        return fetch(url)
            .then(Response => Response.json())
            .then(result => dispatch(getProjectsSuccess(result)))
    }
}//Get Projects to React from REST API -- END


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