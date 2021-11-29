package com.ramble.seataweb.repository;

import com.ramble.seataweb.model.BranchTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.repository
 * @Class BranchTableRepository
 * @Date 2021/11/29 17:25
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */


@Repository
public interface BranchTableRepository extends JpaRepository<BranchTable, Long> {
}
