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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    private String projectName;
    private Date startDate;
    private Date endDate;
    private Enum<EnumProject> status;
    @ManyToOne
    @JoinColumn(name = "contracId")
    private Contract contract;

}
