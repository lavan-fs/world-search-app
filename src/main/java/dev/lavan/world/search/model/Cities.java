package dev.lavan.world.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "cities",schema = "public")
public class Cities {
    @Id
    @JsonProperty("id")
    private Integer id;

    @Column(nullable = false)
    @JsonProperty("name")
    private String name;

    @Column(nullable = false)
    @JsonProperty("state_id")
    private Integer state_id;

    @Column(nullable = false)
    @JsonProperty("state_code")
    private String state_code;

    @Column(nullable = false)
    @JsonProperty("country_id")
    private Integer country_id;

    @Column(nullable = false)
    @JsonProperty("country_code")
    private String country_code;

    @Column(nullable = false)
    @JsonProperty("latitude")
    private Float latitude;

    @Column(nullable = false)
    @JsonProperty("longitude")
    private Float longitude;

    @Column(nullable = false)
    @JsonProperty("created_at")
    private Timestamp created_at;

    @Column(nullable = false)
    @JsonProperty("updated_at")
    private Timestamp updated_at;

    @Column(nullable = false)
    @JsonProperty("flag")
    private Integer flag;

    @Column(nullable = false, name = "wikidataid")
    @JsonProperty("wikidataid")
    private String wikidataid;
}
