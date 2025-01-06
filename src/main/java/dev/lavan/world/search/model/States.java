package dev.lavan.world.search.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "states",schema = "public")
public class States {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    String name;


    @Column(nullable = false)
    String country_code;
    @Column(nullable = false)
    String flips_code;
    @Column(nullable = false)
    String iso2;
    @Column(nullable = false)
    String type;
    @Column(nullable = false)
    BigDecimal latitude;
    @Column(nullable = false)
    BigDecimal longitude;
    @Column(nullable = false)
    @CreationTimestamp
    Timestamp created_at;
    @Column(nullable = false)
    @UpdateTimestamp
    Timestamp updated_at;
    @Column(nullable = false)
    Integer flag;
    @Column(nullable = false,name = "wikidataid")

    String wikidataid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id",referencedColumnName = "id")
    Countries country;

}
