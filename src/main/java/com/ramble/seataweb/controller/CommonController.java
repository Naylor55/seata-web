package com.ramble.seataweb.controller;

import com.ramble.seataweb.model.GlobalTable;
import com.ramble.seataweb.repository.DistributedLockRepository;
import com.ramble.seataweb.repository.GlobalTableRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.controller
 * @Class CommonController
 * @Date 2021/11/29 16:14
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */


@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {


    @GetMapping("/test")
    public String test() {
        return "ok";
    }

    @Autowired
    private GlobalTableRepository globalTableRepository;

    @Autowired
    private DistributedLockRepository  distributedLockRepository;

    @GetMapping("/global")
    public List<GlobalTable> findGlobalTable() {
        List<GlobalTable> list = globalTableRepository.findAll();

        return list;
    }

    @GetMapping("/distributedLock")
    public List<GlobalTable> findDistributedLock() {
        Object list = distributedLockRepository.findAll();

        return null;
    }

    @GetMapping("/global/{applicationId}")
    public List<GlobalTable> findGlobalTableByApplicationId(@PathVariable("applicationId") String applicationId) {
        return null;
    }

}
