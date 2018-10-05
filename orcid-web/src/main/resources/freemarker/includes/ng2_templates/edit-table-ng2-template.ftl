<#include "/includes/ng2_templates/emails-form-ng2-template.ftl">
<#include "/includes/ng2_templates/security-question-edit-ng2-template.ftl">
<#include "/includes/ng2_templates/deactivate-account-ng2-template.ftl">
<#include "/includes/ng2_templates/deprecate-account-ng2-template.ftl">
<#include "/includes/ng2_templates/twoFA-state-ng2-template.ftl">
<script type="text/ng-template" id="edit-table-ng2-template">
    <h1>Change</h1>
    <table class="table table-bordered settings-table account-settings" style="margin:0; padding:0;">
        <tbody>
            <!-- Email and notification preferences -->
            <tr>
                <th><a name="editEmail"></a>
                    ${springMacroRequestContext.getMessage("manage.email_notification_preferences")}
                </th>
                <td><a id="account-settings-toggle-email-edit" (click)="toggleSection('editEmail')">{{toggleText['editEmail']}}</a></td>
            </tr>
            <tr>
                <td colspan="2" *ngIf="showSection['editEmail']" >
                    <emails-form-ng2 popUp="false"></emails-form-ng2>
                </td>
            </tr>
            <!--Language display preferences-->
            <tr>
                <th><a name="editLanguage"></a>${springMacroRequestContext.getMessage("manage.language")}</th>
                <td><a id="" (click)="toggleSection('editLanguage')">{{toggleText['editLanguage']}}</a></td>
            </tr>
            <tr *ngIf="showSection['editLanguage']" >
                <td  colspan="2">
                    <p>${springMacroRequestContext.getMessage("manage.language_copy")}</p>
                    <div class="row">
                        <div class="col-md-12">
                            <language-ng2></language-ng2>
                        </div>
                    </div>
                </td>
            </tr>
            <!--Password-->
            <tr>
                <th><a name="editPassword"></a>${springMacroRequestContext.getMessage("manage.password")}</th>
                <td><a (click)="toggleSection('editPassword')">{{toggleText['editPassword']}}</a></td>
            </tr>
            <tr *ngIf="showSection['editPassword']">
                <td colspan="2">
                    <span class="orcid-error" *ngIf="changePasswordPojo?.errors?.length > 0">
                        <div *ngFor='let error of changePasswordPojo.errors' [innerHTML]="error"></div>
                    </span>
                    <div class="form-group">
                        <label for="passwordField">${springMacroRequestContext.getMessage("change_password.oldpassword")}</label>
                        <br />
                        <input id="passwordField" type="password" name="oldPassword" (keyup.enter)="saveChangePassword()" [(ngModel)]="changePasswordPojo.oldPassword" class="input-xlarge" /> <span class="required">*</span>
                    </div>
                    <div class="form-group">
                        <label for="passwordField">${springMacroRequestContext.getMessage("change_password.newpassword")}</label>
                        <br />
                        <input id="password" type="password" name="password" (keyup.enter)="saveChangePassword()" [(ngModel)]="changePasswordPojo.password" class="input-xlarge" 
                        /> <span class="required">*</span>
                    </div>
                    <div class="form-group">
                        <label for="retypedPassword">${springMacroRequestContext.getMessage("change_password.confirmnewpassword")}</label>
                        <br />
                        <input id="retypedPassword" type="password"name="retypedPassword"[(ngModel)]="changePasswordPojo.retypedPassword" (keyup.enter)="saveChangePassword()" class="input-xlarge"/> <span class="required">*</span>
                    </div>
                    <button id="bottom-submit-password-change" class="btn btn-primary" (click)="saveChangePassword()">${springMacroRequestContext.getMessage("freemarker.btnsavechanges")}</button>                                   
                    <button class="btn btn-white-no-border cancel-option inner-row" (click)="getChangePassword()" id="bottom-clear-password-changes">${springMacroRequestContext.getMessage("freemarker.btncancel")}</button>
                </td>
            </tr>
            <!-- Privacy preferences -->
            <tr>
                <th><a name="editPrivacyPreferences"></a>${springMacroRequestContext.getMessage("manage.privacy_preferences")}</th>
                <td><a (click)="toggleSection('editPrivacy')" id="privacyPreferencesToggle">{{toggleText['editPrivacy']}}</a></td>
            </tr>
            <tr *ngIf="showSection['editPrivacy']" id="privacyPreferencesSection">
                <td colspan="2">          
                    <div> 
                        <div class="editTablePadCell35" id="privacy-settings">  
                            ${springMacroRequestContext.getMessage("privacy_preferences.activitiesVisibilityDefault.who_can_see_this")}
                            <br>
                            <div class="visibilityDefault">
                                <div class="radio">
                                  <label><input type="radio" name="defaultVisibility" [ngModel]="prefs['default_visibility']" value="PUBLIC" (change)="updateActivitiesVisibilityDefault(prefs['default_visibility'], 'PUBLIC', $event)"><span class="public"></span><span class="defaultVisLabel"><b><@orcid.msg 'manage.lipublic'/></b> <@orcid.msg 'register.privacy_everyone_text'/></span></label>
                                </div>
                                <div class="radio">
                                  <label><input type="radio" name="defaultVisibility" [ngModel]="prefs['default_visibility']" value="LIMITED" (change)="updateActivitiesVisibilityDefault(prefs['default_visibility'], 'LIMITED', $event)"><span class="limited"></span><span class="defaultVisLabel"><b><@orcid.msg 'manage.lilimited'/></b> <@orcid.msg 'register.privacy_limited_text'/></span></label>
                                </div>
                                <div class="radio">
                                  <label><input type="radio" name="defaultVisibility" [ngModel]="prefs['default_visibility']" value="PRIVATE" (change)="updateActivitiesVisibilityDefault(prefs['default_visibility'], 'PRIVATE', $event)"><span class="private"></span><span class="defaultVisLabel"><b><@orcid.msg 'manage.liprivate'/></b> <@orcid.msg 'register.privacy_private_text'/></span></label>
                                </div>
                            </div>
                            <div class="visibilityHelp">
                                <div class="popover-help-container">
                                    <i class="glyphicon glyphicon-question-sign"></i>
                                    <div id="name-help" class="popover bottom">
                                        <div class="arrow"></div>
                                        <div class="popover-content">
                                            <strong>${springMacroRequestContext.getMessage("privacyToggle.help.who_can_see")}</strong>
                                            <ul class="privacyHelp">
                                                <li class="public" style="color: #009900;">${springMacroRequestContext.getMessage("privacyToggle.help.everyone")}</li>
                                                <li class="limited" style="color: #ffb027;">${springMacroRequestContext.getMessage("privacyToggle.help.trusted_parties")}</li>
                                                <li class="private" style="color: #990000;">${springMacroRequestContext.getMessage("privacyToggle.help.only_me")}</li>
                                            </ul>
                                            <a href="<@orcid.msg 'common.kb_uri_default'/>360006897614" target="privacyToggle.help.more_information">${springMacroRequestContext.getMessage("privacyToggle.help.more_information")}</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <span class="orcid-error" *ngIf="errorUpdatingVisibility">
                                ${springMacroRequestContext.getMessage("privacy_preferences.error_updating_visibility")}
                            </span>
                        </div>
                    </div> 
                </td>
            </tr>
            <tr>
                <th><a name="editSecurityQuestion"></a>${springMacroRequestContext.getMessage("manage.security_question")}</th>
                <td><a (click)="toggleSection('editSecurityQuestion')">{{toggleText['editSecurityQuestion']}}</a></td>
            </tr>
            <tr
                *ngIf="showSection['editSecurityQuestion']">
                <td colspan="2">
                    <security-question-edit-ng2></security-question-edit-ng2>
                </td>
            </tr>
            <!-- Deactivate Account -->
            <tr>
                <th><a name="editDeactivate"></a>${springMacroRequestContext.getMessage("manage.close_account")}</th>
                <td><a (click)="toggleSection('deactivate')">{{toggleText['deactivate']}}</a></td>
            </tr>
            <tr *ngIf="showSection['deactivate']" >
                <td colspan="2">
                    <deactivate-account-ng2></deactivate-account-ng2>
                </td>
            </tr>

            <!-- / Deactivate Account -->
            <!-- Deprecate duplicate account -->
            <tr>
                <th><a name="editDeprecate"></a>${springMacroRequestContext.getMessage("manage.removeDuplicate")}</th>
                <td><a (click)="toggleSection('deprecate')">{{toggleText['deprecate']}}</a></td>
            </tr>
            <tr *ngIf="showSection['deprecate']" >
                <td colspan="2">
                    <deprecate-account-ng2></deprecate-account-ng2>
                </td>
            </tr>
            <tr>
                <th><a name="edit2FA"></a>${springMacroRequestContext.getMessage("manage.2FA")}</th>
                <td><a (click)="toggleSection('twoFA')">{{toggleText['twoFA']}}</a></td>
            </tr>
            <tr *ngIf="showSection['2FA']" >
                <td colspan="2">
                    <two-fa-state-ng2></two-fa-state-ng2>
                </td>
            </tr>
            <tr>
                <th><a name="getMyData"></a>${springMacroRequestContext.getMessage("manage.get_my_data")}</th>
                <td><a (click)="toggleSection('getMyData')">{{toggleText['getMyData']}}</a></td>
            </tr>
            <tr *ngIf="showSection['getMyData']" id="get-my-data">
                <td colspan="2">
                    <p>
                        <@orcid.msg 'manage.get_my_data.details.p1' />
                    </p>
                    <p>
                        <@orcid.msg 'manage.get_my_data.details.p2' /> <a href="<@orcid.msg 'common.kb_uri_default'/>360006897634"><@orcid.msg 'common.learn_more' /></a>
                    </p>
                    <form ngNoForm action="${baseUri}/get-my-data" method="POST">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        <button class="btn btn-primary">
                            <@orcid.msg 'manage.get_my_data.button' />
                        </button>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
</script>