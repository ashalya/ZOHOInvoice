package org.wso2.carbon.connector.integration.test.zoho.Invoices;

/**
 * Created by sriashalyasrivathsan on 12/1/14.
 *
 */

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;

import javax.activation.DataHandler;
import java.net.URL;

public class InvoicesConnectorIntegrationTest extends ZohoConnectorIntegrationTest {

  /*
    mandatory parameters for getTheListOfInvoices
  */

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfInvoices} integration test")
    public void testListContactsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfInvoices_mandatory.txt";
        String methodName = "zoho_getTheListOfInvoices";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("invoices"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

/*
 optional parameters
 */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfInvoices} integration test")
    public void testListContactsWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfInvoices_optional.txt";
        String methodName = "zoho_getTheListOfInvoices";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }


    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfInvoices} integration test")
    public void testListContactsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfInvoices_negative.txt";
        String methodName = "zoho_getTheListOfInvoices";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 401);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }


    /*getDetailOfAnInvoice
     *mandatory parameters for getDetailOfAnInvoice
     */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnInvoice} integration test")
    public void testgetDetailOfAnInvoiceWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnInvoice_mandatory.txt";
        String methodName = "zoho_getDetailOfAnInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //optional parameters for getDetailOfAnInvoice

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnInvoice} integration test")
    public void testgetDetailOfAnInvoiceWithoptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnInvoice_optional.txt";
        String methodName = "zoho_getDetailOfAnInvoice";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnInvoice} integration test")
    public void testgetDetailOfAnInvoiceWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnInvoice_negative.txt";
        String methodName = "zoho_getDetailOfAnInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 401);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*
    deleteAnExistingInvoice
    mandatory parameters for deleteAnExistingInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingInvoice} integration test")
    public void testdeleteAnExistingInvoiceWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingInvoice_mandatory.txt";
        String methodName = "zoho_deleteAnExistingInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingInvoice} integration test")
    public void testdeleteAnExistingInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingInvoice_negative.txt";
        String methodName = "zoho_deleteAnExistingInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {

            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*createANewInvoice
    *mandatory parameters for createANewInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewInvoice} integration test")
    public void testcreateANewInvoiceWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewInvoice_mandatory.txt";
        String methodName = "zoho_createANewInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 201);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //optional parameters for createANewInvoice

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewInvoice} integration test")
    public void testcreateANewInvoiceWithoptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewInvoice_optional.txt";
        String methodName = "zoho_createANewInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 201);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewInvoice} integration test")
    public void testcreateANewInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewInvoice_negative.txt";
        String methodName = "zoho_createANewInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 400);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*updateExistingInvoice
     *mandatory parameters for updateExistingInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoice} integration test")
    public void testupdateExistingInvoiceWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoice_mandatory.txt";
        String methodName = "zoho_updateExistingInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //optional parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoice} integration test")
    public void testupdateExistingInvoiceWithoptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoice_optional.txt";
        String methodName = "zoho_updateExistingInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoice} integration test")
    public void testupdateExistingInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoice_negative.txt";
        String methodName = "zoho_updateExistingInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 405);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*emailTheInvoice--to be modified
      mandatory parameters for emailTheInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {emailTheInvoice} integration test")
    public void testemailTheInvoiceWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheInvoice_mandatory.txt";
        String methodName = "zoho_emailTheInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {emailTheInvoice} integration test")
    public void testemailTheInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheInvoice_negative.txt";
        String methodName = "zoho_emailTheInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*getContentOfAnInvoiceEmail
      mandatory parameters for getContentOfAnInvoiceEmail
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getContentOfAnInvoiceEmail} integration test")
    public void testgetContentOfAnInvoiceEmailWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getContentOfAnInvoiceEmail_mandatory.txt";
        String methodName = "zoho_getContentOfAnInvoiceEmail";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            //  JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            // Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getContentOfAnInvoiceEmail} integration test")
    public void testgetContentOfAnInvoiceEmailWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getContentOfAnInvoiceEmail_negative.txt";
        String methodName = "zoho_getContentOfAnInvoiceEmail";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*writeOffTheInvoice
      mandatory parameters for writeOffTheInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {writeOffTheInvoice} integration test")
    public void testwriteOffTheInvoiceContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "writeOffTheInvoice_mandatory.txt";
        String methodName = "zoho_writeOffTheInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {writeOffTheInvoice} integration test")
    public void testwriteOffTheInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "writeOffTheInvoice_negative.txt";
        String methodName = "zoho_writeOffTheInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*cancelTheWriteOffAnInvoice
    mandatory parameters for writeOffTheInvoice
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {cancelTheWriteOffAnInvoice} integration test")
    public void testcancelTheWriteOffAnInvoiceContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "cancelTheWriteOffAnInvoice_mandatory.txt";
        String methodName = "zoho_cancelTheWriteOffAnInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {cancelTheWriteOffAnInvoice} integration test")
    public void testcancelTheWriteOffAnInvoiceWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "cancelTheWriteOffAnInvoice_negative.txt";
        String methodName = "zoho_cancelTheWriteOffAnInvoice";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }


    /*Update Invoice shipping address
      mandatory parameters for Update shipping address
     */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoiceshippingAddress} integration test")
    public void testupdateExistingInvoiceshippingAddressContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoiceshippingAddress_mandatory.txt";
        String methodName = "zoho_updateExistingInvoiceshippingAddress";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoiceshippingAddress} integration test")
    public void testupdateExistingInvoiceshippingAddressWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoiceshippingAddress_negative.txt";
        String methodName = "zoho_updateExistingInvoiceshippingAddress";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*Update Invoice billing address
     *mandatory parameters for Update billing address
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoiceBillingAddress} integration test")
    public void testupdateExistingInvoiceBillingAddressContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoiceBillingAddress_mandatory.txt";
        String methodName = "zoho_updateExistingInvoiceBillingAddress";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingInvoiceBillingAddress} integration test")
    public void testupdateExistingInvoiceBillingAddressWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingInvoiceBillingAddress_negative.txt";
        String methodName = "zoho_updateExistingInvoiceBillingAddress";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 404);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    /*getlistOfInvoiceTemplates
    *mandatory parameters for getlistOfInvoiceTemplates
    */
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getlistOfInvoiceTemplates} integration test")
    public void testgetlistOfInvoiceTemplatesContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getlistOfInvoiceTemplates_mandatory.txt";
        String methodName = "zoho_getlistOfInvoiceTemplates";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

    //negative test case
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getlistOfInvoiceTemplates} integration test")
    public void testgetlistOfInvoiceTemplatesWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getlistOfInvoiceTemplates_negative.txt";
        String methodName = "zoho_getlistOfInvoiceTemplates";
        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));
        try {
            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 401);
            JSONObject jsonObject = ConnectorIntegrationUtil.sendRequest(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }
}
