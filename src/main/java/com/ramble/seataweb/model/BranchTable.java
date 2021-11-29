package com.ramble.seataweb.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

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

@Table(name = "branch_table")
@Entity
@Data
@Accessors(chain = true)
public class BranchTable implements Serializable {

    @Id
    private Long branchId;

    private String xid;

    private Long transactionId;

    private String resourceGroupId;

    private String resourceId;

    private String branchType;

    private Integer status;

    private String clientId;

    private String applicationData;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;
}
