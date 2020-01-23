import React, { Component } from 'react'
import { Row, Col, Button, Form, FormGroup, Label, Input } from "reactstrap"

export default class UpdateReferee extends Component {
    render() {
        return (
            <div>
            <Row>
            <Col sm="12" md={{ size: 6, offset: 3 }}>
                <Form>
                    <br></br>
                    <h3 className="refereeDetail" align="center">Update Referee Details</h3>
                    <FormGroup row>
                        <Label for="refereeNameText" sm={2}>Name*</Label>
                        <Col sm={10}>
                            <Input required maxLength="40" type="text" name="name" id="name" placeholder="Referee Name" />
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Label for="refereePasswordText" sm={2}>Password*</Label>
                        <Col sm={10}>
                            <Input required maxLength="50" type="password" name="password" id="password" placeholder="Referee User Password" />
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Label for="refereeEmailText" sm={2}>E-mail*</Label>
                        <Col sm={10}>
                            <Input required maxLength="50" type="email" name="email" id="email" placeholder="Referee E-mail Address" />
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Label for="refereePhoneText" sm={2}>Telephone</Label>
                        <Col sm={10}>
                            <Input maxLength="20" type="text" name="phone" id="phone" placeholder="Referee Telephone " />
                        </Col>
                    </FormGroup>
                    <FormGroup check row>
                        <Col sm="12" md={{ size: 6, offset: 3 }}>
                            <Button color="success">Edit Referee</Button>
                        </Col>
                    </FormGroup>
                </Form>
            </Col>
        </Row>
            </div>
        )
    }
}
