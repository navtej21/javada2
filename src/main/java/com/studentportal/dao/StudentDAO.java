package com.studentportal.dao;


import com.studentportal.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

    public void saveStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUgetSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.saveOrUpdate(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
