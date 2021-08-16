package com.fst.main.service;

import com.alibaba.fastjson.JSON;
import com.fst.main.domain.Xhh;
import com.fst.main.mapper.XhhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 *
 */
@Service
public class XhhService {
    @Autowired
    XhhRepository xhhRepository;

    public String findById(String id) {
        Optional<Xhh> optional = xhhRepository.findById(id);
        if(!optional.isPresent()){
            return "null";
        }
        String ss = JSON.toJSONString(optional.get());
        return ss;
    }

    public String findByTClass(String tClass) {
        Pageable pageable =PageRequest.of(2,3);
        Page<Xhh> xhhs = xhhRepository.findBytClass(tClass, pageable);
        if(xhhs.getSize()==0){
            return "null";
        }
        String ss = JSON.toJSONString(xhhs.getContent());
        return ss;
    }

    public String deleteById(String id) {
        xhhRepository.deleteById(id);
        return "success";
    }

    public String update(Xhh xhh) {
        xhhRepository.deleteById(String.valueOf(xhh.getTid()));
        xhhRepository.save(xhh);
        return "success";
    }
}




