import React, { Component } from 'react'
import { Row, Col } from "reactstrap"
import ProjectList from '../projects/ProjectList'

export default class Dashboard extends Component {
    render() {
        return (
            <div>
                <Row>
                    <Col xs="2">
                        
                    </Col>
                    <Col xs="10">
                        <ProjectList></ProjectList>
                    </Col>
                </Row>
            </div>
        )
    }
}
