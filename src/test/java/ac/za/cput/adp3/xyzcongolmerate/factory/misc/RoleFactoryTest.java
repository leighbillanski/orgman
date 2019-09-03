package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole("Developer");
        System.out.println(role.toString());
        Assert.assertNotNull(role);
        Assert.assertNotNull(role.getRoleId());

    }
}
