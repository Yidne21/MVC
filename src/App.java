import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private static Course retriveCourseFromDatabase() {
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Course model = retriveCourseFromDatabase();
        CourseView view = new CourseView();

        CourseController controller = new CourseController(model, view);
        TextField namTextField = new TextField("Enter course name");
        TextField idTextField = new TextField("course id");
        TextField categoryTextField = new TextField("course category");
        Button showButton = new Button("Show my choice");
        Button saveButton = new Button("save");

        showButton.setOnAction((ActionEvent e) -> {
            controller.setCourseName(namTextField);
            controller.setCourseId(idTextField);
            controller.setCourseCategory(categoryTextField);
        });

        Label enteryorchoiceLabel = new Label("Enter your choice");
        BorderPane root1 = new BorderPane();
        root1.setTop(enteryorchoiceLabel);
        root1.setCenter(
                view.printCourseDetails(model.getName(), model.getId(), model.getCategory()));
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(8);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setPrefHeight(400);

        vBox.getChildren().addAll(namTextField, idTextField, categoryTextField, showButton, saveButton);
        root1.setLeft(vBox);
        Scene scene = new Scene(root1, 400, 300);
        stage.setTitle("Choose your course");
        stage.setScene(scene);
        stage.show();
    }
}
