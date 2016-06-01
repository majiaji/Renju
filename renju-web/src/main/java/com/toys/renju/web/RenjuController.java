package com.toys.renju.web;

import com.toys.renju.service.IRenjuCenter;
import com.toys.renju.service.domain.ActionResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lingyao on 16/5/31.
 */
@Controller
public class RenjuController {
    @Resource
    IRenjuCenter renjuCenter;

    @RequestMapping("/getAllGames")
    @ResponseBody
    public ActionResult<List> getAllGames() {
        ActionResult<List> actionResult = new ActionResult<>();
        actionResult.setSuccessResult(renjuCenter.getGameList());
        return actionResult;
    }
}
