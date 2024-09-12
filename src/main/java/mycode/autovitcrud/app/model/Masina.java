package mycode.autovitcrud.app.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import static jakarta.persistence.GenerationType.SEQUENCE;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Table(
        name = "masina",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_marca_model",
                        columnNames = {"marca", "model"}
                )
        }
)
@Entity(name = "Masina")
@ToString
public class Masina {

    @Id
    @SequenceGenerator(
            name = "masina_sequence",
            sequenceName = "masina_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "masina_sequence"
    )

    @Column(
            name = "id"
    )
    private long id;


    @Column(
            name = "marca",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String marca;


    @Column(
            name = "model",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String model;

    @Column(
            name = "an",
            nullable = false,
            columnDefinition = "INT"
    )
    private int an;


    @Column(
            name = "km",
            nullable = false,
            columnDefinition = "INT"
    )
    private int km;

    @Column(
            name = "uzatat",
            nullable = false,
            columnDefinition = "BOOLEAN"
    )
    private boolean uzata;

    @Column(
            name = "pret",
            nullable = false,
            columnDefinition = "DOUBLE"
    )
    private double pret;

}