package demo.springboot.hotpot.mixin;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class AuditableDateTime implements Serializable {

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    Date updatedAt;
}
