package org.wso2.carbon.connector.integration.test.zoho.Contacts;

/**
 * Created by sriashalyasrivathsan on 11/25/14.
 *
 */
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;
import javax.activation.DataHandler;
import java.net.URL;
public class ListContactsIntegrationTest extends ZohoConnectorIntegrationTest{

//getAListOfContacts
//Positive test case for Positive test case for mandatory parameters
    @Test(enabled = true, groups = {"wso2.esb"}, description = "zoho {getAListOfContacts} integration test")
    public void testgetAListOfContactsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getAListOfContacts_mandatory.txt";
        String methodName = "zoho_getAListOfContacts";
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

//Positive test case for optional parameters 
    @Test(enabled = true, groups = {"wso2.esb"}, description = "zoho {getAListOfContacts} integration test")
    public void testgetAListOfContactsWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getAListOfContacts_optional.txt";
        String methodName = "zoho_getAListOfContacts";
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

//Negative test case for mandatory parameters 
    @Test(enabled = true, groups = {"wso2.esb"}, description = "zoho {getAListOfContacts} integration test")
    public void testgetAListOfContactsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getAListOfContacts_negative.txt";
        String methodName = "zoho_getAListOfContacts";
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

  //getAContactDetail
//Positive test case for Positive test case for mandatory parameters
    @Test(enabled = true, groups = {"wso2.esb"}, description = "zoho {getAContactDetail} integration test")
    public void testgetAContactDetailWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getAContactDetail_mandatory.txt";
        String methodName = "zoho_getAContactDetail";
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

//Negative test case for mandatory parameters
    @Test(enabled = true, groups = {"wso2.esb"}, description = "zoho {getAContactDetail} integration test")
    public void testgetAContactDetailWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getAContactDetail_negative.txt";
        String methodName = "zoho_getAContactDetail";
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

//createAContact
//Positive test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createAContact} integration test")
    public void testcreateAContactWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createAContact_mandatory.txt";
        String methodName = "zoho_createAContact";
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
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

//Positive test case for optional parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createAContact} integration test")
    public void testcreateAContactWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createAContact_optional.txt";
        String methodName = "zoho_createAContact";
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
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

 //Negative test case for mandatory parameters  
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createAContact} integration test")
    public void testcreateAContactWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createAContact_negative.txt";
        String methodName = "zoho_createAContact";
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

//deleteExistingContact
//Positive test case for mandatory parameters
    @Test(enabled =false, groups = {"wso2.esb"}, description = "zoho {deleteExistingContact} integration test")
    public void testdeleteExistingContactWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteExistingContact_mandatory.txt";
        String methodName = "zoho_deleteExistingContact";
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
//Negative test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteExistingContact} integration test")
    public void testdeleteExistingContactWithnegative() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteExistingContact_negative.txt";
        String methodName = "zoho_deleteExistingContact";
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
            Assert.assertTrue(jsonObject.has("Contact does not exist"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }
    
//updateExistingContact
//Positive test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingContact} integration test")
    public void testupdateExistingContactWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingContact_mandatory.txt";
        String methodName = "zoho_updateExistingContact";
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
    
//Positive test case for optional parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingContact} integration test")
    public void testupdateExistingContactWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingContact_optional.txt";
        String methodName = "zoho_updateExistingContact";
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

//Negative test case for mandatory parameters  --
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingContact} integration test")
    public void testupdateExistingContactWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateExistingContact_negative.txt";
        String methodName = "zoho_updateExistingContact";
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
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

//getTheListOfComments
//Positive test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfComments} integration test")
    public void testgetTheListOfCommentsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfComments_mandatory.txt";
        String methodName = "zoho_getTheListOfComments";
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
//Negative test case for mandatory parameters  
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateExistingContact} integration test")
    public void testgetTheListOfCommentsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfComments_negative.txt";
        String methodName = "zoho_updateExistingContact";
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
            Assert.assertTrue(jsonObject.has("code"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

//getListOfRefunds
//Positive test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfRefunds} integration test")
    public void testgetListOfRefundsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfRefunds_mandatory.txt";
        String methodName = "zoho_getListOfRefunds";
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

    //Negative test case for mandatory parameters  
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfRefunds} integration test")
    public void testgetListOfRefundsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfRefunds_negative.txt";
        String methodName = "zoho_getListOfRefunds";
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

//emailTheStatement--to do---
//Positive test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {emailTheStatement} integration test")
    public void testemailTheStatementWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheStatement_mandatory.txt";
        String methodName = "zoho_emailTheStatement";
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

//Negative test case for mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {emailTheStatement} integration test")
    public void testemailTheStatementWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheStatement_negative.txt";
        String methodName = "zoho_emailTheStatement";
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
}
