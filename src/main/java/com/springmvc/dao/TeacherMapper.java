package com.springmvc.dao;

import com.springmvc.dto.teacher.TeacherSearchDto;
import com.springmvc.dto.teacher.TeacherWithTitleMajorCollegeDto;
import com.springmvc.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JinZhiyun
 * @IntefaceName TeacherMapper
 * @Description 教师业务持久层接口
 * @Date 2019/6/14 13:00
 * @Version 1.0
 **/
@Repository
public interface TeacherMapper {
    /**
     * @return java.util.List<com.springmvc.dto.teacher.TeacherWithTitleMajorCollegeDto>
     * @author JinZhiyun
     * @Description 查询所有符合条件的教师及其附带信息
     * @Date 8:24 2019/6/30
     * @Param [teacherSearch]
     **/
    List<TeacherWithTitleMajorCollegeDto> selectAllTeacherInfo(TeacherSearchDto teacherSearch);

    /**
     * @author JinZhiyun
     * @Description 查询用户名对应的教师及其附带信息
     * @Date 12:39 2019/7/7
     * @Param [teaNum]
     * @return com.springmvc.dto.teacher.TeacherWithTitleMajorCollegeDto
     **/
    TeacherWithTitleMajorCollegeDto selectTeacherOwnInfoByNum(@Param("teaNum") String teaNum);

    /**
     * @return com.springmvc.entity.Teacher
     * @author JinZhiyun
     * @Description 查询工号对应的教师
     * @Date 12:32 2019/6/30
     * @Param [teaNum]
     **/
    Teacher selectTeacherByNum(@Param("teaNum") String teaNum);

    /**
     * @return void
     * @author JinZhiyun
     * @Description 修改教师信息
     * @Date 12:57 2019/6/30
     * @Param [teaOriNum, teaWTMC]
     **/
    void updateTeacherInfo(@Param("teaOriNum") String teaOriNum, @Param("teaWTMC") TeacherWithTitleMajorCollegeDto teaWTMC);

    /**
     * @return void
     * @author JinZhiyun
     * @Description 向教师表插入一个教师
     * @Date 16:20 2019/6/30
     * @Param [teaWTMC]
     **/
    void insertTeacher(TeacherWithTitleMajorCollegeDto teaWTMC);

    /**
     * @return void
     * @author JinZhiyun
     * @Description 删除一个学生
     * @Date 16:48 2019/6/30
     * @Param [teaNum]
     **/
    void deleteOneTeacher(@Param("teaNum") String teaNum);

    /**
     * @author JinZhiyun
     * @Description 删除多个教师
     * @Date 18:28 2019/6/30
     * @Param [teaNums]
     * @return void
     **/
    void deleteManyTeachers(List<String> teaNums);
}