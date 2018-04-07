package cn.edu.buaa.sms.modular.system.controller;

import cn.edu.buaa.sms.core.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 总览信息
 *
 */
@Controller
@RequestMapping("/blackboard")
public class BlackboardController extends BaseController {

    /**
     * 跳转到黑板
     */
    @RequestMapping("")
    public String blackboard(Model model) {
        model.addAttribute("noticeList", "");
        return "/blackboard.html";
    }
}
