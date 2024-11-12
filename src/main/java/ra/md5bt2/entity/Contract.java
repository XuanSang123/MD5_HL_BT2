package ra.md5bt2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contracId;
    private Date startDate;
    private Date endDate;
    private Enum<EnumProject> status;
    @Column(precision = 10, scale = 2)
    private BigDecimal contracValue;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;


}
