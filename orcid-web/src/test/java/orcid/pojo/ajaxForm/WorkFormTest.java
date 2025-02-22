package orcid.pojo.ajaxForm;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.Test;
import org.orcid.jaxb.model.common.CitationType;
import org.orcid.jaxb.model.common.ContributorRole;
import org.orcid.jaxb.model.common.Iso3166Country;
import org.orcid.jaxb.model.common.Relationship;
import org.orcid.jaxb.model.common.SequenceType;
import org.orcid.jaxb.model.common.WorkType;
import org.orcid.jaxb.model.record_rc1.WorkExternalIdentifierType;
import org.orcid.jaxb.model.v3.release.common.ContributorAttributes;
import org.orcid.jaxb.model.v3.release.common.ContributorOrcid;
import org.orcid.jaxb.model.v3.release.common.Country;
import org.orcid.jaxb.model.v3.release.common.CreatedDate;
import org.orcid.jaxb.model.v3.release.common.CreditName;
import org.orcid.jaxb.model.v3.release.common.Day;
import org.orcid.jaxb.model.v3.release.common.Month;
import org.orcid.jaxb.model.v3.release.common.PublicationDate;
import org.orcid.jaxb.model.v3.release.common.Subtitle;
import org.orcid.jaxb.model.v3.release.common.Title;
import org.orcid.jaxb.model.v3.release.common.TranslatedTitle;
import org.orcid.jaxb.model.v3.release.common.Url;
import org.orcid.jaxb.model.v3.release.common.Year;
import org.orcid.jaxb.model.v3.release.record.ExternalID;
import org.orcid.jaxb.model.v3.release.record.ExternalIDs;
import org.orcid.jaxb.model.v3.release.record.Work;
import org.orcid.jaxb.model.v3.release.record.WorkContributors;
import org.orcid.jaxb.model.v3.release.record.WorkTitle;
import org.orcid.pojo.ajaxForm.Text;
import org.orcid.pojo.ajaxForm.WorkForm;
import org.orcid.utils.DateUtils;

public class WorkFormTest extends XMLTestCase {

    private int maxContributorsForUI = 50;

    @Test
    public void testValueOfAndBack() throws Exception {  
        Work work = getWork();
        WorkForm workForm = WorkForm.valueOf(work, maxContributorsForUI);
        Work backToWork = workForm.toWork();        
        assertEquals(work, backToWork);        
    }
    
    @Test
    public void testSerializeWork() throws Exception {
        Work work = getWork();
        WorkForm workForm =  WorkForm.valueOf(work, maxContributorsForUI);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(workForm);
    }
    
    @Test
    public void testEmptyTranslatedTitleDontGetIntoTheWork() {
        WorkForm form = new WorkForm();
        form.setTitle(Text.valueOf("The title"));
        org.orcid.pojo.ajaxForm.TranslatedTitleForm translatedTitle = new org.orcid.pojo.ajaxForm.TranslatedTitleForm();
        
        //Test with empty values
        translatedTitle.setContent(" ");
        translatedTitle.setLanguageCode(" ");
        form.setTranslatedTitle(translatedTitle);
        
        Work work = form.toWork();
        assertNotNull(work);
        assertNotNull(work.getWorkTitle());
        assertNotNull(work.getWorkTitle().getTitle());
        assertEquals("The title", work.getWorkTitle().getTitle().getContent());
        assertNull(work.getWorkTitle().getTranslatedTitle());
        
        //Test with empty content
        translatedTitle.setContent(" ");        
        translatedTitle.setLanguageCode("en");
        form.setTranslatedTitle(translatedTitle);
        
        work = form.toWork();
        assertNotNull(work);
        assertNotNull(work.getWorkTitle());
        assertNotNull(work.getWorkTitle().getTitle());
        assertEquals("The title", work.getWorkTitle().getTitle().getContent());
        assertNull(work.getWorkTitle().getTranslatedTitle());
        
        //Test with empty strings
        translatedTitle.setContent("");
        translatedTitle.setLanguageCode("");
        form.setTranslatedTitle(translatedTitle);
        
        work = form.toWork();
        assertNotNull(work);
        assertNotNull(work.getWorkTitle());
        assertNotNull(work.getWorkTitle().getTitle());
        assertEquals("The title", work.getWorkTitle().getTitle().getContent());
        assertNull(work.getWorkTitle().getTranslatedTitle());
        
        //Test with null values
        translatedTitle.setContent(null);
        translatedTitle.setLanguageCode(null);
        form.setTranslatedTitle(translatedTitle);
        
        work = form.toWork();
        assertNotNull(work);
        assertNotNull(work.getWorkTitle());
        assertNotNull(work.getWorkTitle().getTitle());
        assertEquals("The title", work.getWorkTitle().getTitle().getContent());
        assertNull(work.getWorkTitle().getTranslatedTitle());
        
        //Test with a both values
        translatedTitle.setContent("Translated title");
        translatedTitle.setLanguageCode("en");
        form.setTranslatedTitle(translatedTitle);
        
        work = form.toWork();
        assertNotNull(work);
        assertNotNull(work.getWorkTitle());
        assertNotNull(work.getWorkTitle().getTitle());
        assertEquals("The title", work.getWorkTitle().getTitle().getContent());
        assertNotNull(work.getWorkTitle().getTranslatedTitle());
        assertEquals("Translated title", work.getWorkTitle().getTranslatedTitle().getContent());
        assertEquals("en", work.getWorkTitle().getTranslatedTitle().getLanguageCode());
    }

    public static Work getWork() {
        Work work = new Work();
        work.setCountry(new Country(Iso3166Country.US));        
        Date date = new Date();                        
        work.setCreatedDate(new CreatedDate(DateUtils.convertToXMLGregorianCalendar(date)));
        work.setJournalTitle(new Title("Journal Title"));
        work.setLanguageCode("en");
        work.setPublicationDate(new PublicationDate(new Year(2015), new Month(1), new Day(1)));
        work.setPutCode(Long.valueOf("12345"));
        work.setShortDescription("Short description");
        work.setUrl(new Url("http://test.com"));
        work.setVisibility(org.orcid.jaxb.model.v3.release.common.Visibility.LIMITED);
        work.setWorkCitation(new org.orcid.jaxb.model.v3.release.record.Citation("Citation", CitationType.BIBTEX));
        WorkContributors contributors = new WorkContributors();
        org.orcid.jaxb.model.v3.release.common.Contributor contributor = new org.orcid.jaxb.model.v3.release.common.Contributor();
        contributor.setCreditName(new CreditName("Credit name"));
        contributor.setContributorOrcid(new ContributorOrcid("0000-0000-0000-0000"));
        ContributorAttributes att = new ContributorAttributes();
        att.setContributorRole(ContributorRole.ASSIGNEE.value());
        att.setContributorSequence(SequenceType.FIRST);
        contributor.setContributorAttributes(att);
        contributors.getContributor().add(contributor);
        work.setWorkContributors(contributors);        
        ExternalIDs weis = new ExternalIDs();
        ExternalID wei = new ExternalID();
        wei.setRelationship(Relationship.SELF);
        wei.setUrl(new Url("http://test.com"));
        wei.setValue("ID");
        wei.setType(WorkExternalIdentifierType.AGR.value());
        weis.getExternalIdentifier().add(wei);
        work.setWorkExternalIdentifiers(weis);        
        WorkTitle workTitle = new WorkTitle();
        workTitle.setTitle(new Title("Work Title"));
        workTitle.setSubtitle(new Subtitle("Subtitle"));
        TranslatedTitle translated = new TranslatedTitle("Translated", "en");
        workTitle.setTranslatedTitle(translated);
        work.setWorkTitle(workTitle);
        work.setWorkType(WorkType.ARTISTIC_PERFORMANCE);
        return work;
    }
}
