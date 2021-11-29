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
 * @Class GlobalTable
 * @Date 2021/11/29 16:48
 * @Author MingliangChen
 * @Email chen.mingliang@nghinsights.com
 * @Description
 */

@Table(name = "global_table")
@Entity
@Data
@Accessors(chain = true)
public class GlobalTable implements Serializable {

    @Id
    private String xid;

    private Long transactionId;

    private  Integer status;

    private String applicationId;

    private String transactionServiceGroup;

    private String transactionName;

    private  Integer timeout;

    private  Long beginTime;

    private  String applicationData;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;





}
