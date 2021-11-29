package com.ramble.seataweb.repository;

import com.ramble.seataweb.model.DistributedLock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.repository
 * @Class DistributedLockRepository
 * @Date 2021/11/29 17:13
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */
@Repository
public interface DistributedLockRepository  extends JpaRepository<DistributedLock , String> {
}
