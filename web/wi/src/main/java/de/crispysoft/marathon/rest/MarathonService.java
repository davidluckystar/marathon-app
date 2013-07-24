package de.crispysoft.marathon.rest;

import de.crispysoft.marathon.vo.MarathonVO.MarathonVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

/**
 * By: Alexey Matveev
 * Date: 24.07.13
 * Time: 21:04
 *
 * @author Alexey Matveev
 *         © Crispy Soft development labs.
 */
@Controller
@RequestMapping("/marathons")
public class MarathonService {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    Set<MarathonVO> getAllMarathons() {
        Set<MarathonVO> set = new HashSet<MarathonVO>();
        set.add(new MarathonVO(123L));
        set.add(new MarathonVO(53L));
        set.add(new MarathonVO(2633L));
        return set;
    }

}
