import React, { Component } from 'react'
import { Row, Col } from "reactstrap"

class NotFound extends Component {
    render() {
        return (
            <div >
                <Row>
                <Col sm="12" md={{ size: 6, offset: 3 }}><h1>404 NOT FOUND</h1></Col>
                </Row>
            </div>
        )
    }
}

export default NotFound;
