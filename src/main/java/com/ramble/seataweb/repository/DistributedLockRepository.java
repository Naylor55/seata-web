package com.ramble.seataweb.repository;

import com.ramble.seataweb.model.DistributedLock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
public interface DistributedLockRepository extends JpaRepository<DistributedLock, String> {

    @Query(value = " select  * from distributed_lock where lock_key= ?1", nativeQuery = true)
    List<DistributedLock> findByLockKey(@Param("lockKey") String lockKey);

    @Query(value = " select  * from distributed_lock where lock_key= :lockKey", nativeQuery = true)
    List<DistributedLock> findByKey(@Param("lockKey") String lockKey);
}
