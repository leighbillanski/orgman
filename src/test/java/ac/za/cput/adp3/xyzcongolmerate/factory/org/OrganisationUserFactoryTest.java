package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {
        Organisation org = OrganisationFactory.buildOrganisation("Workpool");
        User user = UserFactory.buildUser("blabla@gmail.com","bla","bla");
        OrganisationUser ou = OrganisationUserFactory.buildOrganisationUser(org.getOrgCode(), user.getUserEmail());
        System.out.println(ou.toString());
        Assert.assertNotNull(ou);
        Assert.assertNotNull(ou.getOrgCode());

    }
}
