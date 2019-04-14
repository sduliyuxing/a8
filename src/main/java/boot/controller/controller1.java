package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title controller1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\11\8 0008 11:11
 */

@Controller
public class controller1 {

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("hello","12345678");
        return "success";
    }
}
