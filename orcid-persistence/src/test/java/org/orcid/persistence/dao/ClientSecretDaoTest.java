package org.orcid.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.orcid.persistence.jpa.entities.ClientSecretEntity;
import org.orcid.test.DBUnitTest;
import org.orcid.test.OrcidJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(OrcidJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:orcid-persistence-context.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientSecretDaoTest extends DBUnitTest {
    private static String CLIENT_ID = "APP-5555555555555555";
    private static String CLIENT_ID_TWO = "APP-5555555555555556";
    private static String CLIENT_SECRET = "DhkFj5EI0qp6GsUKi55Vja+h+bsaKpBt";
    private static String CONDITION = String.format("(client_details_id = '%1$s' and client_secret = '%2$s') or (client_details_id = '%3$s' and client_secret = '%2$s')", CLIENT_ID, CLIENT_SECRET, CLIENT_ID_TWO);

    @Resource
    ClientSecretDao clientSecretDao;

    @BeforeClass
    public static void initDBUnitData() throws Exception {
        initDBUnitData(Arrays.asList("/data/SourceClientDetailsEntityData.xml", "/data/ProfileEntityData.xml"));
    }

    @AfterClass
    public static void removeDBUnitData() throws Exception {
        removeDBUnitData(Arrays.asList("/data/ProfileEntityData.xml", "/data/SubjectEntityData.xml"));
    }

    @Test
    public void testGetNonPrimaryKeys() {
        List<ClientSecretEntity> nonPrimaryKeys = clientSecretDao.getNonPrimaryKeys();
        assertEquals(nonPrimaryKeys.size(), 2);
        for (ClientSecretEntity secret : nonPrimaryKeys) {           
            assertNotNull(secret.getDateCreated());
            assertNotNull(secret.getLastModified());
            assertEquals(secret.getDateCreated(), secret.getLastModified());
            assertEquals(secret.getClientSecret(), CLIENT_SECRET);
        }
    }

    @Test
    public void testRemoveWithCustomCondition() {
        boolean removeNonPrimaryKeys = clientSecretDao.removeWithCustomCondition(CONDITION);
        assertTrue(removeNonPrimaryKeys);
    }
}
