package com.ramble.seataweb.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Project seata-web
 * @Package com.ramble.seataweb.model
 * @Class BranchTable
 * @Date 2021/11/29 17:19
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */

@Table(name = "lock_table")
@Entity
@Data
@Accessors(chain = true)
public class LockTable implements Serializable {

    @Id
    private Long rowKey;

    private String xid;

    private Long transactionId;

    private String branchId;

    private String resourceId;

    private String tableName;

    private String pk;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;
}
