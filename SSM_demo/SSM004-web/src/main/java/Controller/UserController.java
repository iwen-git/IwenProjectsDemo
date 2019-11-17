package Controller;
import com.iwen.User;
import com.iwen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @PackageName Controller
 * @ClassName UserController
 * @Description: TODO
 * @Author iwen(朱清波)
 * @Date 2019/11/16 21:08
 * @Version V1.0
 **/
@Controller
@RequestMapping("user")

public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("Hello");
        return null;
    }

    @RequestMapping("find")
    public ModelAndView find(@RequestParam(value = "id",required =true,defaultValue ="1") Integer id){
        ModelAndView mv = new ModelAndView("font/user");
        User user = userService.findById(id);
        mv.addObject("user", user);
        return mv;
    }
}
