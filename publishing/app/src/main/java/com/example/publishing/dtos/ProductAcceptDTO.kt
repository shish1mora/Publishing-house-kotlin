package com.example.publishing.dtos

import com.example.publishinghousekotlin.models.TypeProduct
import java.io.Serializable
import java.math.BigDecimal


data class ProductAcceptDTO(
    val id: Long,
    val name: String,
    val username: String,
    val userEmail: String,
    val cost: BigDecimal,
    val typeProduct: TypeProduct?,
    val productMaterialDTOS: List<ProductMaterialDTO>?,
    val countProductsInBookingDTOS: List<CountProductsInBookingDTO>?,
    val photos: List<String>?
):Serializable{
    constructor(): this(0, "", "", "", BigDecimal(0), null, null, null,null)
}