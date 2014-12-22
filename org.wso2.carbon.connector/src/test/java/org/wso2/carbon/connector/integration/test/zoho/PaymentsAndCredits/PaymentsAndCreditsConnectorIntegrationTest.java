package org.wso2.carbon.connector.integration.test.zoho.PaymentsAndCredits;

/**
 * Created by sriashalyasrivathsan on 12/3/14.
 */

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;

import javax.activation.DataHandler;
import java.net.URL;

public class PaymentsAndCreditsConnectorIntegrationTest extends ZohoConnectorIntegrationTest {

//ListInvoicePayments


//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {ListInvoicePayments} integration test")
    public void testListInvoicePaymentsWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ListInvoicePayments_mandatory.txt";
        String methodName = "zoho_ListInvoicePayments";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {ListInvoicePayments} integration test")
    public void testListInvoicePaymentsWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ListInvoicePayments_negative.txt";
        String methodName = "zoho_ListInvoicePayments";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }

//ListCreditsApplied

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {ListCreditsApplied} integration test")
    public void testListCreditsAppliedWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ListCreditsApplied_mandatory.txt";
        String methodName = "zoho_ListCreditsApplied";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {ListCreditsApplied} integration test")
    public void testListCreditsAppliedWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ListCreditsApplied_negative.txt";
        String methodName = "zoho_ListCreditsApplied";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }


    //ApplyCredits


//mandatory parameters ---to do ---

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {ApplyCredits} integration test")
    public void testListApplyCreditsWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ApplyCredits_mandatory.txt";
        String methodName = "zoho_ApplyCredits";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {ApplyCredits} integration test")
    public void testApplyCreditsWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "ApplyCredits_negative.txt";
        String methodName = "zoho_ApplyCredits";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }




}
