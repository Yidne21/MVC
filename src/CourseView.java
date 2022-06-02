import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class CourseView {
    private Label courseNameLabel = new Label();
    private Label CourseId = new Label();
    private Label CourseCategory = new Label();
    private Label courseDetail = new Label();

    public GridPane printCourseDetails(String CourseName, String courseId, String courseCategory) {
        courseDetail.setText("Your Course Detail");
        courseNameLabel.setText(CourseName);
        CourseId.setText(courseId);
        CourseCategory.setText(courseCategory);
        Label name = new Label("Name");
        Label Id = new Label("Course ID");
        Label category = new Label("Course Category");

        GridPane root = new GridPane();

        root.add(courseDetail, 0, 0, 2, 1);
        root.add(name, 0, 1);
        root.add(Id, 0, 2);
        root.add(category, 0, 3);
        root.add(courseNameLabel, 1, 1);
        root.add(CourseId, 1, 2);
        root.add(CourseCategory, 1, 3);

        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.TOP_CENTER);

        return root;
    }
}