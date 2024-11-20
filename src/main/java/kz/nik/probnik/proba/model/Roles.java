package kz.nik.probnik.proba.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Getter
@Setter

public class Roles extends BaseEntity implements GrantedAuthority {

    private String role;

    @Override
    public String getAuthority() {
        return role;
    }
}
