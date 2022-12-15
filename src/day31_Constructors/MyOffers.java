package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();

        offer1.setInfo("VA","Amazon Inc","SDET",110000,true,true,
                true,true);
        offer2.setInfo("CA","Sony Inc","QA",120000,true,false,
                false,true);
        offer3.setInfo("FL","Apple Inc","QE",125000,true,true,
                true,false);
        offer4.setInfo("TX","CapitalOne","SM",125000,false,false,
                true,true);
        offer5.setInfo("WA","Bank Of America","BA",130000,true,true,
                false,true);
        
        Offer[] offers = {offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p-> p.isFullTime == false);
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p-> !p.location.equals("VA"));
        System.out.println("localOffers = " + localOffers.size());

        ArrayList<Offer> noPTOAndBenefit = new ArrayList<>(Arrays.asList(offers));
        noPTOAndBenefit.removeIf(p-> p.hasBenefit == true && p.hasPTO == true);
        System.out.println("doesn't have benefit and PTO offers = " + noPTOAndBenefit.size());

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(offers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers = " + sdetOffers.size());

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary < 100000);
        System.out.println("offersWith100K = " + offersWith100K.size());

    }

}
