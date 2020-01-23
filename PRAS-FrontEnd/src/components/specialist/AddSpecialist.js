import React, { Component } from 'react'
import { Row, Col, Button, Form, FormGroup, Label, Input } from "reactstrap"

export default class AddSpecialist extends Component {
    render() {
        return (
            <div>
                <Row>
                    <Col sm="12" md={{ size: 6, offset: 3 }}>
                        <Form>
                            <br></br>
                            <h3 className="specialistDetail" align="center">New Specialist Details</h3>
                            <FormGroup row>
                                <Label for="specialistNameText" sm={2}>Name*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="40" type="text" name="name" id="name" placeholder="Specialist Name" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="specialistPasswordText" sm={2}>Password*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="50" type="password" name="password" id="password" placeholder="Specialist User Password" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="specialistEmailText" sm={2}>E-mail*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="50" type="email" name="email" id="email" placeholder="Specialist E-mail Address" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="specialistPhoneText" sm={2}>Telephone</Label>
                                <Col sm={10}>
                                    <Input maxLength="20" type="text" name="phone" id="phone" placeholder="Specialist Telephone " />
                                </Col>
                            </FormGroup>
                            <FormGroup check row>
                                <Col sm="12" md={{ size: 6, offset: 3 }}>
                                    <Button color="success" >Add Specialist</Button>
                                </Col>
                            </FormGroup>
                        </Form>
                    </Col>
                </Row>
            </div>
        )
    }
}
