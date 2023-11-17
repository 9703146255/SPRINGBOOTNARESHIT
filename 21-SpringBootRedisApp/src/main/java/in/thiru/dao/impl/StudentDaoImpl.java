package in.thiru.dao.impl;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import in.thiru.dao.IStudentDao;
import in.thiru.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

    private static final String KEY = "STUDENT";

    @Resource(name = "rt")
    private RedisTemplate<String, Student> redisTemplate;

    private HashOperations<String, Integer, Student> opr;

    @PostConstruct
    private void init() {
        opr = redisTemplate.opsForHash();
    }

    @Override
    public void addStudent(Student s) {
        opr.putIfAbsent(KEY, s.getStdId(), s);
    }

    @Override
    public void modifyStudent(Student s) {
        opr.put(KEY, s.getStdId(), s);
    }

    @Override
    public Student getOneStudent(Integer id) {
        return opr.get(KEY, id);
    }

    @Override
    public Map<Integer, Student> getAllStudents() {
        return opr.entries(KEY);
    }

    @Override
    public void removeStudent(Integer id) {
        opr.delete(KEY, id);
    }
}
