package com.demo.largeexceldownload

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.LocalDate

@Entity
@Table(name = "Product")
data class Product(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name = "id")
    val id: Long = 0,

    @Column(name = "product_name", nullable = false)
    val productName: String,

    @Column(name = "description", nullable = true)
    val description: String? = null,

    @Column(name = "price", nullable = false)
    val price: BigDecimal,

    @Column(name = "stock_quantity", nullable = false)
    val stockQuantity: Int,

    @Column(name = "category", nullable = false)
    val category: String,

    @Column(name = "manufacturer", nullable = true)
    val manufacturer: String? = null,

    @Column(name = "weight", nullable = true)
    val weight: BigDecimal? = null,

    @Column(name = "dimensions", nullable = true)
    val dimensions: String? = null,

    @Column(name = "color", nullable = true)
    val color: String? = null,

    @Column(name = "material", nullable = true)
    val material: String? = null,

    @Column(name = "sku", nullable = false)
    val sku: String,

    @Column(name = "barcode", nullable = true)
    val barcode: String? = null,

    @Column(name = "supplier_id", nullable = true)
    val supplierId: Int? = null,

    @Column(name = "brand", nullable = true)
    val brand: String? = null,

    @Column(name = "release_date", nullable = true)
    val releaseDate: LocalDate? = null,

    @Column(name = "expiration_date", nullable = true)
    val expirationDate: LocalDate? = null,

    @Column(name = "created_at", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "discontinued", nullable = false)
    val discontinued: Boolean = false,

    @Column(name = "warranty_period", nullable = true)
    val warrantyPeriod: Int? = null,

    @Column(name = "returnable", nullable = false)
    val returnable: Boolean = true,

    @Column(name = "recyclable", nullable = true)
    val recyclable: Boolean? = null,

    @Column(name = "energy_rating", nullable = true)
    val energyRating: String? = null,

    @Column(name = "country_of_origin", nullable = true)
    val countryOfOrigin: String? = null,

    @Column(name = "shipping_weight", nullable = true)
    val shippingWeight: BigDecimal? = null,

    @Column(name = "package_dimensions", nullable = true)
    val packageDimensions: String? = null,

    @Column(name = "max_temperature", nullable = true)
    val maxTemperature: BigDecimal? = null,

    @Column(name = "min_temperature", nullable = true)
    val minTemperature: BigDecimal? = null,

    @Column(name = "certifications", nullable = true)
    val certifications: String? = null,

    @Column(name = "hazardous_material", nullable = true)
    val hazardousMaterial: Boolean? = null,

    @Column(name = "battery_life_hours", nullable = true)
    val batteryLifeHours: BigDecimal? = null,

    @Column(name = "power_source", nullable = true)
    val powerSource: String? = null,

    @Column(name = "voltage", nullable = true)
    val voltage: BigDecimal? = null,

    @Column(name = "amperage", nullable = true)
    val amperage: BigDecimal? = null,

    @Column(name = "frequency", nullable = true)
    val frequency: BigDecimal? = null,

    @Column(name = "connectivity", nullable = true)
    val connectivity: String? = null,

    @Column(name = "wireless", nullable = true)
    val wireless: Boolean? = null,

    @Column(name = "bluetooth", nullable = true)
    val bluetooth: Boolean? = null,

    @Column(name = "warranty_terms", nullable = true)
    val warrantyTerms: String? = null,

    @Column(name = "care_instructions", nullable = true)
    val careInstructions: String? = null,

    @Column(name = "cleaning_instructions", nullable = true)
    val cleaningInstructions: String? = null,

    @Column(name = "packaging_type", nullable = true)
    val packagingType: String? = null,

    @Column(name = "recyclable_packaging", nullable = true)
    val recyclablePackaging: Boolean? = null,

    @Column(name = "water_resistant", nullable = true)
    val waterResistant: Boolean? = null,

    @Column(name = "waterproof", nullable = true)
    val waterproof: Boolean? = null,

    @Column(name = "shock_resistant", nullable = true)
    val shockResistant: Boolean? = null,

    @Column(name = "assembly_required", nullable = true)
    val assemblyRequired: Boolean? = null,

    @Column(name = "assembly_instructions", nullable = true)
    val assemblyInstructions: String? = null,

    @Column(name = "user_manual", nullable = true)
    val userManual: String? = null,

    @Column(name = "safety_instructions", nullable = true)
    val safetyInstructions: String? = null,

    @Column(name = "age_restriction", nullable = true)
    val ageRestriction: Int? = null,

    @Column(name = "customer_rating", nullable = true)
    val customerRating: BigDecimal? = null,

    @Column(name = "number_of_reviews", nullable = true)
    val numberOfReviews: Int? = null,

    @Column(name = "average_review_score", nullable = true)
    val averageReviewScore: BigDecimal? = null,

    @Column(name = "product_url", nullable = true)
    val productUrl: String? = null,

    @Column(name = "video_url", nullable = true)
    val videoUrl: String? = null,

    @Column(name = "image_url", nullable = true)
    val imageUrl: String? = null,

    @Column(name = "thumbnail_url", nullable = true)
    val thumbnailUrl: String? = null,

    @Column(name = "promotional_text", nullable = true)
    val promotionalText: String? = null,

    @Column(name = "discount_percentage", nullable = true)
    val discountPercentage: BigDecimal? = null,

    @Column(name = "sale_start_date", nullable = true)
    val saleStartDate: LocalDate? = null,

    @Column(name = "sale_end_date", nullable = true)
    val saleEndDate: LocalDate? = null,

    @Column(name = "max_order_quantity", nullable = true)
    val maxOrderQuantity: Int? = null,

    @Column(name = "min_order_quantity", nullable = true)
    val minOrderQuantity: Int? = null,

    @Column(name = "lead_time_days", nullable = true)
    val leadTimeDays: Int? = null,

    @Column(name = "backorder_allowed", nullable = true)
    val backorderAllowed: Boolean? = null,

    @Column(name = "restock_date", nullable = true)
    val restockDate: LocalDate? = null,

    @Column(name = "restock_quantity", nullable = true)
    val restockQuantity: Int? = null,

    @Column(name = "product_weight", nullable = true)
    val productWeight: BigDecimal? = null,

    @Column(name = "shipping_class", nullable = true)
    val shippingClass: String? = null,

    @Column(name = "fulfillment_center", nullable = true)
    val fulfillmentCenter: String? = null,

    @Column(name = "product_condition", nullable = true)
    val productCondition: String? = null,

    @Column(name = "refurbished", nullable = true)
    val refurbished: Boolean? = null,

    @Column(name = "used", nullable = true)
    val used: Boolean? = null,

    @Column(name = "limited_edition", nullable = true)
    val limitedEdition: Boolean? = null,

    @Column(name = "gift_wrap_available", nullable = true)
    val giftWrapAvailable: Boolean? = null,

    @Column(name = "gift_message_available", nullable = true)
    val giftMessageAvailable: Boolean? = null,

    @Column(name = "subscription_available", nullable = true)
    val subscriptionAvailable: Boolean? = null,

    @Column(name = "subscription_interval", nullable = true)
    val subscriptionInterval: Int? = null,

    @Column(name = "subscription_price", nullable = true)
    val subscriptionPrice: BigDecimal? = null,

    @Column(name = "customizability_options", nullable = true)
    val customizabilityOptions: String? = null,

    @Column(name = "seasonal", nullable = true)
    val seasonal: Boolean? = null,

    @Column(name = "eco_friendly", nullable = true)
    val ecoFriendly: Boolean? = null,

    @Column(name = "carbon_footprint", nullable = true)
    val carbonFootprint: BigDecimal? = null,

    @Column(name = "time_to_assemble_minutes", nullable = true)
    val timeToAssembleMinutes: Int? = null,

    @Column(name = "digital_download", nullable = true)
    val digitalDownload: Boolean? = null,

    @Column(name = "license_key", nullable = true)
    val licenseKey: String? = null,

    @Column(name = "operating_systems_supported", nullable = true)
    val operatingSystemsSupported: String? = null,

    @Column(name = "compatible_with", nullable = true)
    val compatibleWith: String? = null,

    @Column(name = "languages_supported", nullable = true)
    val languagesSupported: String? = null,

    @Column(name = "update_frequency", nullable = true)
    val updateFrequency: String? = null,

    @Column(name = "available_languages", nullable = true)
    val availableLanguages: String? = null,

    @Column(name = "digital_rights_management", nullable = true)
    val digitalRightsManagement: String? = null,

    @Column(name = "upc_code", nullable = true)
    val upcCode: String? = null,

    @Column(name = "ean_code", nullable = true)
    val eanCode: String? = null,

    @Column(name = "mpn_code", nullable = true)
    val mpnCode: String? = null,

    @Column(name = "isbn_code", nullable = true)
    val isbnCode: String? = null,

    @Column(name = "model_number", nullable = true)
    val modelNumber: String? = null
)
