package lesson4;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    public Button btnSent;
    public TextField textSender;
    public TextArea textChat;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("viewWindow.fxml"));

        primaryStage.setTitle("Чатик");
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();

    }

    public void initialize(){
        textChat.setEditable(false);
    }

    public void onPressedEnter(ActionEvent actionEvent) {
        textChat.appendText(textSender.getText());
        textChat.appendText("\n");
        textSender.clear();

    }

    public void onClicked(ActionEvent actionEvent) {
        textChat.appendText(textSender.getText());
        textChat.appendText("\n");
        textSender.clear();
    }
}
