package team.miaomiao.iplan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ycl on 2017/5/29.
 */
@Controller
public class Controller1 {
    @RequestMapping("/login")
    public ModelAndView showView() {
        ModelAndView modelAndView = new ModelAndView("/login.jsp");
        return modelAndView;
    }
}
