<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2013 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->
<@public classes=['home'] nav="register">

    <@spring.bind "registrationForm.*" />
    <div class="row">
        <div class="span3"></div>
        <div class="span9">
            <h2>${springMacroRequestContext.getMessage("register.labelRegisterforanORCIDiD")}</h2>
            <p>${springMacroRequestContext.getMessage("register.labelORCIDprovides")}<br /><br /></p>
    		<#if (RequestParameters['ajax'])??>
				<#include "/common/browser-checks.ftl" />
				<div ng-app="orcidApp" ng-controller="RegistrationCtrl">
					<div>
						<!-- span class="orcid-error" ng-show="register.errors.length > 0">
							<div ng-repeat='error in register.errors' ng-bind-html-unsafe="error"></div>
					   	</span -->
						<div>
	                        <label class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelfirstname")}</label>
	                        <div class="relative">
	                            <input name="givenNames" type="text" class="input-xlarge" ng-model="register.givenNames.value" ng-model-onblur ng-change="postRegisterValidate('GivenNames')"/>
	                            <span class="required" ng-class="isValidClass(register.givenNames)">*</span>
	                            <a href="${knowledgeBaseUri}/articles/142948-names-in-the-orcid-registry" target="_blank"><i class="icon-question-sign"></i></a>                            
								<span class="orcid-error" ng-show="register.givenNames.errors.length > 0">
									<div ng-repeat='error in register.givenNames.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                        </div>
	                    </div>				
						<div>
	                        <label class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labellastname")}</label>
	                        <div class="relative">
	                            <input name="familyNames" type="text" class="input-xlarge"  ng-model="register.familyNames.value"/>
	                            <span class="orcid-error" ng-show="register.familyNames.errors.length > 0">
									<div ng-repeat='error in register.familyNames.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                        </div>
	                    </div>
	                    <div>
	                        <label class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelemail")}</label>
	                        <div class="relative">
	                            <input name="email" type="text" class="input-xlarge" ng-model="register.email.value" ng-model-onblur ng-change="postRegisterValidate('Email')" />
	                            <span class="required" ng-class="isValidClass(register.email)">*</span>
	                            <span class="orcid-error" ng-show="register.email.errors.length > 0">
									<div ng-repeat='error in register.email.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                        </div>
	                    </div>				
	                    <div>
	                        <label class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelreenteremail")}</label>
	                        <div class="relative">
	                            <input name="confirmedEmail" type="text" class="input-xlarge" ng-model="register.emailConfirm.value" ng-model-onblur ng-change="postRegisterValidate('EmailConfirm')" />
	                            <span class="required" ng-class="isValidClass(register.emailConfirm)">*</span>
	                            <span class="orcid-error" ng-show="register.emailConfirm.errors.length > 0">
									<div ng-repeat='error in register.emailConfirm.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                        </div>
	                    </div>				
	                    <div class="control-group password-group">
	                        <label class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelpassword")}</label>
	                        <div class="relative">
	                            <input type="password" name="password" class="input-xlarge" ng-model="register.password.value" ng-change="postRegisterValidate('Password')"/>
	                            <span class="required" ng-class="isValidClass(register.password)">*</span>
	                            <span class="orcid-error" ng-show="register.password.errors.length > 0">
									<div ng-repeat='error in register.password.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                            <a class="password-info" href="#"><i class="icon-question-sign"></i></a>
	                            <div class="popover bottom password-details">
	                                <div class="arrow"></div>
	                                <div class="popover-content">
	                                    <div class="help-block">
	                                        <p>${springMacroRequestContext.getMessage("password_one_time_reset.labelmust8more")}</p>
	                                        <ul>
	                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labelatleast09")}</li>
	                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labelatleast1following")}</li>
	                                            <ul>
	                                            	<li>${springMacroRequestContext.getMessage("password_one_time_reset.labelalphacharacter")}</li>
	                                            	<li>${springMacroRequestContext.getMessage("password_one_time_reset.labelanyoffollow")}<br /> ! @ # $ % ^ * ( ) ~ `{ } [ ] | \ &amp; _</li>
	                                            </ul>
	                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labeloptionallyspace")}</li>
	                                        </ul>                                       
	                                        <p>${springMacroRequestContext.getMessage("password_one_time_reset.examplesunmoon")}</p>
	                                    </div>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	                    <div>
	                        <label class="control-label">${springMacroRequestContext.getMessage("password_one_time_reset.labelconfirmpassword")}</label>
	                        <div class="relative">
	                            <input type="password" name="confirmPassword" class="input-xlarge" ng-model="register.passwordConfirm.value" ng-change="postRegisterValidate('PasswordConfirm')"/>
	                            <span class="required" ng-class="isValidClass(register.passwordConfirm)">*</span>
	                            <span class="orcid-error" ng-show="register.passwordConfirm.errors.length > 0">
									<div ng-repeat='error in register.passwordConfirm.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
	                        </div>
	                    </div>
	     				<div style="margin-bottom: 20px; margin-top: 10px;">
	                        <label class="privacy-toggle-lbl">${springMacroRequestContext.getMessage("register.labelDefaultprivacyfornewworks")}</label>
	                    	<div class="relative">
									<ul class="privacyToggle">
				   						<li class="publicActive" ng-class="{publicInActive: register.workVisibilityDefault.visibility != 'PUBLIC'}"><a href="" title="PUBLIC" ng-click="updateWorkVisibilityDefault('PUBLIC', $event)"></a></li>
				   						<li class="limitedActive" ng-class="{limitedInActive: register.workVisibilityDefault.visibility != 'LIMITED'}"><a href="" title="LIMITED" ng-click="updateWorkVisibilityDefault('LIMITED', $event)"></a></li>
				   						<li class="privateActive" ng-class="{privateInActive: register.workVisibilityDefault.visibility != 'PRIVATE'}"><a href="" title="PRIVATE" ng-click="updateWorkVisibilityDefault('PRIVATE', $event)"></a></li>
				   					</ul>
				   					<div class="privacyLegendHide" style="position: absolute; left: 110px; top: 5px;">
					   				    <a href="javascript:void(0);"><i class="icon-question-sign"></i></a>
					   				    <div class="privacyLegend"></div>
					   				</div>
				   			</div>
	                    </div>                    
		                <div style="margin-bottom: 15px;">
		                    <div class="relative">
		                        <label>${springMacroRequestContext.getMessage("claim.notificationemail")}</label>
		                        <label class="checkbox">
		                            <input type="checkbox" name="sendOrcidChangeNotifications" ng-model="register.sendChangeNotifications.value"/>
		                            ${springMacroRequestContext.getMessage("register.labelsendmenotifications")}
		                        </label>
		                        <label class="checkbox">
		                            <input type="checkbox" name="sendOrcidNews" ng-model="register.sendOrcidNews.value"/>
		                            ${springMacroRequestContext.getMessage("register.labelsendinformation")}
		                        </label>
		                     </div>
						</div>
	                    <div>
		                    <div class="relative"  style="margin-bottom: 15px;">
		                        <label>${springMacroRequestContext.getMessage("register.labelTermsofUse")} <span class="required"  ng-class="{'text-error':register.termsOfUse.value == false}">*</span></label>
		                        <label class="checkbox" style="width: 480px;">
		                        <input type="checkbox" name="acceptTermsAndConditions" ng-model="register.termsOfUse.value"/>
		                        ${springMacroRequestContext.getMessage("register.labelconsent")} <a href="${aboutUri}/footer/privacy-policy?lang=${locale}" target="_blank">${springMacroRequestContext.getMessage("register.labelprivacypolicy")}</a> ${springMacroRequestContext.getMessage("register.labeland")} <a href="${aboutUri}/content/orcid-terms-use?lang=${locale}" target="_blank">${springMacroRequestContext.getMessage("register.labeltermsandconditions")}</a> ${springMacroRequestContext.getMessage("register.labelofuseinclude")}</p>
		                        </label>
		                        <span class="orcid-error" ng-show="register.termsOfUse.errors.length > 0">
									<div ng-repeat='error in register.termsOfUse.errors' ng-bind-html-unsafe="error"></div>
					   			</span>
		                    </div>
	                	</div>   
		                <div class="relative">
		                      <button type="submit" class="btn btn-primary" ng-click="postRegister()">${springMacroRequestContext.getMessage("header.register")}</button>
		                </div>  
	                </div> 
	                <script type="text/ng-template" id="duplicates">
	                	<div style="padding: 20px">
	                		<div style="width: 50%; float:left;">
		                 		<h4>${springMacroRequestContext.getMessage("duplicate_researcher.wefoundfollowingrecords")}</h4>
		                 	</div>
		                 	<div style="width: 50%;  text-align: right; float:left; padding-top: 15px;">
		                 	    <button class="btn btn-primary" ng-click="postRegisterConfirm()">${springMacroRequestContext.getMessage("duplicate_researcher.btncontinuetoregistration")}</button>
		        			</div>
		        			<table class="table table-striped">
		            			<thead>
		            				<tr>               				
		                				<th>${springMacroRequestContext.getMessage("duplicate_researcher.thORCID")}</th>
		                				<th>${springMacroRequestContext.getMessage("duplicate_researcher.thEmail")}</th>
		                				<th>${springMacroRequestContext.getMessage("duplicate_researcher.thgivennames")}</th>
		                				<th>${springMacroRequestContext.getMessage("duplicate_researcher.thFamilyName")}</th>                				
		            				</tr>
		            			</thead>
		            			<tbody>
		            				 <tr ng-repeat='dup in duplicates'>
		            				 	<td><a href="<@spring.url '/account'/>">{{dup.orcid}}</a></td>
		                    			<td>{{dup.email}}</td>
		                    			<td>{{dup.givenNames}}</td>
		                    			<td>{{dup.familyNames}}</td>
		                			</tr>
		            			</tbody>
		        			</table>
		        			<div style="width: 100%;  text-align: right;">
		        			     <button class="btn btn-primary" ng-click="postRegisterConfirm()">${springMacroRequestContext.getMessage("duplicate_researcher.btncontinuetoregistration")}</button>
		        			</div>   		
	        			</div>
	                </script>        
				</div>
			<#else>
                <form id="self-reg-form" class="form-sign-up" name="selfRegForm" action="register" method="post">
                    <#include "/common/browser-checks.ftl" />
                    <div>
                        <label for="givenNames" class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelfirstname")}</label>
                        <div class="relative">
                            <@spring.formInput "registrationForm.givenNames" 'class="input-xlarge" name="firstName" data-validate="{required:true}"'/>
                            <span class="required">*</span>
                            <a href="${knowledgeBaseUri}/articles/142948-names-in-the-orcid-registry" target="_blank"><i class="icon-question-sign"></i></a>                            
                            <@spring.showErrors "<br/>" "orcid-error"/>
                        </div>
                    </div>
                    <div>
                        <label for="familyName" class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labellastname")}</label>
                        <div class="relative">
                            <@spring.formInput "registrationForm.familyName" 'class="input-xlarge" name="user.lastName" data-validate="{required:true}"'/>
                            <@spring.showErrors "<br/>" "orcid-error"/>
                        </div>
                    </div>               
                    <div>
                        <label for="email" class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelemail")}</label>
                        <div class="relative">
                            <@spring.formInput "registrationForm.email" 'class="input-xlarge" name="user.email" data-validate="{required:true, email:true}"'/>
                            <span class="required">*</span>
                            <@orcid.showErrorsUnescaped/>
                            <@orcid.showErrorsUnescapedForPath "email"/>
                        </div>
                    </div>
                    <div>
                        <label for="email" class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelreenteremail")}</label>
                        <div class="relative">
                            <@spring.formInput "registrationForm.confirmedEmail" 'class="input-xlarge" name="user.email" data-validate="{required:true, email:true, equalTo:\"#email\"}"'/>
                            <span class="required">*</span>
                            <@spring.showErrors "<br/>" "orcid-error"/>                            
                        </div>
                    </div>
                    <div>
                        <div class="relative">
                            <@spring.bind "registrationForm"/>
                            <@spring.showErrors "<br/>" "orcid-error"/>
                        </div>
                    </div>
                    <div class="control-group password-group">
                        <label for="password" class="control-label">${springMacroRequestContext.getMessage("oauth_sign_up.labelpassword")}</label>
                        <div class="relative">
                            <@spring.formPasswordInput "registrationForm.password" 'class="input-xlarge password-strength" data-validate="{required:true}"'/>
                            <span class="required">*</span>
                            <@spring.showErrors "<br/>" "orcid-error"/>
                            <a class="password-info" href="#"><i class="icon-question-sign"></i></a>
                            <div class="popover bottom password-details">
                                <div class="arrow"></div>
                                <div class="popover-content">
                                    <div class="help-block">
                                        <p>${springMacroRequestContext.getMessage("password_one_time_reset.labelmust8more")}</p>
                                        <ul>
                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labelatleast09")}</li>
                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labelatleast1following")}</li>
                                            <ul>
                                            	<li>${springMacroRequestContext.getMessage("password_one_time_reset.labelalphacharacter")}</li>
                                            	<li>${springMacroRequestContext.getMessage("password_one_time_reset.labelanyoffollow")}<br /> ! @ # $ % ^ * ( ) ~ `{ } [ ] | \ &amp; _</li>
                                            </ul>
                                            <li>${springMacroRequestContext.getMessage("password_one_time_reset.labeloptionallyspace")}</li>
                                        </ul>                                       
                                        <p>${springMacroRequestContext.getMessage("password_one_time_reset.examplesunmoon")}</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                      <div>
                        <label for="password" class="control-label">${springMacroRequestContext.getMessage("password_one_time_reset.labelconfirmpassword")}</label>
                        <div class="relative">
                            <@spring.formPasswordInput "registrationForm.confirmedPassword" 'class="input-xlarge" data-validate="{required:true, equalTo:\'#password\'}"'/>
                            <span class="required">*</span>
                            <@spring.showErrors "<br/>" "orcid-error"/>
                        </div>
                    </div>
                    <div style="margin-bottom: 20px; margin-top: 10px;">
                        <label class="privacy-toggle-lbl">${springMacroRequestContext.getMessage("register.labelDefaultprivacyfornewworks")}</label>
                        <label class="visibility-lbl">
                            <@spring.formSingleSelect "registrationForm.workVisibilityDefault", visibilities />
                        </label>
                        <@orcid.privacy "" registrationForm.workVisibilityDefault 'btn-group privacy-group'/>
                        <div  style="width: 480px;">
                            <label>
                                ${springMacroRequestContext.getMessage("register.labeladdinformationtoORCID")}
                            </label>
                        </div>
                    </div>                    
                <div style="margin-bottom: 15px;">
                    <div class="relative">
                        <label>${springMacroRequestContext.getMessage("claim.notificationemail")}</label>
                        <label class="checkbox">
                            <@spring.formCheckbox "registrationForm.sendOrcidChangeNotifications"/>
                            ${springMacroRequestContext.getMessage("register.labelsendmenotifications")}
                        </label>
                        <label class="checkbox">
                            <@spring.formCheckbox "registrationForm.sendOrcidNews"/>
                            ${springMacroRequestContext.getMessage("register.labelsendinformation")}
                        </label>
                        </div>
				</div>
                   <div>
                    <div class="relative"  style="margin-bottom: 15px;">
                        <label>${springMacroRequestContext.getMessage("register.labelTermsofUse")} <span class="required">*</span></label>
                        <label class="checkbox" style="width: 480px;">
                            <@spring.formCheckbox "registrationForm.acceptTermsAndConditions"/>
                            ${springMacroRequestContext.getMessage("register.labelconsent")} <a href="${aboutUri}/footer/privacy-policy?lang=${locale}" target="_blank">${springMacroRequestContext.getMessage("register.labelprivacypolicy")}</a> ${springMacroRequestContext.getMessage("register.labeland")} <a href="${aboutUri}/content/orcid-terms-use?lang=${locale}" target="_blank">${springMacroRequestContext.getMessage("register.labeltermsandconditions")}</a> ${springMacroRequestContext.getMessage("register.labelofuseinclude")}</p>
                            <@spring.showErrors "<br/>" "orcid-error"/>
                        </label>
                    </div>
                </div>   
                <div class="relative">
                      <button type="submit" class="btn btn-primary">${springMacroRequestContext.getMessage("header.register")}</button>
                </div>           
            </form>
            </#if>
        </div>
    </div>
</@public>