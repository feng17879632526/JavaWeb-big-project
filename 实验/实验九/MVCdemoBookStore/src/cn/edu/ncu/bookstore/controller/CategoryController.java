package cn.edu.ncu.bookstore.controller;


import cn.edu.ncu.bookstore.entity.Category;
import cn.edu.ncu.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/view")
    @ResponseBody
    public List<Category> viewCategory(Model model){
        return categoryService.findAll();
    }
    @RequestMapping(value="/modelview")
    public ModelAndView showCategory(ModelAndView model){
        List<Category> list = categoryService.findAll();
        model.setViewName("main");
        model.addObject("category",list);
        return model;
    }
}
