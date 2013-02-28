/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.01 at 04:40:47 PM GMT 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.orcid.jaxb.model.message package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AffiliationType_QNAME = new QName("http://www.orcid.org/ns/orcid", "affiliation-type");
    private final static QName _CreationMethod_QNAME = new QName("http://www.orcid.org/ns/orcid", "creation-method");
    private final static QName _ContributorSequence_QNAME = new QName("http://www.orcid.org/ns/orcid", "contributor-sequence");
    private final static QName _ShortDescription_QNAME = new QName("http://www.orcid.org/ns/orcid", "short-description");
    private final static QName _MessageVersion_QNAME = new QName("http://www.orcid.org/ns/orcid", "message-version");
    private final static QName _WorkExternalIdentifierType_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-external-identifier-type");
    private final static QName _WorkCitation_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-citation");
    private final static QName _WorkType_QNAME = new QName("http://www.orcid.org/ns/orcid", "work-type");
    private final static QName _ContributorRole_QNAME = new QName("http://www.orcid.org/ns/orcid", "contributor-role");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.orcid.jaxb.model.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApprovalDate }
     * 
     */
    public ApprovalDate createApprovalDate() {
        return new ApprovalDate();
    }

    /**
     * Create an instance of {@link Claimed }
     * 
     */
    public Claimed createClaimed() {
        return new Claimed();
    }

    /**
     * Create an instance of {@link ApplicationSummary }
     * 
     */
    public ApplicationSummary createApplicationSummary() {
        return new ApplicationSummary();
    }

    /**
     * Create an instance of {@link RoleTitle }
     * 
     */
    public RoleTitle createRoleTitle() {
        return new RoleTitle();
    }

    /**
     * Create an instance of {@link ApplicationWebsite }
     * 
     */
    public ApplicationWebsite createApplicationWebsite() {
        return new ApplicationWebsite();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link Month }
     * 
     */
    public Month createMonth() {
        return new Month();
    }

    /**
     * Create an instance of {@link OrcidInternal }
     * 
     */
    public OrcidInternal createOrcidInternal() {
        return new OrcidInternal();
    }

    /**
     * Create an instance of {@link GrantExternalProgram }
     * 
     */
    public GrantExternalProgram createGrantExternalProgram() {
        return new GrantExternalProgram();
    }

    /**
     * Create an instance of {@link StartDate }
     * 
     */
    public StartDate createStartDate() {
        return new StartDate();
    }

    /**
     * Create an instance of {@link ResearcherUrls }
     * 
     */
    public ResearcherUrls createResearcherUrls() {
        return new ResearcherUrls();
    }

    /**
     * Create an instance of {@link SourceOrcid }
     * 
     */
    public SourceOrcid createSourceOrcid() {
        return new SourceOrcid();
    }

    /**
     * Create an instance of {@link PublicationDate }
     * 
     */
    public PublicationDate createPublicationDate() {
        return new PublicationDate();
    }

    /**
     * Create an instance of {@link EncryptedPassword }
     * 
     */
    public EncryptedPassword createEncryptedPassword() {
        return new EncryptedPassword();
    }

    /**
     * Create an instance of {@link AssigneeOrcid }
     * 
     */
    public AssigneeOrcid createAssigneeOrcid() {
        return new AssigneeOrcid();
    }

    /**
     * Create an instance of {@link OrcidBio }
     * 
     */
    public OrcidBio createOrcidBio() {
        return new OrcidBio();
    }

    /**
     * Create an instance of {@link OrcidActivities }
     * 
     */
    public OrcidActivities createOrcidActivities() {
        return new OrcidActivities();
    }

    /**
     * Create an instance of {@link ScopePaths }
     * 
     */
    public ScopePaths createScopePaths() {
        return new ScopePaths();
    }

    /**
     * Create an instance of {@link Affiliations }
     * 
     */
    public Affiliations createAffiliations() {
        return new Affiliations();
    }

    /**
     * Create an instance of {@link GrantDate }
     * 
     */
    public GrantDate createGrantDate() {
        return new GrantDate();
    }

    /**
     * Create an instance of {@link ExternalIdCommonName }
     * 
     */
    public ExternalIdCommonName createExternalIdCommonName() {
        return new ExternalIdCommonName();
    }

    /**
     * Create an instance of {@link SourceReference }
     * 
     */
    public SourceReference createSourceReference() {
        return new SourceReference();
    }

    /**
     * Create an instance of {@link FamilyName }
     * 
     */
    public FamilyName createFamilyName() {
        return new FamilyName();
    }

    /**
     * Create an instance of {@link Preferences }
     * 
     */
    public Preferences createPreferences() {
        return new Preferences();
    }

    /**
     * Create an instance of {@link SendChangeNotifications }
     * 
     */
    public SendChangeNotifications createSendChangeNotifications() {
        return new SendChangeNotifications();
    }

    /**
     * Create an instance of {@link WorkExternalIdentifiers }
     * 
     */
    public WorkExternalIdentifiers createWorkExternalIdentifiers() {
        return new WorkExternalIdentifiers();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link GrantContributors }
     * 
     */
    public GrantContributors createGrantContributors() {
        return new GrantContributors();
    }

    /**
     * Create an instance of {@link OrcidSearchResults }
     * 
     */
    public OrcidSearchResults createOrcidSearchResults() {
        return new OrcidSearchResults();
    }

    /**
     * Create an instance of {@link ScopePath }
     * 
     */
    public ScopePath createScopePath() {
        return new ScopePath();
    }

    /**
     * Create an instance of {@link WorkSources }
     * 
     */
    public WorkSources createWorkSources() {
        return new WorkSources();
    }

    /**
     * Create an instance of {@link AgencyName }
     * 
     */
    public AgencyName createAgencyName() {
        return new AgencyName();
    }

    /**
     * Create an instance of {@link GrantExternalId }
     * 
     */
    public GrantExternalId createGrantExternalId() {
        return new GrantExternalId();
    }

    /**
     * Create an instance of {@link ErrorDesc }
     * 
     */
    public ErrorDesc createErrorDesc() {
        return new ErrorDesc();
    }

    /**
     * Create an instance of {@link ExternalIdUrl }
     * 
     */
    public ExternalIdUrl createExternalIdUrl() {
        return new ExternalIdUrl();
    }

    /**
     * Create an instance of {@link OrcidMessage }
     * 
     */
    public OrcidMessage createOrcidMessage() {
        return new OrcidMessage();
    }

    /**
     * Create an instance of {@link EndDate }
     * 
     */
    public EndDate createEndDate() {
        return new EndDate();
    }

    /**
     * Create an instance of {@link OtherName }
     * 
     */
    public OtherName createOtherName() {
        return new OtherName();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link PatentIssueDate }
     * 
     */
    public PatentIssueDate createPatentIssueDate() {
        return new PatentIssueDate();
    }

    /**
     * Create an instance of {@link DelegateSummary }
     * 
     */
    public DelegateSummary createDelegateSummary() {
        return new DelegateSummary();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link Contributor }
     * 
     */
    public Contributor createContributor() {
        return new Contributor();
    }

    /**
     * Create an instance of {@link ExternalIdentifier }
     * 
     */
    public ExternalIdentifier createExternalIdentifier() {
        return new ExternalIdentifier();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link DeactivationDate }
     * 
     */
    public DeactivationDate createDeactivationDate() {
        return new DeactivationDate();
    }

    /**
     * Create an instance of {@link OrcidPatent }
     * 
     */
    public OrcidPatent createOrcidPatent() {
        return new OrcidPatent();
    }

    /**
     * Create an instance of {@link ContributorOrcid }
     * 
     */
    public ContributorOrcid createContributorOrcid() {
        return new ContributorOrcid();
    }

    /**
     * Create an instance of {@link GrantExternalIdentifier }
     * 
     */
    public GrantExternalIdentifier createGrantExternalIdentifier() {
        return new GrantExternalIdentifier();
    }

    /**
     * Create an instance of {@link ContributorEmail }
     * 
     */
    public ContributorEmail createContributorEmail() {
        return new ContributorEmail();
    }

    /**
     * Create an instance of {@link ApplicationName }
     * 
     */
    public ApplicationName createApplicationName() {
        return new ApplicationName();
    }

    /**
     * Create an instance of {@link Assignee }
     * 
     */
    public Assignee createAssignee() {
        return new Assignee();
    }

    /**
     * Create an instance of {@link ApplicationOrcid }
     * 
     */
    public ApplicationOrcid createApplicationOrcid() {
        return new ApplicationOrcid();
    }

    /**
     * Create an instance of {@link DelegationDetails }
     * 
     */
    public DelegationDetails createDelegationDetails() {
        return new DelegationDetails();
    }

    /**
     * Create an instance of {@link SendOrcidNews }
     * 
     */
    public SendOrcidNews createSendOrcidNews() {
        return new SendOrcidNews();
    }

    /**
     * Create an instance of {@link GrantSources }
     * 
     */
    public GrantSources createGrantSources() {
        return new GrantSources();
    }

    /**
     * Create an instance of {@link ContributorAttributes }
     * 
     */
    public ContributorAttributes createContributorAttributes() {
        return new ContributorAttributes();
    }

    /**
     * Create an instance of {@link Orcid }
     * 
     */
    public Orcid createOrcid() {
        return new Orcid();
    }

    /**
     * Create an instance of {@link OrcidWork }
     * 
     */
    public OrcidWork createOrcidWork() {
        return new OrcidWork();
    }

    /**
     * Create an instance of {@link GivenNames }
     * 
     */
    public GivenNames createGivenNames() {
        return new GivenNames();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Keywords }
     * 
     */
    public Keywords createKeywords() {
        return new Keywords();
    }

    /**
     * Create an instance of {@link SourceDate }
     * 
     */
    public SourceDate createSourceDate() {
        return new SourceDate();
    }

    /**
     * Create an instance of {@link WorkTitle }
     * 
     */
    public WorkTitle createWorkTitle() {
        return new WorkTitle();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link GivenPermissionTo }
     * 
     */
    public GivenPermissionTo createGivenPermissionTo() {
        return new GivenPermissionTo();
    }

    /**
     * Create an instance of {@link SecurityDetails }
     * 
     */
    public SecurityDetails createSecurityDetails() {
        return new SecurityDetails();
    }

    /**
     * Create an instance of {@link OrcidPatents }
     * 
     */
    public OrcidPatents createOrcidPatents() {
        return new OrcidPatents();
    }

    /**
     * Create an instance of {@link WorkExternalIdentifier }
     * 
     */
    public WorkExternalIdentifier createWorkExternalIdentifier() {
        return new WorkExternalIdentifier();
    }

    /**
     * Create an instance of {@link AgencyOrcid }
     * 
     */
    public AgencyOrcid createAgencyOrcid() {
        return new AgencyOrcid();
    }

    /**
     * Create an instance of {@link ExternalIdOrcid }
     * 
     */
    public ExternalIdOrcid createExternalIdOrcid() {
        return new ExternalIdOrcid();
    }

    /**
     * Create an instance of {@link OrcidSearchResult }
     * 
     */
    public OrcidSearchResult createOrcidSearchResult() {
        return new OrcidSearchResult();
    }

    /**
     * Create an instance of {@link AlternativeEmail }
     * 
     */
    public AlternativeEmail createAlternativeEmail() {
        return new AlternativeEmail();
    }

    /**
     * Create an instance of {@link WorkExternalIdentifierId }
     * 
     */
    public WorkExternalIdentifierId createWorkExternalIdentifierId() {
        return new WorkExternalIdentifierId();
    }

    /**
     * Create an instance of {@link Url }
     * 
     */
    public Url createUrl() {
        return new Url();
    }

    /**
     * Create an instance of {@link AssigneeName }
     * 
     */
    public AssigneeName createAssigneeName() {
        return new AssigneeName();
    }

    /**
     * Create an instance of {@link OrcidProfile }
     * 
     */
    public OrcidProfile createOrcidProfile() {
        return new OrcidProfile();
    }

    /**
     * Create an instance of {@link PersonalDetails }
     * 
     */
    public PersonalDetails createPersonalDetails() {
        return new PersonalDetails();
    }

    /**
     * Create an instance of {@link OrcidGrants }
     * 
     */
    public OrcidGrants createOrcidGrants() {
        return new OrcidGrants();
    }

    /**
     * Create an instance of {@link OrcidWorks }
     * 
     */
    public OrcidWorks createOrcidWorks() {
        return new OrcidWorks();
    }

    /**
     * Create an instance of {@link Citation }
     * 
     */
    public Citation createCitation() {
        return new Citation();
    }

    /**
     * Create an instance of {@link Biography }
     * 
     */
    public Biography createBiography() {
        return new Biography();
    }

    /**
     * Create an instance of {@link GrantNumber }
     * 
     */
    public GrantNumber createGrantNumber() {
        return new GrantNumber();
    }

    /**
     * Create an instance of {@link Year }
     * 
     */
    public Year createYear() {
        return new Year();
    }

    /**
     * Create an instance of {@link GivenPermissionBy }
     * 
     */
    public GivenPermissionBy createGivenPermissionBy() {
        return new GivenPermissionBy();
    }

    /**
     * Create an instance of {@link SecurityQuestionId }
     * 
     */
    public SecurityQuestionId createSecurityQuestionId() {
        return new SecurityQuestionId();
    }

    /**
     * Create an instance of {@link Applications }
     * 
     */
    public Applications createApplications() {
        return new Applications();
    }

    /**
     * Create an instance of {@link ExternalIdReference }
     * 
     */
    public ExternalIdReference createExternalIdReference() {
        return new ExternalIdReference();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Create an instance of {@link ResearcherUrl }
     * 
     */
    public ResearcherUrl createResearcherUrl() {
        return new ResearcherUrl();
    }

    /**
     * Create an instance of {@link FundingAgency }
     * 
     */
    public FundingAgency createFundingAgency() {
        return new FundingAgency();
    }

    /**
     * Create an instance of {@link OrcidGrant }
     * 
     */
    public OrcidGrant createOrcidGrant() {
        return new OrcidGrant();
    }

    /**
     * Create an instance of {@link PatentNumber }
     * 
     */
    public PatentNumber createPatentNumber() {
        return new PatentNumber();
    }

    /**
     * Create an instance of {@link EncryptedSecurityAnswer }
     * 
     */
    public EncryptedSecurityAnswer createEncryptedSecurityAnswer() {
        return new EncryptedSecurityAnswer();
    }

    /**
     * Create an instance of {@link EncryptedVerificationCode }
     * 
     */
    public EncryptedVerificationCode createEncryptedVerificationCode() {
        return new EncryptedVerificationCode();
    }

    /**
     * Create an instance of {@link Subtitle }
     * 
     */
    public Subtitle createSubtitle() {
        return new Subtitle();
    }

    /**
     * Create an instance of {@link PatentContributors }
     * 
     */
    public PatentContributors createPatentContributors() {
        return new PatentContributors();
    }

    /**
     * Create an instance of {@link WorkContributors }
     * 
     */
    public WorkContributors createWorkContributors() {
        return new WorkContributors();
    }

    /**
     * Create an instance of {@link SourceName }
     * 
     */
    public SourceName createSourceName() {
        return new SourceName();
    }

    /**
     * Create an instance of {@link OrcidHistory }
     * 
     */
    public OrcidHistory createOrcidHistory() {
        return new OrcidHistory();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link CompletionDate }
     * 
     */
    public CompletionDate createCompletionDate() {
        return new CompletionDate();
    }

    /**
     * Create an instance of {@link UrlName }
     * 
     */
    public UrlName createUrlName() {
        return new UrlName();
    }

    /**
     * Create an instance of {@link PatentSources }
     * 
     */
    public PatentSources createPatentSources() {
        return new PatentSources();
    }

    /**
     * Create an instance of {@link ExternalIdentifiers }
     * 
     */
    public ExternalIdentifiers createExternalIdentifiers() {
        return new ExternalIdentifiers();
    }

    /**
     * Create an instance of {@link AffiliationName }
     * 
     */
    public AffiliationName createAffiliationName() {
        return new AffiliationName();
    }

    /**
     * Create an instance of {@link RelevancyScore }
     * 
     */
    public RelevancyScore createRelevancyScore() {
        return new RelevancyScore();
    }

    /**
     * Create an instance of {@link WorkVisibilityDefault }
     * 
     */
    public WorkVisibilityDefault createWorkVisibilityDefault() {
        return new WorkVisibilityDefault();
    }

    /**
     * Create an instance of {@link Delegation }
     * 
     */
    public Delegation createDelegation() {
        return new Delegation();
    }

    /**
     * Create an instance of {@link DepartmentName }
     * 
     */
    public DepartmentName createDepartmentName() {
        return new DepartmentName();
    }

    /**
     * Create an instance of {@link SubmissionDate }
     * 
     */
    public SubmissionDate createSubmissionDate() {
        return new SubmissionDate();
    }

    /**
     * Create an instance of {@link CreditName }
     * 
     */
    public CreditName createCreditName() {
        return new CreditName();
    }

    /**
     * Create an instance of {@link OtherNames }
     * 
     */
    public OtherNames createOtherNames() {
        return new OtherNames();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "affiliation-type")
    public JAXBElement<String> createAffiliationType(String value) {
        return new JAXBElement<String>(_AffiliationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreationMethod }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "creation-method")
    public JAXBElement<CreationMethod> createCreationMethod(CreationMethod value) {
        return new JAXBElement<CreationMethod>(_CreationMethod_QNAME, CreationMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "contributor-sequence")
    public JAXBElement<String> createContributorSequence(String value) {
        return new JAXBElement<String>(_ContributorSequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "short-description")
    public JAXBElement<String> createShortDescription(String value) {
        return new JAXBElement<String>(_ShortDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "message-version")
    public JAXBElement<String> createMessageVersion(String value) {
        return new JAXBElement<String>(_MessageVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-external-identifier-type")
    public JAXBElement<String> createWorkExternalIdentifierType(String value) {
        return new JAXBElement<String>(_WorkExternalIdentifierType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citation }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-citation")
    public JAXBElement<Citation> createWorkCitation(Citation value) {
        return new JAXBElement<Citation>(_WorkCitation_QNAME, Citation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "work-type")
    public JAXBElement<String> createWorkType(String value) {
        return new JAXBElement<String>(_WorkType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orcid.org/ns/orcid", name = "contributor-role")
    public JAXBElement<String> createContributorRole(String value) {
        return new JAXBElement<String>(_ContributorRole_QNAME, String.class, null, value);
    }

}
