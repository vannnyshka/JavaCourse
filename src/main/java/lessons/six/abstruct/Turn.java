package lessons.six.abstruct;

import lessons.six.abstruct.accounts.Individual;
import lessons.six.abstruct.accounts.IndividualEntrepreneur;
import java.math.BigDecimal;

public class Turn {

    public static void main(String[] args) {

        Individual individual = new Individual(new BigDecimal("100.32"), 1111);
        individual.getInformation();
        individual.replacement(new BigDecimal("200"));
        individual.withdraw(new BigDecimal("10000"));
        individual.withdraw(new BigDecimal("50.76"));

//
//        LegalEntity legalEntity = new LegalEntity(new BigDecimal("300.65"), 2121);
//        legalEntity.getInformation();
//        legalEntity.replacement(new BigDecimal("200"));
//        legalEntity.withdraw(new BigDecimal("10000"));
//        legalEntity.withdraw(new BigDecimal("50.76"));



        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur(new BigDecimal("100.32"), 1112);
        individualEntrepreneur.getInformation();
        individualEntrepreneur.replacement(new BigDecimal("200"));
        individualEntrepreneur.replacement(new BigDecimal("1200"));
        individualEntrepreneur.withdraw(new BigDecimal("10000"));
        individualEntrepreneur.withdraw(new BigDecimal("50.76"));

    }
}
