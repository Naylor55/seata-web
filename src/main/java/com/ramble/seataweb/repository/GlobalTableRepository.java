package com.ramble.seataweb.repository;

import com.ramble.seataweb.model.GlobalTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.repository
 * @Class GlobalTableRepository
 * @Date 2021/11/29 16:17
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */


@Repository
public interface GlobalTableRepository extends JpaRepository<GlobalTable, String> {

//    @Query(value = " select * from  ",nativeQuery = true)
//    List<GlobalTable> findByApplicationId(@Param("applicationId") String applicationId);
}
