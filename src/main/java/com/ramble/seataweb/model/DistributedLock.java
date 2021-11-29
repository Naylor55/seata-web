package com.ramble.seataweb.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.model
 * @Class DistributedLock
 * @Date 2021/11/29 17:12
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */

@Table(name = "distributed_lock")
@Entity
@Data
@Accessors(chain = true)
public class DistributedLock implements Serializable {

    @Id
    private String lockKey;

    private String lockValue;

    private Long expire;
}
