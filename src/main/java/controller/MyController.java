package controller;

import model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping(value = "/name" )
    public String getName()
    {
        return "John";
    }

    @RequestMapping(value = "/list",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getList()
    {
        List<Person> list=new ArrayList<>();
        Person p1=new Person(1,"John");
        Person p2=new Person(2,"Rock");
        Person p3=new Person(3,"Henry");
        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println("Hi");

        /*List<Integer> list=new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));*/
        return list;
        //return new Person(1,"Navjot");
    }
}
