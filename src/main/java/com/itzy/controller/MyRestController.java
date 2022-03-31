package com.itzy.controller;

import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

/**
 * author:DZhY
 * Date:2022/3/30
 * Name:SpringBoot
 */
@RestController
public class MyRestController {
    //学习注解的使用

    //查询id=1001的学生

    /**
     * @GetMapping 相当于@RequestMapping(method = "GET")
     *@PathVariable（路径变量）  :获取url中的数据
     *                  属性：value：路径变量名
     *                  位置： 放在控制器该方法的形参前面
     *      http://localhost:8080/myboot/student/1001
     *
     * {stuId} :定义路径变量  stuId自定义名称
     */

    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId){

        return "查询学生id是："+studentId;
    }
    //提交到gitHub上  (1)
    public String testGit(){
        System.out.println("push到github仓库");
        return "push";
    }

//    创建资源 post请求方式
    @PostMapping("/aadStudent/{stuName}/{stuAge}")
    public String createStudent(@PathVariable("stuName") String stuName,@PathVariable("stuAge") Integer stuAge){

        return "查询学生信息是："+stuName+","+stuAge;
    }
    /**
     * 更新资源
     *
     * 当路径变量名称和 形参名一样  @PathVariable 中的value可以不写
     */
    @PutMapping("/student/{id}/{name}")
    public String updateStudent(@PathVariable Integer id,
                                @PathVariable String name){

        return "更新资源："+id+","+name;
    }

    //删除资源
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return "删除资源：id="+id;
    }

    @PostMapping("student/test")
    public String test(){
        return "student/test请求  使用post请求";
    }

    @PutMapping("student/test")
    public String putTest(){
        return "student/test请求  使用put请求";
    }

}
