package com.studentportal.bean;

import com.studentportal.dao.StudentDAO;
import com.studentportal.model.Student;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("studentBean")
@SessionScoped
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Student student = new Student();
    private transient StudentDAO dao = new StudentDAO();

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public String saveStudent() {
        try {
            dao.save(student);
            student = new Student(); // reset
            return "confirmation.xhtml?faces-redirect=true";
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Error saving student: " + e.getMessage(), null));
            return null;
        }
    }

    public List<Student> getAllStudents() {
        return dao.listAll();
    }

    public String deleteStudent(int id) {
        dao.delete(id);
        return "dashboard.xhtml?faces-redirect=true";
    }

    public String editStudent(Student s) {
        this.student = s;
        return "editStudent.xhtml?faces-redirect=true";
    }

    public String updateStudent() {
        try {
            dao.update(student);
            student = new Student(); // reset after update
            return "dashboard.xhtml?faces-redirect=true";
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Error updating student: " + e.getMessage(), null));
            return null;
        }
    }
}
