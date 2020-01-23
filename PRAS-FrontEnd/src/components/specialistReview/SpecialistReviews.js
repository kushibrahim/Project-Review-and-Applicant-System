import React, { Component } from 'react'
import { connect } from "react-redux"
import * as specialistReviewActions from "../../redux/actions/specialistReviewActions"
import { bindActionCreators } from "redux"
import { Table, Button } from "reactstrap"

class SpecialistReviews extends Component {
    componentDidMount() {
        this.props.actions.getSpecialistReview()
    }

    render() {
        return (
            <div>
                <Button color="success">Add New Review</Button>
                <br></br>
                <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Specialist Review Summary</th>
                            <th>Specialist Review Decision</th>
                            <th>Specialist Review DateTime</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.specialistReview.map(specialistReviews => (

                                <tr key={specialistReviews.specialistReviewID}>
                                    <th scope="row">{specialistReviews.specialistReviewID}</th>
                                    <td>{specialistReviews.specialistReviewSummary}</td>
                                    <td>{specialistReviews.specialistReviewDecision}</td>
                                    <td>{specialistReviews.specialistReviewDatetime}</td>
                                    <td><Button color="warning">Edit</Button> <Button color="danger">Delete</Button></td>
                                </tr>
                            ))
                        }
                    </tbody>
                </Table>
            </div>
        )
    }
}

function mapStateToProps(state) {
    return {
        specialistReview: state.specialistReviewReducer
    }
}

function mapDispatchToProps(dispatch) {
    return {
        actions: {
            getSpecialistReview: bindActionCreators(specialistReviewActions.getSpecialistReviews, dispatch)
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(SpecialistReviews)
