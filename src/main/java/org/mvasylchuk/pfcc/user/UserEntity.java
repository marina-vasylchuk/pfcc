package org.mvasylchuk.pfcc.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.mvasylchuk.pfcc.common.jpa.Pfcc;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    private static final String ID_GENERATOR_NAME = "user_id_gen";
    private static final String ID_SEQ_NAME = "user_id_seq";
    @Id
    @GeneratedValue(generator = ID_GENERATOR_NAME)
    @SequenceGenerator(name = ID_GENERATOR_NAME, sequenceName = ID_SEQ_NAME)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "preferred_language")
    @Enumerated(value = EnumType.STRING)
    private Language preferredLanguage;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "protein", column = @Column(name = "protein_aim")),
            @AttributeOverride(name = "fat", column = @Column(name = "fat_aim")),
            @AttributeOverride(name = "carbohydrates", column = @Column(name = "carbohydrates_aim")),
            @AttributeOverride(name = "calories", column = @Column(name = "calories_aim"))
    })
    private Pfcc aims;
    @Column(name = "profile_configured")
    private Boolean profileConfigured;
    @Column(name = "email_confirmed")
    private Boolean emailConfirmed;
}