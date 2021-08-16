package com.fst.main.mapper;

import com.fst.main.domain.Xhh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：fst
 * @data：2021/8/16 15:39
 * @info：
 */
public interface XhhRepository extends JpaRepository<Xhh,String> {
    Page<Xhh> findBytClass(String tClass, Pageable pageable);
}
