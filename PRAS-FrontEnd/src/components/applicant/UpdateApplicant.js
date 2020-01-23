import React, { Component } from 'react'
import { Row, Col, Button, Form, FormGroup, Label, Input } from "reactstrap"

export default class UpdateApplicant extends Component {
    render() {
        return (
            <div>
                <Row>
                    <Col sm="12" md={{ size: 6, offset: 3 }}>
                        <Form>
                            <br></br>
                            <h3 className="applicantDetail" align="center">Update Applicant Details</h3>
                            <FormGroup row>
                                <Label for="applicantNameText" sm={2}>Name*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="40" type="text" name="name" id="name" placeholder="Applicant Name" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="applicantPasswordText" sm={2}>Password*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="50" type="password" name="password" id="password" placeholder="Applicant User Password" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="applicantEmailText" sm={2}>E-mail*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="50" type="email" name="email" id="email" placeholder="Applicant E-mail Address" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="applicantPhoneText" sm={2}>Telephone</Label>
                                <Col sm={10}>
                                    <Input maxLength="20" type="text" name="phone" id="phone" placeholder="Applicant Telephone " />
                                </Col>
                            </FormGroup>
                            <FormGroup check row>
                                <Col sm="12" md={{ size: 6, offset: 3 }}>
                                    <Button type="submit" color="warning" >Edit Applicant</Button>
                                </Col>
                            </FormGroup>
                        </Form>
                    </Col>
                </Row>
            </div>
        )
    }
}
