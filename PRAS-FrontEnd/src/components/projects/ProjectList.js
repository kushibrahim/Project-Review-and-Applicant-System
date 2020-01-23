import React, { Component } from 'react'
import { connect } from 'react-redux'
import { bindActionCreators } from "redux"
import * as projectActions from "../../redux/actions/projectActions"
import { Table, Button} from 'reactstrap';

class ProjectList extends Component {
    componentDidMount() {
        this.props.actions.getProjects()
    }
    render() {
        return (
            <div>
            <br></br>
            <Button color="success" href="/projects/addProject">Add New Project</Button>
            <br></br>
            <br></br>
                <Table bordered>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Project Title</th>
                            <th>Project Summary</th>
                            <th>Project Keyword</th>
                            <th>Project Decision</th>
                            <th>Project Hypothesis</th>
                            <th>Project Purpose</th>
                            <th>Project Method</th>
                            <th>Project Budget</th>
                            <th>Project Create Datetime</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.props.project.map(projects => (
                                
                                <tr key={projects.projectID}>
                                    <th scope="row">{projects.projectID}</th>
                                    <td>{projects.projectTitle}</td>
                                    <td>{projects.projectSummary}</td>
                                    <td>{projects.projectKeyword}</td>
                                    <td>{projects.projectDecision}</td>
                                    <td>{projects.projectHypothesis}</td>
                                    <td>{projects.projectPurpose}</td>
                                    <td>{projects.projectMethod}</td>
                                    <td>{projects.projectBudget}.00₺</td>
                                    <td>{projects.projectCreateDatetime}</td>
                                    <td><Button color="warning" href="/Update">Edit</Button><hr></hr> 
                                    <Button href="/Delete" color="danger">Delete</Button></td>

                                </tr>
                            ))
                        }
                    </tbody>
                </Table>
            </div>
        )
    }
}

function mapDispatchToProps(dispatch) {
    return {
        actions: {
            getProjects: bindActionCreators(projectActions.getProjects, dispatch)
        }
    }
}

function mapStateToProps(state) {
    return {
        project: state.projectListReducer
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(ProjectList);