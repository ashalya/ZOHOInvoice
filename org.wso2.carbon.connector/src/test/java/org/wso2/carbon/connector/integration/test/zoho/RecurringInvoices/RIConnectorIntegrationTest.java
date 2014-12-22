package org.wso2.carbon.connector.integration.test.zoho.RecurringInvoices;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;

import javax.activation.DataHandler;
import java.net.URL;

/**
 * Created by sriashalyasrivathsan on 12/6/14.
 */
public class RIConnectorIntegrationTest extends ZohoConnectorIntegrationTest {

//getListOfRecurringInvoices

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfRecurringInvoices} integration test")
    public void testListItemsWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfRecurringInvoices_mandatory.txt";
        String methodName = "zoho_getListOfRecurringInvoices";

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


    //optional parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfRecurringInvoices} integration test")
    public void testListItemsWithOptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfRecurringInvoices_optional.txt";
        String methodName = "zoho_getListOfRecurringInvoices";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfRecurringInvoices} integration test")
    public void testListItemsWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfRecurringInvoices_negative.txt";
        String methodName = "zoho_getListOfRecurringInvoices";

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


 //getADetailOfARecurringInvoice

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getADetailOfARecurringInvoice} integration test")
    public void testgetADetailOfARecurringInvoiceWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getADetailOfARecurringInvoice_mandatory.txt";
        String methodName = "zoho_getADetailOfARecurringInvoice";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {getADetailOfARecurringInvoice} integration test")
    public void testgetADetailOfARecurringInvoiceWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getADetailOfARecurringInvoice_negative.txt";
        String methodName = "zoho_getADetailOfARecurringInvoice";

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


//createANewRecurringInvoice

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewRecurringInvoice} integration test")
    public void testcreateANewRecurringInvoiceWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewRecurringInvoice_mandatory.txt";
        String methodName = "zoho_createANewRecurringInvoice";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 201);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }


    //optional parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewRecurringInvoice} integration test")
    public void testcreateANewRecurringInvoiceWithOptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewRecurringInvoice_optional.txt";
        String methodName = "zoho_createANewRecurringInvoice";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 201);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }

    //negative parameters
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {createANewRecurringInvoice} integration test")
    public void testcreateANewRecurringInvoiceWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewRecurringInvoice_negative.txt";
        String methodName = "zoho_createANewRecurringInvoice";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 400);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }


    //updateExistingRecurringInvoice


//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingRecurringInvoice} integration test")
    public void testupdateExistingRecurringInvoiceWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingRecurringInvoice_mandatory.txt";
        String methodName = "zoho_updateExistingRecurringInvoice";

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


    //optional parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingRecurringInvoice} integration test")
    public void testupdateExistingRecurringInvoiceWithOptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingRecurringInvoice_optional.txt";
        String methodName = "zoho_updateExistingRecurringInvoice";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingRecurringInvoice} integration test")
    public void testupdateExistingRecurringInvoiceWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingRecurringInvoice_negative.txt";
        String methodName = "zoho_updateExistingRecurringInvoice";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            System.out.println("--------------@@@@@@@@---------");
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 405);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));


        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }


    //deleteAnExistingRecurringInvoice

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingRecurringInvoice} integration test")
    public void testdeleteAnExistingRecurringInvoiceWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingRecurringInvoice_mandatory.txt";
        String methodName = "zoho_deleteAnExistingRecurringInvoice";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingRecurringInvoice} integration test")
    public void testdeleteAnExistingRecurringInvoiceWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingRecurringInvoice_negative.txt";
        String methodName = "zoho_deleteAnExistingRecurringInvoice";

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



