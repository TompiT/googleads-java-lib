// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201306.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201306.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This example deletes an ad group by setting the status to 'DELETED'. To get
 * ad groups, run GetAdGroups.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupService.mutate
 *
 * @author Kevin Winter
 */
public class DeleteAdGroup {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId) throws Exception {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group with DELETED status.
    AdGroup adGroup = new AdGroup();
    adGroup.setId(adGroupId);
    adGroup.setStatus(AdGroupStatus.DELETED);
    // We recommend including the original name when renaming before delete.
    adGroup.setName("Deleted on " + new SimpleDateFormat("yyMMDD HH:mm:ss.S").format(new Date()));

    // Create operations.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.SET);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation};

    // Delete ad group.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    // Display ad groups.
    for (AdGroup adGroupResult : result.getValue()) {
      System.out.println("Ad group with name \"" + adGroupResult.getName() + "\" and id \""
          + adGroupResult.getId() + "\" was deleted.");
    }
  }
}
