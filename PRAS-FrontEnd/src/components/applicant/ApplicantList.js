import React, { Component } from 'react'
import { connect } from "react-redux"
import * as applicantActions from "../../redux/actions/applicantActions"
import { bindActionCreators } from 'redux'
import {Table, Button} from "reactstrap"


class ApplicantList extends Component {
    componentDidMount() {
        this.props.actions.getApplicant()
    }
    
    render() {
        return (
            <div>
            <br></br>
            <Button  color="success" href = "applicants/addApplicant">Add New Applicant</Button>
            <br></br>
            <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Applicant Name</th>
                            <th>Applicant Mail</th>
                            <th>Applicant Phone</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.applicant.map(applicants => (

                                <tr key={applicants.applicantID}>
                                    <th scope="row">{applicants.applicantID}</th>
                                    <td>{applicants.applicantName}</td>
                                    <td>{applicants.applicantMail}</td>
                                    <td>{applicants.applicantPhone}</td>
                                    <td><Button color="warning" href="/updateApplicant">Edit</Button> <Button href="/deleteApplicant" color="danger">Delete</Button></td>
                                </tr>
                            ))
                        }
                    </tbody>
                </Table>
            </div>
        )
    }
}

function mapStateToProps(state){
    return {
        applicant: state.applicantListReducer
    }
}
function mapDispacthToProps(dispatch){
    return {
        actions:{
            getApplicant: bindActionCreators(applicantActions.getApplicants, dispatch)
        }
    }
}

export default connect(mapStateToProps, mapDispacthToProps)(ApplicantList)