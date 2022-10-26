module com.example.operadores {
    requires javafx.controls;
    requires javafx.fxml;


    //opens com.example.operadores to javafx.fxml;
    //exports com.example.operadores;
    exports com.example.operadores.metodo;
    opens com.example.operadores.metodo to javafx.fxml;
}