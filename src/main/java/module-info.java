module com.example.tuitionmanager.project3sm {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tuitionmanager.project3sm to javafx.fxml;
    exports com.example.tuitionmanager.project3sm;
}