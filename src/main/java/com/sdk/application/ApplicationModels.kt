package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: Media
*/
@Parcelize
data class Media(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: ProductListingActionPage?=null
): Parcelable

/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null
): Parcelable

/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    @SerializedName("error")
    var error: String?=null
): Parcelable

/*
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    @SerializedName("count")
    var count: Int?=null
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Double?=null
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    @SerializedName("marked")
    var marked: Price?=null,
    @SerializedName("effective")
    var effective: Price?=null
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null
): Parcelable

/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null
): Parcelable

/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    @SerializedName("level")
    var level: String?=null,
    @SerializedName("strategy")
    var strategy: String?=null
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilter>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponse>?=null
): Parcelable

/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null
): Parcelable

/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
): Parcelable

/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
): Parcelable

/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@Parcelize
data class ProductFrequentlyComparedSimilarResponse(
    
    @SerializedName("similars")
    var similars: ArrayList<ProductCompareResponse>?=null
): Parcelable

/*
    Model: ProductSimilarItem
*/
@Parcelize
data class ProductSimilarItem(
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
): Parcelable

/*
    Model: SimilarProductByTypeResponse
*/
@Parcelize
data class SimilarProductByTypeResponse(
    
    @SerializedName("similars")
    var similars: ArrayList<ProductSimilarItem>?=null
): Parcelable

/*
    Model: ProductVariantItemResponse
*/
@Parcelize
data class ProductVariantItemResponse(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    @SerializedName("display_type")
    var displayType: String?=null,
    @SerializedName("header")
    var header: String?=null
): Parcelable

/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantResponse>?=null
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("company")
    var company: CompanyDetail?=null
): Parcelable

/*
    Model: ProductStockStatusResponse
*/
@Parcelize
data class ProductStockStatusResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
): Parcelable

/*
    Model: ProductStockPolling
*/
@Parcelize
data class ProductStockPolling(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
): Parcelable

/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null
): Parcelable

/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("kind")
    var kind: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    @SerializedName("landscape")
    var landscape: Media?=null,
    @SerializedName("portrait")
    var portrait: Media?=null
): Parcelable

/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null
): Parcelable

/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    @SerializedName("department")
    var department: String?=null,
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null
): Parcelable

/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null,
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null
): Parcelable

/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null
): Parcelable

/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
): Parcelable

/*
    Model: PageQuery
*/
@Parcelize
data class PageQuery(
    
    @SerializedName("category")
    var category: ArrayList<String>?=null,
    @SerializedName("brand")
    var brand: ArrayList<String>?=null
): Parcelable

/*
    Model: AutocompletePage
*/
@Parcelize
data class AutocompletePage(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: PageQuery?=null
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: AutocompletePage?=null
): Parcelable

/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("action")
    var action: Action?=null
): Parcelable

/*
    Model: AutoCompleteResponse
*/
@Parcelize
data class AutoCompleteResponse(
    
    @SerializedName("items")
    var items: ArrayList<AutocompleteItem>?=null
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: FollowerCountResponse
*/
@Parcelize
data class FollowerCountResponse(
    
    @SerializedName("count")
    var count: Int?=null
): Parcelable

/*
    Model: FollowIdsData
*/
@Parcelize
data class FollowIdsData(
    
    @SerializedName("products")
    var products: ArrayList<Int>?=null,
    @SerializedName("collections")
    var collections: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
): Parcelable

/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    @SerializedName("data")
    var data: FollowIdsData?=null
): Parcelable

/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null
): Parcelable

/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<Store1>?=null
): Parcelable



/*
    Model: Image
*/
@Parcelize
data class Image(
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
): Parcelable

/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
): Parcelable

/*
    Model: ProductAction
*/
@Parcelize
data class ProductAction(
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    @SerializedName("action")
    var action: ProductAction?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    @SerializedName("selling")
    var selling: Double?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("add_on")
    var addOn: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null
): Parcelable

/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    @SerializedName("base")
    var base: ProductPrice?=null,
    @SerializedName("converted")
    var converted: ProductPrice?=null
): Parcelable

/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
): Parcelable

/*
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    @SerializedName("identifier")
    var identifier: String?=null
): Parcelable

/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("effective")
    var effective: Double?=null
): Parcelable

/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    @SerializedName("base")
    var base: BasePrice?=null,
    @SerializedName("converted")
    var converted: BasePrice?=null
): Parcelable

/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("store")
    var store: BaseInfo?=null,
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size")
    var size: String?=null
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    @SerializedName("product")
    var product: Product?=null,
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article")
    var article: ProductArticle?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("discount")
    var discount: String?=null
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("applicable")
    var applicable: Double?=null,
    @SerializedName("description")
    var description: String?=null
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("coupon")
    var coupon: Double?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null
): Parcelable

/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    @SerializedName("raw")
    var raw: RawBreakup?=null
): Parcelable

/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    @SerializedName("symbol")
    var symbol: String?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    @SerializedName("min")
    var min: String?=null,
    @SerializedName("max")
    var max: String?=null
): Parcelable

/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
): Parcelable

/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null,
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null
): Parcelable

/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_size")
    var itemSize: String?=null
): Parcelable

/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
): Parcelable

/*
    Model: AddCartResponse
*/
@Parcelize
data class AddCartResponse(
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_size")
    var itemSize: String?=null
): Parcelable

/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    @SerializedName("operation")
    var operation: String?=null
): Parcelable

/*
    Model: UpdateCartResponse
*/
@Parcelize
data class UpdateCartResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: CartItemCountResponse
*/
@Parcelize
data class CartItemCountResponse(
    
    @SerializedName("user_cart_items_count")
    var userCartItemsCount: Int?=null
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null
): Parcelable

/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("total")
    var total: Int?=null
): Parcelable

/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null,
    @SerializedName("page")
    var page: PageCoupon?=null
): Parcelable

/*
    Model: ApplyCouponRequest
*/
@Parcelize
data class ApplyCouponRequest(
    
    @SerializedName("coupon_code")
    var couponCode: String?=null
): Parcelable

/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("effective")
    var effective: Int?=null
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("best")
    var best: Boolean?=null,
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("total")
    var total: Double?=null
): Parcelable

/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    @SerializedName("seller")
    var seller: OfferSeller?=null,
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null
): Parcelable

/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    @SerializedName("data")
    var data: ArrayList<BulkPriceOffer>?=null
): Parcelable

/*
    Model: GeoLocation
*/
@Parcelize
data class GeoLocation(
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("latitude")
    var latitude: Double?=null
): Parcelable

/*
    Model: Address
*/
@Parcelize
data class Address(
    
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null
): Parcelable

/*
    Model: GetAddressesResponse
*/
@Parcelize
data class GetAddressesResponse(
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null
): Parcelable

/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
): Parcelable

/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
): Parcelable

/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
): Parcelable

/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("address_id")
    var addressId: String?=null
): Parcelable

/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null
): Parcelable

/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("valid")
    var valid: Boolean?=null,
    @SerializedName("discount")
    var discount: Double?=null
): Parcelable

/*
    Model: PaymentUpdate
*/
@Parcelize
data class PaymentUpdate(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("box_type")
    var boxType: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("shipments")
    var shipments: Int?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("cart")
    var cart: CheckCart?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("comment")
    var comment: String?=null
): Parcelable

/*
    Model: CartMetaResponse
*/
@Parcelize
data class CartMetaResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: CartMetaMissingResponse
*/
@Parcelize
data class CartMetaMissingResponse(
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null
): Parcelable

/*
    Model: GetShareCartLinkRequest
*/
@Parcelize
data class GetShareCartLinkRequest(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetShareCartLinkResponse
*/
@Parcelize
data class GetShareCartLinkResponse(
    
    @SerializedName("share_url")
    var shareUrl: String?=null,
    @SerializedName("token")
    var token: String?=null
): Parcelable

/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null
): Parcelable

/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
): Parcelable

/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("cart")
    var cart: SharedCart?=null
): Parcelable



/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@Parcelize
data class SendVerificationLinkMobileRequestSchema(
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("primary")
    var primary: Boolean?=null
): Parcelable

/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null
): Parcelable

/*
    Model: EditProfileRequestSchema
*/
@Parcelize
data class EditProfileRequestSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("dob")
    var dob: String?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("android_hash")
    var androidHash: String?=null,
    @SerializedName("sender")
    var sender: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: SendEmailOtpRequestSchema
*/
@Parcelize
data class SendEmailOtpRequestSchema(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: VerifyOtpRequestSchema
*/
@Parcelize
data class VerifyOtpRequestSchema(
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("otp")
    var otp: String?=null
): Parcelable

/*
    Model: SendMobileOtpRequestSchema
*/
@Parcelize
data class SendMobileOtpRequestSchema(
    
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("android_hash")
    var androidHash: String?=null,
    @SerializedName("force")
    var force: String?=null
): Parcelable

/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    @SerializedName("new_password")
    var newPassword: String?=null
): Parcelable

/*
    Model: FormRegisterRequestSchema
*/
@Parcelize
data class FormRegisterRequestSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("phone")
    var phone: FormRegisterRequestSchemaPhone?=null,
    @SerializedName("register_token")
    var registerToken: String?=null
): Parcelable

/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    @SerializedName("token")
    var token: String?=null
): Parcelable

/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("password")
    var password: String?=null
): Parcelable

/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("password")
    var password: String?=null,
    @SerializedName("username")
    var username: String?=null
): Parcelable

/*
    Model: SendOtpRequestSchema
*/
@Parcelize
data class SendOtpRequestSchema(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
): Parcelable

/*
    Model: OAuthRequestSchema
*/
@Parcelize
data class OAuthRequestSchema(
    
    @SerializedName("is_signed_in")
    var isSignedIn: Boolean?=null,
    @SerializedName("oauth2")
    var oauth2: OAuthRequestSchemaOauth2?=null,
    @SerializedName("profile")
    var profile: OAuthRequestSchemaProfile?=null
): Parcelable

/*
    Model: AuthSuccess
*/
@Parcelize
data class AuthSuccess(
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    @SerializedName("user")
    var user: AuthSuccessUser?=null
): Parcelable

/*
    Model: SendOtpResponse
*/
@Parcelize
data class SendOtpResponse(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null
): Parcelable

/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
): Parcelable

/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    @SerializedName("result")
    var result: Boolean?=null
): Parcelable

/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    @SerializedName("logout")
    var logout: Boolean?=null
): Parcelable

/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    @SerializedName("resend_token")
    var resendToken: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
): Parcelable

/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    @SerializedName("resend_token")
    var resendToken: String?=null
): Parcelable

/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
): Parcelable

/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
): Parcelable

/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
): Parcelable

/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
): Parcelable

/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
): Parcelable

/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
): Parcelable

/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
): Parcelable

/*
    Model: PaginationSchema
*/
@Parcelize
data class PaginationSchema(
    
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("current")
    var current: Int?=null
): Parcelable

/*
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
): Parcelable

/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: ProfileEditSuccessSchema
*/
@Parcelize
data class ProfileEditSuccessSchema(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    @SerializedName("user")
    var user: String?=null,
    @SerializedName("register_token")
    var registerToken: String?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
): Parcelable

/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
): Parcelable

/*
    Model: OAuthRequestSchemaOauth2
*/
@Parcelize
data class OAuthRequestSchemaOauth2(
    
    @SerializedName("access_token")
    var accessToken: String?=null,
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("refresh_token")
    var refreshToken: String?=null
): Parcelable

/*
    Model: OAuthRequestSchemaProfile
*/
@Parcelize
data class OAuthRequestSchemaProfile(
    
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("full_name")
    var fullName: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null
): Parcelable

/*
    Model: AuthSuccessUser
*/
@Parcelize
data class AuthSuccessUser(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("debug")
    var debug: AuthSuccessUserDebug?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("emails")
    var emails: AuthSuccessUserEmails?=null
): Parcelable

/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    @SerializedName("platform")
    var platform: String?=null
): Parcelable

/*
    Model: AuthSuccessUserEmails
*/
@Parcelize
data class AuthSuccessUserEmails(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("look_and_feel")
    var lookAndFeel: LookAndFeel?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    @SerializedName("login")
    var login: Login?=null,
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: Meta?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("social")
    var social: Social?=null,
    @SerializedName("required_fields")
    var requiredFields: RequiredFields?=null,
    @SerializedName("register_required_fields")
    var registerRequiredFields: RegisterRequiredFields?=null,
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    @SerializedName("flash_card")
    var flashCard: FlashCard?=null,
    @SerializedName("subtext")
    var subtext: String?=null,
    @SerializedName("social_tokens")
    var socialTokens: SocialTokens?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("register")
    var register: Boolean?=null
): Parcelable

/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
): Parcelable

/*
    Model: Login
*/
@Parcelize
data class Login(
    
    @SerializedName("password")
    var password: Boolean?=null,
    @SerializedName("otp")
    var otp: Boolean?=null
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
): Parcelable

/*
    Model: Social
*/
@Parcelize
data class Social(
    
    @SerializedName("account_kit")
    var accountKit: Boolean?=null,
    @SerializedName("facebook")
    var facebook: Boolean?=null,
    @SerializedName("google")
    var google: Boolean?=null
): Parcelable

/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    @SerializedName("email")
    var email: Email?=null,
    @SerializedName("mobile")
    var mobile: Mobile?=null
): Parcelable

/*
    Model: Email
*/
@Parcelize
data class Email(
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
): Parcelable

/*
    Model: Mobile
*/
@Parcelize
data class Mobile(
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
): Parcelable

/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
): Parcelable

/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
): Parcelable

/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
): Parcelable

/*
    Model: FlashCard
*/
@Parcelize
data class FlashCard(
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("text_color")
    var textColor: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
): Parcelable

/*
    Model: SocialTokens
*/
@Parcelize
data class SocialTokens(
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("account_kit")
    var accountKit: Accountkit?=null,
    @SerializedName("google")
    var google: Google?=null
): Parcelable

/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    @SerializedName("app_id")
    var appId: String?=null
): Parcelable

/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    @SerializedName("app_id")
    var appId: String?=null
): Parcelable

/*
    Model: Google
*/
@Parcelize
data class Google(
    
    @SerializedName("app_id")
    var appId: String?=null
): Parcelable

/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone_numbers")
    var phoneNumbers: PhoneNumbers?=null,
    @SerializedName("emails")
    var emails: Emails?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("account_type")
    var accountType: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("debug")
    var debug: Debug?=null,
    @SerializedName("has_old_password_hash")
    var hasOldPasswordHash: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null
): Parcelable

/*
    Model: PhoneNumbers
*/
@Parcelize
data class PhoneNumbers(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("country_code")
    var countryCode: Int?=null
): Parcelable

/*
    Model: Emails
*/
@Parcelize
data class Emails(
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("platform")
    var platform: String?=null
): Parcelable



/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: StartResponse
*/
@Parcelize
data class StartResponse(
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null
): Parcelable

/*
    Model: StartRequest
*/
@Parcelize
data class StartRequest(
    
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: CompleteResponse
*/
@Parcelize
data class CompleteResponse(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("file_name")
    var fileName: String?=null,
    @SerializedName("file_path")
    var filePath: String?=null,
    @SerializedName("content_type")
    var contentType: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("operation")
    var operation: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("upload")
    var upload: Upload?=null,
    @SerializedName("cdn")
    var cdn: CDN?=null,
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable



/*
    Model: OrderById
*/
@Parcelize
data class OrderById(
    
    @SerializedName("order")
    var order: OrderSchema?=null
): Parcelable

/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    @SerializedName("orders")
    var orders: ArrayList<OrderSchema>?=null,
    @SerializedName("page")
    var page: OrderPage?=null
): Parcelable

/*
    Model: OrderPage
*/
@Parcelize
data class OrderPage(
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
): Parcelable

/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    @SerializedName("shipment")
    var shipment: Shipments?=null
): Parcelable

/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reasons>?=null
): Parcelable

/*
    Model: ShipmentStatusUpdateBody
*/
@Parcelize
data class ShipmentStatusUpdateBody(
    
    @SerializedName("shipments")
    var shipments: Shipments?=null,
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    @SerializedName("task")
    var task: Boolean?=null
): Parcelable

/*
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    @SerializedName("enable_can_return")
    var enableCanReturn: Boolean?=null,
    @SerializedName("payment_mode_source")
    var paymentModeSource: String?=null,
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    @SerializedName("track_url")
    var trackUrl: String?=null,
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<TrackingDetails>?=null,
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("prices")
    var prices: Prices?=null,
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    @SerializedName("items")
    var items: ArrayList<ProductItems>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("invoice")
    var invoice: Invoice?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("promise")
    var promise: Promise?=null,
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    @SerializedName("total_items")
    var totalItems: Int?=null,
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("payment_logo")
    var paymentLogo: String?=null,
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    @SerializedName("user_info")
    var userInfo: ShipmentUserInfo?=null,
    @SerializedName("meta")
    var meta: ShipmentMeta?=null
): Parcelable

/*
    Model: ShipmentId
*/
@Parcelize
data class ShipmentId(
    
    @SerializedName("status_update")
    var statusUpdate: StatusUpdate?=null,
    @SerializedName("message")
    var message: @RawValue ArrayList<Any>?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("status")
    var status: Boolean?=null
): Parcelable

/*
    Model: StatusUpdate
*/
@Parcelize
data class StatusUpdate(
    
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: ShipmentStatusUpdate
*/
@Parcelize
data class ShipmentStatusUpdate(
    
    @SerializedName("shipments")
    var shipments: Shipments?=null
): Parcelable

/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    @SerializedName("results")
    var results: ArrayList<Track>?=null
): Parcelable

/*
    Model: OrderSchema
*/
@Parcelize
data class OrderSchema(
    
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    @SerializedName("user_info")
    var userInfo: UserInfo?=null
): Parcelable

/*
    Model: PosOrderById
*/
@Parcelize
data class PosOrderById(
    
    @SerializedName("order")
    var order: OrderSchema?=null
): Parcelable

/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    @SerializedName("item")
    var item: Item?=null,
    @SerializedName("prices")
    var prices: Prices?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    @SerializedName("bag_status")
    var bagStatus: BagStatus?=null,
    @SerializedName("dates")
    var dates: Dates?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("status")
    var status: Status?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("financial_breakup")
    var financialBreakup: FinancialBreakup?=null,
    @SerializedName("reasons")
    var reasons: Reasons?=null,
    @SerializedName("article")
    var article: Article?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("current_operational_status")
    var currentOperationalStatus: CurrentOperationalStatus?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("brand")
    var brand: Brand?=null,
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    @SerializedName("gst_details")
    var gstDetails: GstDetails?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("bag_update_time")
    var bagUpdateTime: Int?=null
): Parcelable

/*
    Model: Item
*/
@Parcelize
data class Item(
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("attributes")
    var attributes: Attributes?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null
): Parcelable

/*
    Model: Attributes
*/
@Parcelize
data class Attributes(
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
): Parcelable

/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null
): Parcelable

/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null
): Parcelable

/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null
): Parcelable

/*
    Model: BagStatus
*/
@Parcelize
data class BagStatus(
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStatusBagStateMapper?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
): Parcelable

/*
    Model: BagStatusBagStateMapper
*/
@Parcelize
data class BagStatusBagStateMapper(
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
): Parcelable

/*
    Model: Dates
*/
@Parcelize
data class Dates(
    
    @SerializedName("order_created")
    var orderCreated: String?=null
): Parcelable

/*
    Model: Status
*/
@Parcelize
data class Status(
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
): Parcelable

/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("item_name")
    var itemName: String?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null
): Parcelable

/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    @SerializedName("ean")
    var ean: String?=null,
    @SerializedName("sku_code")
    var skuCode: String?=null
): Parcelable

/*
    Model: Reasons
*/
@Parcelize
data class Reasons(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("reason_text")
    var reasonText: String?=null,
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null,
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    @SerializedName("flow")
    var flow: String?=null,
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    @SerializedName("priority")
    var priority: Int?=null
): Parcelable

/*
    Model: Article
*/
@Parcelize
data class Article(
    
    @SerializedName("esp_modified")
    var espModified: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("identifiers")
    var identifiers: ArticleIdentifiers?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: ArticleIdentifiers
*/
@Parcelize
data class ArticleIdentifiers(
    
    @SerializedName("ean")
    var ean: String?=null,
    @SerializedName("sku_code")
    var skuCode: String?=null
): Parcelable

/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    @SerializedName("time")
    var time: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("returnable")
    var returnable: Boolean?=null
): Parcelable

/*
    Model: CurrentOperationalStatus
*/
@Parcelize
data class CurrentOperationalStatus(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("reasons")
    var reasons: CurrentOperationalStatusReasons?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: CurrentOperationalStatusBagStateMapper?=null
): Parcelable

/*
    Model: CurrentOperationalStatusReasons
*/
@Parcelize
data class CurrentOperationalStatusReasons(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
): Parcelable

/*
    Model: CurrentOperationalStatusBagStateMapper
*/
@Parcelize
data class CurrentOperationalStatusBagStateMapper(
    
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null
): Parcelable

/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Int?=null,
    @SerializedName("employee_discount")
    var employeeDiscount: Int?=null
): Parcelable

/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null,
    @SerializedName("fynd")
    var fynd: Fynd?=null,
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    @SerializedName("employee_discount")
    var employeeDiscount: Int?=null,
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Int?=null
): Parcelable

/*
    Model: Fynd
*/
@Parcelize
data class Fynd(
    
    @SerializedName("fulfilment_identifier")
    var fulfilmentIdentifier: String?=null
): Parcelable

/*
    Model: GstDetails
*/
@Parcelize
data class GstDetails(
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null
): Parcelable

/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("name")
    var name: String?=null
): Parcelable

/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("latitude")
    var latitude: Int?=null,
    @SerializedName("longitude")
    var longitude: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null
): Parcelable

/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddressJson?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("brand_store_tags")
    var brandStoreTags: @RawValue ArrayList<Any>?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("meta")
    var meta: Meta?=null,
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("login_username")
    var loginUsername: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
): Parcelable

/*
    Model: StoreAddressJson
*/
@Parcelize
data class StoreAddressJson(
    
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("longitude")
    var longitude: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("latitude")
    var latitude: Int?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null
): Parcelable

/*
    Model: AdditionalContactDetails
*/
@Parcelize
data class AdditionalContactDetails(
    
    @SerializedName("number")
    var number: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: Timing
*/
@Parcelize
data class Timing(
    
    @SerializedName("opening")
    var opening: Opening?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: Closing?=null
): Parcelable

/*
    Model: Opening
*/
@Parcelize
data class Opening(
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
): Parcelable

/*
    Model: Closing
*/
@Parcelize
data class Closing(
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
): Parcelable

/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    @SerializedName("gst")
    var gst: Gst?=null
): Parcelable

/*
    Model: Gst
*/
@Parcelize
data class Gst(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    @SerializedName("label_url")
    var labelUrl: String?=null
): Parcelable

/*
    Model: ProductItems
*/
@Parcelize
data class ProductItems(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("attributes")
    var attributes: Attributes?=null
): Parcelable

/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null,
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    @SerializedName("dp_options")
    var dpOptions: DpOptions?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    @SerializedName("dp_id")
    var dpId: String?=null,
    @SerializedName("weight")
    var weight: Int?=null,
    @SerializedName("formatted")
    var formatted: Formatted?=null,
    @SerializedName("debug_info")
    var debugInfo: DebugInfo?=null,
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    @SerializedName("packaging_name")
    var packagingName: String?=null
): Parcelable

/*
    Model: Timestamp
*/
@Parcelize
data class Timestamp(
    
    @SerializedName("max")
    var max: String?=null,
    @SerializedName("min")
    var min: String?=null
): Parcelable

/*
    Model: DpOptions
*/
@Parcelize
data class DpOptions(
    
    @SerializedName("dp_option_id")
    var dpOptionId: DpOptionId?=null
): Parcelable

/*
    Model: DpOptionId
*/
@Parcelize
data class DpOptionId(
    
    @SerializedName("f_priority")
    var fPriority: Int?=null,
    @SerializedName("operations")
    var operations: String?=null,
    @SerializedName("r_priority")
    var rPriority: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null
): Parcelable

/*
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    @SerializedName("max")
    var max: String?=null,
    @SerializedName("min")
    var min: String?=null
): Parcelable

/*
    Model: DebugInfo
*/
@Parcelize
data class DebugInfo(
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
): Parcelable

/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null
): Parcelable

/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("hex_code")
    var hexCode: Int?=null
): Parcelable

/*
    Model: ShipmentUserInfo
*/
@Parcelize
data class ShipmentUserInfo(
    
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null
): Parcelable

/*
    Model: Track
*/
@Parcelize
data class Track(
    
    @SerializedName("awb")
    var awb: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    @SerializedName("account_name")
    var accountName: String?=null
): Parcelable

/*
    Model: TrackingDetails
*/
@Parcelize
data class TrackingDetails(
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("time")
    var time: String?=null,
    @SerializedName("is_passed")
    var isPassed: String?=null
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null
): Parcelable

/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    @SerializedName("message")
    var message: String?=null
): Parcelable



/*
    Model: Access
*/
@Parcelize
data class Access(
    
    @SerializedName("answer")
    var answer: Boolean?=null,
    @SerializedName("ask_question")
    var askQuestion: Boolean?=null,
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("rnr")
    var rnr: Boolean?=null
): Parcelable

/*
    Model: AddMediaListRequest
*/
@Parcelize
data class AddMediaListRequest(
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_list")
    var mediaList: ArrayList<AddMediaRequest>?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: AddMediaRequest
*/
@Parcelize
data class AddMediaRequest(
    
    @SerializedName("cloud_id")
    var cloudId: String?=null,
    @SerializedName("cloud_name")
    var cloudName: String?=null,
    @SerializedName("cloud_provider")
    var cloudProvider: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_url")
    var mediaUrl: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("thumbnail_url")
    var thumbnailUrl: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Attribute
*/
@Parcelize
data class Attribute(
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<TagMeta>?=null
): Parcelable

/*
    Model: AttributeObject
*/
@Parcelize
data class AttributeObject(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: CheckEligibilityResponse
*/
@Parcelize
data class CheckEligibilityResponse(
    
    @SerializedName("access")
    var access: Access?=null,
    @SerializedName("media_cloud")
    var mediaCloud: MediaCloud?=null
): Parcelable

/*
    Model: Cloud
*/
@Parcelize
data class Cloud(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("provider")
    var provider: String?=null
): Parcelable

/*
    Model: CommentRequest
*/
@Parcelize
data class CommentRequest(
    
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null
): Parcelable

/*
    Model: CreateQNARequest
*/
@Parcelize
data class CreateQNARequest(
    
    @SerializedName("choices")
    var choices: ArrayList<String>?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("max_len")
    var maxLen: Int?=null,
    @SerializedName("sort_priority")
    var sortPriority: Int?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: DeviceMeta
*/
@Parcelize
data class DeviceMeta(
    
    @SerializedName("app_version")
    var appVersion: String?=null,
    @SerializedName("platform")
    var platform: String?=null
): Parcelable

/*
    Model: MediaCloud
*/
@Parcelize
data class MediaCloud(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("secret")
    var secret: String?=null
): Parcelable

/*
    Model: MediaMeta
*/
@Parcelize
data class MediaMeta(
    
    @SerializedName("cloud")
    var cloud: Cloud?=null,
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: Url?=null
): Parcelable

/*
    Model: PageCursor
*/
@Parcelize
data class PageCursor(
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: PageNumber
*/
@Parcelize
data class PageNumber(
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ReportAbuseRequest
*/
@Parcelize
data class ReportAbuseRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null
): Parcelable

/*
    Model: SaveAttributeRequest
*/
@Parcelize
data class SaveAttributeRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: TagMeta
*/
@Parcelize
data class TagMeta(
    
    @SerializedName("media")
    var media: ArrayList<MediaMeta>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: UpdateAbuseStatusRequest
*/
@Parcelize
data class UpdateAbuseStatusRequest(
    
    @SerializedName("abusive")
    var abusive: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: UpdateAttributeRequest
*/
@Parcelize
data class UpdateAttributeRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: UpdateCommentRequest
*/
@Parcelize
data class UpdateCommentRequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: UpdateMediaListRequest
*/
@Parcelize
data class UpdateMediaListRequest(
    
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("ids")
    var ids: ArrayList<String>?=null
): Parcelable

/*
    Model: UpdateQNARequest
*/
@Parcelize
data class UpdateQNARequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("choices")
    var choices: ArrayList<String>?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: UpdateReviewRequest
*/
@Parcelize
data class UpdateReviewRequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("attributes_rating")
    var attributesRating: ArrayList<AttributeObject>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("device_meta")
    var deviceMeta: DeviceMeta?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_resource")
    var mediaResource: ArrayList<MediaMeta>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("review_id")
    var reviewId: String?=null,
    @SerializedName("template_id")
    var templateId: String?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: UpdateVoteRequest
*/
@Parcelize
data class UpdateVoteRequest(
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: Url
*/
@Parcelize
data class Url(
    
    @SerializedName("main")
    var main: String?=null,
    @SerializedName("thumbnail")
    var thumbnail: String?=null
): Parcelable

/*
    Model: VoteRequest
*/
@Parcelize
data class VoteRequest(
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: XCursorGetResponse
*/
@Parcelize
data class XCursorGetResponse(
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: PageCursor?=null
): Parcelable

/*
    Model: XInsertResponse
*/
@Parcelize
data class XInsertResponse(
    
    @SerializedName("ids")
    var ids: String?=null
): Parcelable

/*
    Model: XNumberGetResponse
*/
@Parcelize
data class XNumberGetResponse(
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: PageNumber?=null
): Parcelable

/*
    Model: XUpdateResponse
*/
@Parcelize
data class XUpdateResponse(
    
    @SerializedName("id")
    var id: String?=null
): Parcelable



/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article_uid")
    var articleUid: String?=null
): Parcelable

/*
    Model: UpdateCartShipmentRequest
*/
@Parcelize
data class UpdateCartShipmentRequest(
    
    @SerializedName("shipments")
    var shipments: ArrayList<UpdateCartShipmentItem>?=null
): Parcelable

/*
    Model: Files
*/
@Parcelize
data class Files(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("values")
    var values: ArrayList<String>?=null
): Parcelable

/*
    Model: CartPosCheckoutRequest
*/
@Parcelize
data class CartPosCheckoutRequest(
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("files")
    var files: Files?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CartDeliveryModesResponse
*/
@Parcelize
data class CartDeliveryModesResponse(
    
    @SerializedName("pickup_stores")
    var pickupStores: ArrayList<Int>?=null,
    @SerializedName("available_modes")
    var availableModes: ArrayList<String>?=null
): Parcelable

/*
    Model: PickupStoreDetail
*/
@Parcelize
data class PickupStoreDetail(
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null
): Parcelable

/*
    Model: StoreDetailsResponse
*/
@Parcelize
data class StoreDetailsResponse(
    
    @SerializedName("items")
    var items: ArrayList<PickupStoreDetail>?=null
): Parcelable



/*
    Model: GetPincodeCityResponse
*/
@Parcelize
data class GetPincodeCityResponse(
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<Data>?=null
): Parcelable

/*
    Model: Data
*/
@Parcelize
data class Data(
    
    @SerializedName("meta")
    var meta: LogisticMeta?=null,
    @SerializedName("parents")
    var parents: ArrayList<Parents>?=null,
    @SerializedName("sub_type")
    var subType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("error")
    var error: Error?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
): Parcelable

/*
    Model: LogisticMeta
*/
@Parcelize
data class LogisticMeta(
    
    @SerializedName("zone")
    var zone: String?=null,
    @SerializedName("deliverables")
    var deliverables: @RawValue ArrayList<Any>?=null
): Parcelable

/*
    Model: Parents
*/
@Parcelize
data class Parents(
    
    @SerializedName("sub_type")
    var subType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("uid")
    var uid: String?=null
): Parcelable

/*
    Model: Error
*/
@Parcelize
data class Error(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: GetTatProductReqBody
*/
@Parcelize
data class GetTatProductReqBody(
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("journey")
    var journey: String?=null
): Parcelable

/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    @SerializedName("articles")
    var articles: Articles?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
): Parcelable

/*
    Model: Articles
*/
@Parcelize
data class Articles(
    
    @SerializedName("error")
    var error: Error?=null,
    @SerializedName("category")
    var category: Category?=null,
    @SerializedName("promise")
    var promise: LogisticPromise?=null
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("level")
    var level: String?=null
): Parcelable

/*
    Model: LogisticPromise
*/
@Parcelize
data class LogisticPromise(
    
    @SerializedName("timestamp")
    var timestamp: LogisticTimestamp?=null,
    @SerializedName("formatted")
    var formatted: Formatted?=null
): Parcelable

/*
    Model: LogisticTimestamp
*/
@Parcelize
data class LogisticTimestamp(
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
): Parcelable

/*
    Model: GetTatProductResponse
*/
@Parcelize
data class GetTatProductResponse(
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    @SerializedName("error")
    var error: Error?=null,
    @SerializedName("to_city")
    var toCity: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("journey")
    var journey: String?=null
): Parcelable

