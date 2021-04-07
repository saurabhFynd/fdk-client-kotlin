package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val content by lazy { ContentDataManagerClass(config)}
    
    val billing by lazy { BillingDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val order by lazy { OrderDataManagerClass(config)}
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config)}
    
    val share by lazy { ShareDataManagerClass(config)}
    
    val inventory by lazy { InventoryDataManagerClass(config)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    val marketplaces by lazy { MarketplacesDataManagerClass(config)}
    
    val rewards by lazy { RewardsDataManagerClass(config)}
    
    val analytics by lazy { AnalyticsDataManagerClass(config)}
    
    val discount by lazy { DiscountDataManagerClass(config)}
    
    fun application(applicationId:String): ApplicationClient {
        return ApplicationClient(applicationId = applicationId,config = config)
    }

    inner class ApplicationClient(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { this@PlatformClient.lead.ApplicationClient(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.ApplicationClient(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.ApplicationClient(applicationId,config)}
    
    val content by lazy { this@PlatformClient.content.ApplicationClient(applicationId,config)}
    
    val billing by lazy { this@PlatformClient.billing.ApplicationClient(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.ApplicationClient(applicationId,config)}
    
    val order by lazy { this@PlatformClient.order.ApplicationClient(applicationId,config)}
    
    val catalog by lazy { this@PlatformClient.catalog.ApplicationClient(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.ApplicationClient(applicationId,config)}
    
    val share by lazy { this@PlatformClient.share.ApplicationClient(applicationId,config)}
    
    val inventory by lazy { this@PlatformClient.inventory.ApplicationClient(applicationId,config)}
    
    val configuration by lazy { this@PlatformClient.configuration.ApplicationClient(applicationId,config)}
    
    val cart by lazy { this@PlatformClient.cart.ApplicationClient(applicationId,config)}
    
    val marketplaces by lazy { this@PlatformClient.marketplaces.ApplicationClient(applicationId,config)}
    
    val rewards by lazy { this@PlatformClient.rewards.ApplicationClient(applicationId,config)}
    
    val analytics by lazy { this@PlatformClient.analytics.ApplicationClient(applicationId,config)}
    
    val discount by lazy { this@PlatformClient.discount.ApplicationClient(applicationId,config)}
    
    }

}