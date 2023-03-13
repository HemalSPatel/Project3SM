package com.example.tuitionmanager.project3sm;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class Project3Controller {
    @FXML
    private RadioButton rb_tristate;
    private RadioButton rb_ny;
    private RadioButton rb_ct;
    private RadioButton rb_intl;
    private RadioButton rb_nonres;
    private RadioButton rb_res;
    private CheckBox cb_studyAbroad;

    @FXML
    protected void onHelloButtonClick() {
        if (rb_res.isSelected()) {
            setResident();
        }

    }

    private void setResident() {
        rb_tristate.setDisable(true);
        rb_ny.setDisable(true);
        rb_ct.setDisable(true);
        rb_intl.setDisable(true);
        cb_studyAbroad.setDisable(true);
        rb_tristate.setSelected(false);
        rb_ny.setSelected(false);
        rb_ct.setSelected(false);
        rb_intl.setSelected(false);
        cb_studyAbroad.setSelected(false);
    }
}