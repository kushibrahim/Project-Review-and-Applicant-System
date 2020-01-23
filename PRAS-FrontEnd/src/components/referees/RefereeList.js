import React, { Component } from 'react'
import { connect } from "react-redux"
import { bindActionCreators } from "redux"
import * as refereeActions from "../../redux/actions/refereeActions"
import { Table, Button } from "reactstrap"

class RefereeList extends Component {
    componentDidMount() {
        this.props.actions.getReferee()
    }
    render() {
        return (
            <div>
            <Button  color="success" href = "referees/addReferee">Add New Referee</Button>
            <br></br>
            <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Referee Name</th>
                            <th>Referee Mail</th>
                            <th>Referee Phone</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.referee.map(referees => (

                                <tr key={referees.refereeID}>
                                    <th scope="row">{referees.refereeID}</th>
                                    <td>{referees.refereeName}</td>
                                    <td>{referees.refereeMail}</td>
                                    <td>{referees.refereePhone}</td>
                                    <td><Button color="warning" href="/updateReferee">Edit</Button> <Button href="/Delete" color="danger">Delete</Button></td>
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
        referee: state.refereeListReducer
    }
}

function mapDispatchToProps(dispatch) {
    return {
        actions: {
            getReferee: bindActionCreators(refereeActions.getReferees, dispatch)
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(RefereeList)