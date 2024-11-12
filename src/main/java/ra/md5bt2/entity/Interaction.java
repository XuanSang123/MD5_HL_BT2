package ra.md5bt2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer interactionId;
    private Date interactionDate;
    private Enum<EnumProject> interactionType;
    private String totes;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;


}
