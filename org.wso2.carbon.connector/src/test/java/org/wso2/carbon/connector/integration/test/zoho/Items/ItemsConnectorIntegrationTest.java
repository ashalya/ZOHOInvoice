package org.wso2.carbon.connector.integration.test.zoho.Items;
/**
 * Created by sriashalyasrivathsan on 12/4/14.
 */
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;
import javax.activation.DataHandler;
import java.net.URL;

public class ItemsConnectorIntegrationTest extends ZohoConnectorIntegrationTest {
//getTheListOfItems
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfItems} integration test")
    public void testgetTheListOfItemsWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfItems_mandatory.txt";
        String methodName = "zoho_getTheListOfItems";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfItems} integration test")
    public void testgetTheListOfItemsWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfItems_optional.txt";
        String methodName = "zoho_getTheListOfItems";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {getTheListOfItems} integration test")
    public void testgetTheListOfItemsWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfItems_negative.txt";
        String methodName = "zoho_getTheListOfItems";
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

//getADetailOfAnItem
// mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getADetailOfAnItem} integration test")
    public void testgetADetailOfAnItemWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getADetailOfAnItem_mandatory.txt";
        String methodName = "zoho_getADetailOfAnItem";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {getADetailOfAnItem} integration test")
    public void testgetADetailOfAnItemWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getADetailOfAnItem_negative.txt";
        String methodName = "zoho_getADetailOfAnItem";
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

//createANewItem---if you want to run again change the name of an item
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewItem} integration test")
    public void testcreateANewItemWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewItem_mandatory.txt";
        String methodName = "zoho_createANewItem";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewItem} integration test")
    public void testcreateANewItemWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewItem_optional.txt";
        String methodName = "zoho_createANewItem";
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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {createANewItem} integration test")
    public void testcreateANewItemWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "createANewItem_negative.txt";
        String methodName = "zoho_createANewItem";
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


//updateAnExistingItem
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateAnExistingItem} integration test")
    public void testupdateAnExistingItemWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingItem_mandatory.txt";
        String methodName = "zoho_updateAnExistingItem";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {updateAnExistingItem} integration test")
    public void testupdateAnExistingItemWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingItem_optional.txt";
        String methodName = "zoho_updateAnExistingItem";
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
    @Test(enabled =false, groups = {"wso2.esb"}, description = "zoho {updateAnExistingItem} integration test")
    public void testupdateAnExistingItemWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "updateAnExistingItem_negative.txt";
        String methodName = "zoho_updateAnExistingItem";
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


//deleteAnExistingItem
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingItem} integration test")
    public void testdeleteAnExistingItemWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingItem_mandatory.txt";
        String methodName = "zoho_deleteAnExistingItem";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingItem} integration test")
    public void testdeleteAnExistingItemWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingItem_negative.txt";
        String methodName = "zoho_deleteAnExistingItem";

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



}
