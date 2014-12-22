package org.wso2.carbon.connector.integration.test.zoho.CreditNotes;
/**
 * Created by sriashalyasrivathsan on 12/5/14.
 */
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;

import javax.activation.DataHandler;
import java.net.URL;
public class CreditNotesConnectorIntegrationTest extends ZohoConnectorIntegrationTest {
//getListOfCreditNotes
//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfCreditNotes} integration test")
    public void testListItemsWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfCreditNotes_mandatory.txt";
        String methodName = "zoho_getListOfCreditNotes";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfCreditNotes} integration test")
    public void testListItemsWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfCreditNotes_optional.txt";
        String methodName = "zoho_getListOfCreditNotes";
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

//negative parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfCreditNotes} integration test")
    public void testListItemsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfCreditNotes_negative.txt";
        String methodName = "zoho_getListOfCreditNotes";
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
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }


//getACreditNoteDetail
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getACreditNoteDetail} integration test")
    public void testgetACreditNoteDetailWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getACreditNoteDetail_mandatory.txt";
        String methodName = "zoho_getACreditNoteDetail";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getACreditNoteDetail} integration test")
    public void testgetACreditNoteDetailWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getACreditNoteDetail_optional.txt";
        String methodName = "zoho_getACreditNoteDetail";
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

//negative parameters
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {getACreditNoteDetail} integration test")
    public void testgetACreditNoteDetailWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getACreditNoteDetail_negative.txt";
        String methodName = "zoho_getACreditNoteDetail";
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
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }


//createACreditNote
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createACreditNote} integration test")
    public void testCreateACreditNoteWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createACreditNote_mandatory.txt";
        String methodName = "zoho_createACreditNote";
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

//optional parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createACreditNote} integration test")
    public void testCreateACreditNoteWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createACreditNote_optional.txt";
        String methodName = "zoho_createACreditNote";
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

//negative parameters
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {createACreditNote} integration test")
    public void testCreateACreditNoteWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createACreditNote_negative.txt";
        String methodName = "zoho_createACreditNote";
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
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }
    
//updateExistingCreditNote
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingCreditNote} integration test")
    public void testupdateExistingCreditNoteWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingCreditNote_mandatory.txt";
        String methodName = "zoho_updateExistingCreditNote";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingCreditNote} integration test")
    public void testupdateExistingCreditNoteWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingCreditNote_optional.txt";
        String methodName = "zoho_updateExistingCreditNote";
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

//negative parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingCreditNote} integration test")
    public void testupdateExistingCreditNoteWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingCreditNote_negative.txt";
        String methodName = "zoho_updateExistingCreditNote";
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

//deleteExisistingCreditNotes
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteExisistingCreditNote} integration test")
    public void testDeleteExisistingCreditNoteWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteExisistingCreditNote_mandatory.txt";
        String methodName = "zoho_deleteExisistingCreditNote";
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

    //negative parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteExisistingCreditNote} integration test")
    public void testDeleteExisistingCreditNoteWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteExisistingCreditNote_negative.txt";
        String methodName = "zoho_deleteExisistingCreditNote";
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
            Assert.assertTrue(jsonObject.has("message"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }
}
