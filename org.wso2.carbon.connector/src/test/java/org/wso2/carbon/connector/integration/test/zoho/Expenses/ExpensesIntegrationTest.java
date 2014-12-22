package org.wso2.carbon.connector.integration.test.zoho.Expenses;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.connector.integration.test.common.ConnectorIntegrationUtil;
import org.wso2.carbon.connector.integration.test.zoho.ZohoConnectorIntegrationTest;
import javax.activation.DataHandler;
import java.net.URL;

/**
 * Created by sriashalyasrivathsan on 12/10/14.
 */
public class ExpensesIntegrationTest extends ZohoConnectorIntegrationTest {

//getTheListOfExpenses
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfExpenses} integration test")
    public void testgetTheListOfExpensesWithRequiredParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfExpenses_mandatory.txt";
        String methodName = "zoho_getTheListOfExpenses";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfExpenses} integration test")
    public void testgetTheListOfExpensesWithOptionalParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfExpenses_optional.txt";
        String methodName = "zoho_getTheListOfExpenses";
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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getTheListOfExpenses} integration test")
    public void testgetTheListOfExpensesWithNegativeParameters() throws Exception {
        String jsonRequestFilePath = pathToRequestsDirectory + "getTheListOfExpenses_negative.txt";
        String methodName = "zoho_getTheListOfExpenses";
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


//getDetailOfAnExpense
//mandatory parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnExpense} integration test")
    public void testgetDetailOfAnExpenseWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnExpense_mandatory.txt";
        String methodName = "zoho_getDetailOfAnExpense";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getDetailOfAnExpense} integration test")
    public void testgetDetailOfAnExpenseWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getDetailOfAnExpense_negative.txt";
        String methodName = "zoho_getDetailOfAnExpense";

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


//createANewExpense
    

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewExpense} integration test")
    public void testcreateANewExpenseWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewExpense_mandatory.txt";
        String methodName = "zoho_createANewExpense";

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

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {createANewExpense} integration test")
    public void testcreateANewExpenseWithOptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewExpense_optional.txt";
        String methodName = "zoho_createANewExpense";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {createANewExpense} integration test")
    public void testcreateANewExpenseWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "createANewExpense_negative.txt";
        String methodName = "zoho_createANewExpense";

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

//UpdateExistingExpenses

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {UpdateExistingExpenses} integration test")
    public void testUpdateExistingExpensesWithMandatoryParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateExistingExpenses_mandatory.txt";
        String methodName = "zoho_UpdateExistingExpenses";

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

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {UpdateExistingExpenses} integration test")
    public void testUpdateExistingExpensesWithOptionalParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateExistingExpenses_optional.txt";
        String methodName = "zoho_UpdateExistingExpenses";

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
    @Test(enabled = false   , groups = {"wso2.esb"}, description = "zoho {UpdateExistingExpenses} integration test")
    public void testUpdateExistingExpensesWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "UpdateExistingExpenses_negative.txt";
        String methodName = "zoho_UpdateExistingExpenses";

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


 //deleteAnExistingExpense

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingExpense} integration test")
    public void testdeleteAnExistingExpenseWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingExpense_mandatory.txt";
        String methodName = "zoho_deleteAnExistingExpense";

        final String jsonString = ConnectorIntegrationUtil.getFileContent(jsonRequestFilePath);
        final String proxyFilePath = "file:///" + pathToProxiesDirectory + methodName + ".xml";
        String modifiedJsonString = String.format(jsonString,
                zohoConnectorProperties.getProperty("authtoken")
        );
        proxyAdmin.addProxyService(new DataHandler(new URL(proxyFilePath)));


        try {


            int responseHeader = ConnectorIntegrationUtil.sendRequestToRetriveHeaders(getProxyServiceURL(methodName), modifiedJsonString);
            Assert.assertTrue(responseHeader == 200);



        } finally {
            proxyAdmin.deleteProxy(methodName);
        }

    }

    //negative parameters
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {deleteAnExistingExpense} integration test")
    public void testdeleteAnExistingExpenseWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "deleteAnExistingExpense_negative.txt";
        String methodName = "zoho_deleteAnExistingExpense";

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



    //getListOfExpenseCommentsAndHistory

//mandatory parameters

    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfExpenseCommentsAndHistory} integration test")
    public void testgetListOfExpenseCommentsAndHistoryWithRequiredParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfExpenseCommentsAndHistory_mandatory.txt";
        String methodName = "zoho_getListOfExpenseCommentsAndHistory";

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
    @Test(enabled = false, groups = {"wso2.esb"}, description = "zoho {getListOfExpenseCommentsAndHistory} integration test")
    public void testgetListOfExpenseCommentsAndHistoryWithNegativeParameters() throws Exception {

        String jsonRequestFilePath = pathToRequestsDirectory + "getListOfExpenseCommentsAndHistory_negative.txt";
        String methodName = "zoho_getListOfExpenseCommentsAndHistory";

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
