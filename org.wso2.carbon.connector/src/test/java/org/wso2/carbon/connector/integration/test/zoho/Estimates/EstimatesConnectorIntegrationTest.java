package org.wso2.carbon.connector.integration.test.zoho.Estimates;
/**
 * Created by sriashalyasrivathsan on 11/26/14.
 */
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;
import javax.activation.DataHandler;
import java.net.URL;
public class EstimatesConnectorIntegrationTest extends ZohoConnectorIntegrationTest {

//getTheListOfEstimates
//Positive test case for mandatory parameters  for getTheListOfEstimates
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfEstimates} integration test")
    public void testListContactsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfEstimates_mandatory.txt";
        String methodName = "zoho_getTheListOfEstimates";
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

//Positive test case for optional parameters for getTheListOfEstimates
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfEstimates} integration test")
    public void testListContactsWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfEstimates_optional.txt";
        String methodName = "zoho_getTheListOfEstimates";
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
            Assert.assertTrue(jsonObject.has("estimates"));
        } finally {
            proxyAdmin.deleteProxy(methodName);
        }
    }

//Negative test case for Positive test case for mandatory parameters  
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfEstimates} integration test")
    public void testListContactsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfEstimates_negative.txt";
        String methodName = "zoho_getTheListOfEstimates";
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

//getDetailOfAnEstimate
//Positive test case for mandatory parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnEstimate} integration test")
    public void testgetDetailOfAnEstimateWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnEstimate_mandatory.txt";
        String methodName = "zoho_getDetailOfAnEstimate";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnEstimate} integration test")
    public void testgetDetailOfAnEstimateWithOptionalparameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnEstimate_optional.txt";
        String methodName = "zoho_getDetailOfAnEstimate";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnEstimate} integration test")
    public void testgetDetailOfAnEstimateWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnEstimate_negative.txt";
        String methodName = "zoho_getDetailOfAnEstimate";
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

//deleteAnExistingEstimate
//Positive test case for mandatory parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingEstimate} integration test")
    public void testdeleteAnExistingEstimateWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingEstimate_mandatory.txt";
        String methodName = "zoho_deleteAnExistingEstimate";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {deleteAnExistingEstimate} integration test")
    public void testdeleteAnExistingEstimateWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingEstimate_negative.txt";
        String methodName = "zoho_deleteAnExistingEstimate";
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

//emailTheEstimate
//Positive test case for mandatory parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {emailTheEstimate} integration test")
    public void testemailTheEstimateWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheEstimate_mandatory.txt";
        String methodName = "zoho_emailTheEstimate";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {emailTheEstimate} integration test")
    public void testemailTheEstimateWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "emailTheEstimate_negative.txt";
        String methodName = "zoho_emailTheEstimate";
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
 //getDetailOfAnEstimateEmailContent
//Positive test case for mandatory parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnEstimateEmailContent} integration test")
    public void testgetDetailOfAnEstimateEmailContentWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnEstimateEmailContent_mandatory.txt";
        String methodName = "zoho_getDetailOfAnEstimateEmailContent";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnEstimateEmailContent} integration test")
    public void testgetDetailOfAnEstimateEmailContentWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnEstimateEmailContent_negative.txt";
        String methodName = "zoho_getDetailOfAnEstimateEmailContent";
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


//UpdateBillingAddress----to format address--
//Positive test case for mandatory parameters 
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {UpdateBillingAddress} integration test")
    public void testUpdateBillingAddressWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateBillingAddress_mandatory.txt";
        String methodName = "zoho_UpdateBillingAddress";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {UpdateBillingAddress} integration test")
    public void testUpdateBillingAddressWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateBillingAddress_negative.txt";
        String methodName = "zoho_UpdateBillingAddress";
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

//UpdateShippingAddress ----to-format of address
//Positive test case for mandatory parameters 

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {UpdateShippingAddress} integration test")
    public void testUpdateShippingAddressWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateShippingAddress_mandatory.txt";
        String methodName = "zoho_UpdateShippingAddress";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {UpdateShippingAddress} integration test")
    public void testUpdateShippingAddressWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateShippingAddress_negative.txt";
        String methodName = "zoho_UpdateShippingAddress";

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

//updateAnExistingEstimate
// Positive test case for mandatory parameters 
    @Test(enabled = true
            , groups = {"wso2.esb"}, description = "zoho {updateAnExistingEstimate} integration test")
    public void testUpdateAnExistingEstimateWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingEstimate_mandatory.txt";
        String methodName = "zoho_updateAnExistingEstimate";

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
    @Test(enabled = false
            , groups = {"wso2.esb"}, description = "zoho {updateAnExistingEstimate} integration test")
    public void testUpdateAnExistingEstimateWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingEstimate_optional.txt";
        String methodName = "zoho_updateAnExistingEstimate";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateAnExistingEstimate} integration test")
    public void testUpdateAnExistingEstimateWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingEstimate_negative.txt";
        String methodName = "zoho_updateAnExistingEstimate";
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

//createANewEstimate
//Positive test case for mandatory parameters 
    @Test(enabled = false
            , groups = {"wso2.esb"}, description = "zoho {createANewEstimate} integration test")
    public void testcreateANewEstimateWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewEstimate_mandatory.txt";
        String methodName = "zoho_createANewEstimate";

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
    @Test(enabled = false
            , groups = {"wso2.esb"}, description = "zoho {createANewEstimate} integration test")
    public void testcreateANewEstimateWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewEstimate_optional.txt";
        String methodName = "zoho_createANewEstimate";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewEstimate} integration test")
    public void testcreateANewEstimateWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewEstimate_negative.txt";
        String methodName = "zoho_createANewEstimate";
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
