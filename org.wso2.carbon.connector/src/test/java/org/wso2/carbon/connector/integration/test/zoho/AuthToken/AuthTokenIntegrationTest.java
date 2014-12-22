package org.wso2.carbon.connector.integration.test.zoho.AuthToken;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;

import javax.activation.DataHandler;
import java.net.URL;

/**
 * Created by sriashalyasrivathsan on 12/11/14.
 */
public class AuthTokenIntegrationTest  extends ZohoConnectorIntegrationTest {


    //GetAuthToken

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {GetAuthToken} integration test")
    public void testGetAuthTokenWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "GetAuthToken_mandatory.txt";
        String methodName = "zoho_GetAuthToken";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }

    //negative parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {GetAuthToken} integration test")
    public void testGetAuthTokenWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "GetAuthToken_negative.txt";
        String methodName = "zoho_GetAuthToken";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 401);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }



}
