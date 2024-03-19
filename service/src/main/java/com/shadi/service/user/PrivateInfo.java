package com.shadi.service.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrivateInfo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   private int monthlyIncome;
    private int sizeOfHouse;
   private String financialStatus;
   private String residentialStatus;
   private String secComicStatus;
   private String familySystem;
   private boolean doLiveJoinFamily;
   private Boolean willJoinFamily;
   private String familyStructure;
    private boolean parentsAlive;
   private int numberOfBrothers;
   private int numberOfSister;
   private int numberOfBrotherMariAge;
   private int numberOfSisterMariAge;
   private boolean doYouLiveWithParents;

   @JsonIgnore
   @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   @JoinColumn(name = "user_id")
   private User user;
}
