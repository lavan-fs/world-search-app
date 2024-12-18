package dev.lavan.world.search.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities")
class Cities{
    @Id
Integer id;
    @Column(nullable = false)
String name;
    @Column(nullable = false)
Integer state_id;
    @Column(nullable = false)
String state_code;
    @Column(nullable = false)
Integer country_id;
    @Column(nullable = false)
String country_code;
    @Column(nullable = false)
Float latitude;
    @Column(nullable = false)
Float longitude;
    @Column(nullable = false)
Timestamp created_at;
    @Column(nullable = false)
Timestamp updated_at;
    @Column(nullable = false)
Integer flag;
    @Column(nullable = false)
String wikiDataId;

}