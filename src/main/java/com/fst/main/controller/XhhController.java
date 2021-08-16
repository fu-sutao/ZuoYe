package com.fst.main.controller;

import com.fst.main.domain.Xhh;
import com.fst.main.service.XhhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：fst
 * @data：2021/8/16 15:30
 * @info：
 */

@RestController
@RequestMapping("xhh")
public class XhhController {

    @Autowired
    XhhService xhhService;
    //10	付苏涛	办公室	1	23	2021-03-02	河南省周口市

    @RequestMapping("findById/id")
    public String findById(@PathVariable("id")String id){

        return xhhService.findById(id);
    }
    @RequestMapping("findByTClass/tClass")
    public String findByTClass(@PathVariable("tClass")String tClass){
        return xhhService.findByTClass(tClass);
    }
    @RequestMapping("deleteById/id")
    public String deleteById(@PathVariable("id")String id){
        return xhhService.deleteById(id);
    }
    @RequestMapping("update")
    public String findById(@RequestBody Xhh xhh){
        return xhhService.update(xhh);
    }


}
