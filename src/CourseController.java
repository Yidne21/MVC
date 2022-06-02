import javafx.scene.control.TextField;

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    public void setCourseName(TextField name) {
        model.setName(name.getText());
    }

    public String getCourseName() {
        return model.getName();
    }

    public void setCourseId(TextField id) {
        model.setId(id.getText());
    }

    public String getCourseId() {
        return model.getId();
    }

    public void setCourseCategory(TextField category) {
        model.setCategory(category.getText());
    }

    public String getCourseCategory() {
        return model.getCategory();
    }

    public void updateView() {
        view.printCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}