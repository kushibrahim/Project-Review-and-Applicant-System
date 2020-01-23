import { combineReducers } from "redux"
import projectListReducer from "./projectListReducer"
import specialistListReducer from "./specialistListReducer"
import applicantListReducer from "./applicantListReducer"
import refereeListReducer from "./refereeListReducer"
import refereeReviewReducer from "./refereeReviewReducer"
import specialistReviewReducer from "./specialistReviewReducer"
import addProjectReducer from "./addProjectReducer"
import updateProjectReducer from "./updateProjectReducer"
import deleteProjectReducer from "./deleteProjectReducer"
import addSpecialistReducer from "./addSpecialistReducer"
import updateSpecialistReducer from "./updateSpecialistReducer"
import deleteSpecialistReducer from "./deleteSpecialistReducer"
import addApplicantReducer from "./addApplicantReducer"
import updateApplicantReducer from "./updateApplicantReducer"
import deleteApplcantReducer from "./deleteApplicantReducer"
import addRefereeReducer from "./addRefereeReducer"
import updateRefereeReducer from "./updateRefereeReducer"

const rootReducers = combineReducers({
    projectListReducer,
    specialistListReducer,
    applicantListReducer,
    refereeListReducer,
    refereeReviewReducer,
    specialistReviewReducer,
    addProjectReducer,
    updateProjectReducer,
    deleteProjectReducer,
    addSpecialistReducer,
    updateSpecialistReducer,
    deleteSpecialistReducer,
    addApplicantReducer,
    updateApplicantReducer,
    deleteApplcantReducer,
    addRefereeReducer,
    updateRefereeReducer
})

export default rootReducers;