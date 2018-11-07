/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cybersource.authsdk.core.MerchantConfig;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;
import Model.OctCreatePaymentRequest;

public class ProcessAPayoutApi {
    private ApiClient apiClient;

    public ProcessAPayoutApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProcessAPayoutApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for octCreatePayment
     * @param octCreatePaymentRequest  (required)
     * @param merchantConfig  (merchant details)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call octCreatePaymentCall(OctCreatePaymentRequest octCreatePaymentRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = octCreatePaymentRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payouts/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call octCreatePaymentValidateBeforeCall(OctCreatePaymentRequest octCreatePaymentRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'octCreatePaymentRequest' is set
        if (octCreatePaymentRequest == null) {
            throw new ApiException("Missing the required parameter 'octCreatePaymentRequest' when calling octCreatePayment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = octCreatePaymentCall(octCreatePaymentRequest, merchantConfig, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process a Payout
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @param merchantConfig  (merchant details)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void octCreatePayment(OctCreatePaymentRequest octCreatePaymentRequest,MerchantConfig merchantConfig) throws ApiException {
        octCreatePaymentWithHttpInfo(octCreatePaymentRequest, merchantConfig);
    }

    /**
     * Process a Payout
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @param merchantConfig  (merchant details)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> octCreatePaymentWithHttpInfo(OctCreatePaymentRequest octCreatePaymentRequest,MerchantConfig merchantConfig) throws ApiException {
        com.squareup.okhttp.Call call = octCreatePaymentValidateBeforeCall(octCreatePaymentRequest, merchantConfig, null, null);
        return apiClient.execute(call);
    }

    /**
     * Process a Payout (asynchronously)
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @param merchantConfig  (merchant details)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call octCreatePaymentAsync(OctCreatePaymentRequest octCreatePaymentRequest,MerchantConfig merchantConfig, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = octCreatePaymentValidateBeforeCall(octCreatePaymentRequest, merchantConfig, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}