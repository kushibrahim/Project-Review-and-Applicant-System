import React, { Component } from 'react'
import { Row, Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';

export default class AddProject extends Component {
    render() {
        return (
            <div>
                <Row>
                    <Col sm="12" md={{ size: 6, offset: 3 }}>
                        <Form>
                            <br></br>
                            <h3 className="projectDetail" align="center">New Project Details</h3>
                            <FormGroup row>
                                <Label for="projectTitleText" sm={2}>Title*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="50" type="text" name="text" id="text" placeholder="Project Title" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectSummaryText" sm={2}>Summary*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="500" type="textarea" name="textarea" id="textarea" placeholder="Project Summary" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectKeywordText" sm={2}>Keyword*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="100" type="text" name="keyword" id="keyword" placeholder="Project Keywords" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectDecisionText" sm={2}>Decision*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="10" type="text" name="decision" id="decision" placeholder="Project Decision" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectHypothesisText" sm={2}>Hypothesis</Label>
                                <Col sm={10}>
                                    <Input maxLength="500" type="textarea" name="hypothesis" id="hypothesis" placeholder="Project Hypothesis" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectPurpose" sm={2}>Purpose*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="500" type="textarea" name="purpose" id="purpose" placeholder="Project Purpose" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectMethod" sm={2}>Method*</Label>
                                <Col sm={10}>
                                    <Input required maxLength="500" type="textarea" name="method" id="method" placeholder="Project Method" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectBudget" sm={2}>Budget*</Label>
                                <Col sm={10}>
                                    <Input required type="number" name="budget" id="budget" placeholder="Project Budget" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectImageURL" sm={2}>Image URL</Label>
                                <Col sm={10}>
                                    <Input maxLength="250" type="url" name="imageURL" id="imageURL" placeholder="Project Image URL" />
                                </Col>
                            </FormGroup>
                            <FormGroup row>
                                <Label for="projectDateTime" sm={2}>Create DateTime</Label>
                                <Col sm={10}>
                                    <Input type="date" name="date" id="date" placeholder="Project DateTime" />
                                </Col>
                            </FormGroup>
                            <FormGroup check row>
                                <Col sm="12" md={{ size: 6, offset: 3 }}>
                                    <Button color="success" href="/projects/projectAdd">Add Project</Button>
                                </Col>
                            </FormGroup>
                        </Form>
                    </Col>
                </Row>
            </div>
        )
    }
}
