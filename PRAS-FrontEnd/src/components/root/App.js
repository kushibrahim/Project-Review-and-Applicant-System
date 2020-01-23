import React, { Component } from 'react'
import Dashboard from './Dashboard'
import Navi from "../navi/Navi"
import { Route, Switch } from "react-router-dom"
import ApplicantList from "../applicant/ApplicantList"
import ProjectList from '../projects/ProjectList'
import RefereeList from '../referees/RefereeList'
import SpecialistList from "../specialist/SpecialistList"
import RefereeReviews from '../refereeReviews/RefereeReviews'
import NotFound from '../error/NotFound'
import SpecialistReviews from '../specialistReview/SpecialistReviews'
import AddProject from '../projects/AddProject'
import AddSpecialist from '../specialist/AddSpecialist'
import UpdateSpecialist from '../specialist/UpdateSpecialist'
import AddApplicant from '../applicant/AddApplicant'
import AddReferee from '../referees/AddReferee'
import UpdateReferee from "../referees/UpdateReferee"

export default class App extends Component {
  render() {
    return (
      <div>
        <Navi></Navi>
        <Switch>
          <Route path="/" exact strict component={Dashboard}></Route>
          <Route path="/applicants" exact strict component={ApplicantList}></Route>
          <Route path="/projects" exact strict component={ProjectList}></Route>
          <Route path="/referees" exact strict component={RefereeList}></Route>
          <Route path="/specialists" exact strict component={SpecialistList}></Route>
          <Route path="/refereeReviews" exact strict component={RefereeReviews}></Route>
          <Route path="/specialistReviews" exact strict component={SpecialistReviews}></Route>

          <Route path="/projects/addProject" exact strict component={AddProject}></Route>

          <Route path="/specialists/addSpecialist" exact strict component={AddSpecialist}></Route>
          <Route path="/specialists/updateSpecialist" exact strict component={UpdateSpecialist}></Route>

          <Route path="/applicants/addApplicant" exact strict component={AddApplicant}></Route>
          <Route path="/applicants/updateApplicant" exact strict component={AddApplicant}></Route>

          <Route path="/referees/addReferee" exact strict component={AddReferee}></Route>
          <Route path="/referees/updateReferee" exact strict component={UpdateReferee}></Route>
          <Route component={NotFound}></Route>
        </Switch>
      </div>
    )
  }
}
