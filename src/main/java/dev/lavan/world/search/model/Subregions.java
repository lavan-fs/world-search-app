package dev.lavan.world.search.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subregions",schema = "public")
public class Subregions {

    @Id
    Integer id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String translations;



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
    @JoinColumn(name="region_id",referencedColumnName = "id")
    Regions regions;


}
