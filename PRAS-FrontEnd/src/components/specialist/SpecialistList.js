import React, { Component } from 'react'
import { connect } from "react-redux"
import { bindActionCreators } from "redux"
import * as specialistActions from "../../redux/actions/specialistActions"
import { Button, Table } from "reactstrap"

class SpecialistList extends Component {
    componentDidMount() {
        this.props.actions.getSpecialists();
    }

    render() {
        return (
            <div>
                <br></br>
                <Button color="success" href="specialists/addSpecialist">Add New Specialist</Button>
                <br></br>
                <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Specialist Name</th>
                            <th>Specialist Mail</th>
                            <th>Specialist Phone</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.specialist.map(specialists => (

                                <tr key={specialists.specialistID}>
                                    <th scope="row">{specialists.specialistID}</th>
                                    <td>{specialists.specialistName}</td>
                                    <td>{specialists.specialistMail}</td>
                                    <td>{specialists.specialistPhone}</td>
                                    <td><Button color="warning" href="/updateSpecialist">Edit</Button> <Button color="danger">Delete</Button></td>
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
        specialist: state.specialistListReducer
    }
}

function mapDispatchToProps(dispatch) {
    return {
        actions: {
            getSpecialists: bindActionCreators(specialistActions.getSpecialists, dispatch)
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(SpecialistList);