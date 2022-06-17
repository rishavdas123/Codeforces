module com.example.codeforces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codeforces to javafx.fxml;
    exports com.example.codeforces;
}