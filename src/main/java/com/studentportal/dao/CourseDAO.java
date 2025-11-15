package com.studentportal.dao;


import com.studentportal.HibernateUtil;
import com.studentportal.model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class CourseDAO {

    public void saveCourse(Course course) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.saveOrUpdate(course);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public List<Course> getAllCourses() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Course", Course.class).list();
        }
    }
}
