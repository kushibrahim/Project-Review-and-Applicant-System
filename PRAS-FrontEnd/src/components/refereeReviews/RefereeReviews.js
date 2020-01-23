import React, { Component } from 'react'
import {connect} from "react-redux"
import * as refereeReviewActions from "../../redux/actions/refereeReviewActions" 
import {bindActionCreators} from "redux"
import {Table,Button} from "reactstrap"

class RefereeReviews extends Component {
    componentDidMount() {
        this.props.actions.getRefereeReview()
    }
    
    render() {
        return (
            <div>
            <Button  color="success">Add New Review</Button>
            <br></br>
            <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Referee Review Summary</th>
                            <th>Referee Review Decision</th>
                            <th>Referee Review DateTime</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.refereeReview.map(refereeReviews => (

                                <tr key={refereeReviews.refereeReviewID}>
                                    <th scope="row">{refereeReviews.refereeReviewID}</th>
                                    <td>{refereeReviews.refereeReviewSummary}</td>
                                    <td>{refereeReviews.refereeReviewDecision}</td>
                                    <td>{refereeReviews.refereeReviewDatetime}</td>
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

function mapStateToProps(state){
    return {
        refereeReview: state.refereeReviewReducer
    }
}

function mapDispatchToProps(dispacth){
    return{
        actions:{
            getRefereeReview: bindActionCreators(refereeReviewActions.getRefereeReviews, dispacth)
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(RefereeReviews)