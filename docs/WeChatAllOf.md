

# WeChatAllOf

To configure a WeChat integration, browse to the Develop section of the [WeChat dashboard](https://mp.weixin.qq.com/) and add the following IP addresses to the whitelist, separated by new lines. This must be done before calling the Create Integration endpoint. * 34.224.190.28 * 52.6.201.31 * 52.0.232.16 * 34.246.106.80 * 34.246.57.194 From the same page, acquire the WeChat App ID and App Secret from the customer and call the Create Integration endpoint. In their [WeChat dashboard](https://mp.weixin.qq.com/), the customer must set the \"URL\" field to https://app.smooch.io/api/wechat/webhooks/{smoochAppId}/{smoochIntegrationId}, and set the “Token” field to the value of the webhookSecret found in the response to the call to the Create Integration endpoint. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** | WeChat App ID. | 
**appSecret** | **Boolean** | WeChat App Secret. | 
**encodingAesKey** | **String** | AES Encoding Key. |  [optional]



