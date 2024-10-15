package com.demo.largeexceldownload

import jakarta.persistence.EntityManager
import jakarta.servlet.http.HttpServletResponse
import org.dhatim.fastexcel.Workbook
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody
import java.io.OutputStream
import java.time.Instant

@SpringBootApplication
class LargeExcelDownloadApplication

fun main(args: Array<String>) {
    runApplication<LargeExcelDownloadApplication>(*args)
}

@Controller
class WebController(
    private val service: AppService
) {

    @GetMapping("/excelexport")
    fun excelexport(response: HttpServletResponse) : StreamingResponseBody {
        return StreamingResponseBody { out: OutputStream ->
            service.excelExport(response, out)
        }
    }
}

@Service
class AppService(
    private val repository: ProductRepository,
    private val entityManager: EntityManager
) {

    @Transactional(readOnly = true)
    fun excelExport(response: HttpServletResponse, out: OutputStream) {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=\"data.xlsx\"");

        Workbook(out, "test", "1.0").use { workbook ->
            val sheet = workbook.newWorksheet("Data")

            // Create the header row
            sheet.value(0,0, "SKU")

            var rowIndex = 1
            repository.streamAll(PageRequest.ofSize(50000)).use { body ->
                body.forEach { item: Product ->
                    sheet.value(rowIndex, 0, item.sku)
                    sheet.value(rowIndex, 1, item.id)
                    sheet.value(rowIndex, 2, item.productName)
                    sheet.value(rowIndex, 3, item.description)
                    sheet.value(rowIndex, 4, item.price)
                    sheet.value(rowIndex, 5, item.stockQuantity)
                    sheet.value(rowIndex, 6, item.category)
                    sheet.value(rowIndex, 7, item.manufacturer)
                    sheet.value(rowIndex, 8, item.weight)
                    sheet.value(rowIndex, 9, item.dimensions)
                    sheet.value(rowIndex, 10, item.color)
                    sheet.value(rowIndex, 11, item.material)
                    sheet.value(rowIndex, 12, item.sku)
                    sheet.value(rowIndex, 13, item.barcode)
                    sheet.value(rowIndex, 14, item.supplierId)
                    sheet.value(rowIndex, 15, item.brand)
                    sheet.value(rowIndex, 16, item.releaseDate)
                    sheet.value(rowIndex, 17, item.expirationDate)
                    sheet.value(rowIndex, 18, item.createdAt)
                    sheet.value(rowIndex, 19, item.updatedAt)
                    sheet.value(rowIndex, 20, item.discontinued)
                    sheet.value(rowIndex, 21, item.warrantyPeriod)
                    sheet.value(rowIndex, 22, item.returnable)
                    sheet.value(rowIndex, 23, item.recyclable)
                    sheet.value(rowIndex, 24, item.energyRating)
                    sheet.value(rowIndex, 25, item.countryOfOrigin)
                    sheet.value(rowIndex, 26, item.shippingWeight)
                    sheet.value(rowIndex, 27, item.packageDimensions)
                    sheet.value(rowIndex, 28, item.maxTemperature)
                    sheet.value(rowIndex, 29, item.minTemperature)
                    sheet.value(rowIndex, 30, item.certifications)
                    sheet.value(rowIndex, 31, item.hazardousMaterial)
                    sheet.value(rowIndex, 32, item.batteryLifeHours)
                    sheet.value(rowIndex, 33, item.powerSource)
                    sheet.value(rowIndex, 34, item.voltage)
                    sheet.value(rowIndex, 35, item.amperage)
                    sheet.value(rowIndex, 36, item.frequency)
                    sheet.value(rowIndex, 37, item.connectivity)
                    sheet.value(rowIndex, 38, item.wireless)
                    sheet.value(rowIndex, 39, item.bluetooth)
                    sheet.value(rowIndex, 40, item.warrantyTerms)
                    sheet.value(rowIndex, 41, item.careInstructions)
                    sheet.value(rowIndex, 42, item.cleaningInstructions)
                    sheet.value(rowIndex, 43, item.packagingType)
                    sheet.value(rowIndex, 44, item.recyclablePackaging)
                    sheet.value(rowIndex, 45, item.waterResistant)
                    sheet.value(rowIndex, 46, item.waterproof)
                    sheet.value(rowIndex, 47, item.shockResistant)
                    sheet.value(rowIndex, 48, item.assemblyRequired)
                    sheet.value(rowIndex, 49, item.assemblyInstructions)
                    sheet.value(rowIndex, 50, item.userManual)
                    sheet.value(rowIndex, 51, item.safetyInstructions)
                    sheet.value(rowIndex, 52, item.ageRestriction)
                    sheet.value(rowIndex, 53, item.customerRating)
                    sheet.value(rowIndex, 54, item.numberOfReviews)
                    sheet.value(rowIndex, 55, item.averageReviewScore)
                    sheet.value(rowIndex, 56, item.productUrl)
                    sheet.value(rowIndex, 57, item.videoUrl)
                    sheet.value(rowIndex, 58, item.imageUrl)
                    sheet.value(rowIndex, 59, item.thumbnailUrl)
                    sheet.value(rowIndex, 60, item.promotionalText)
                    sheet.value(rowIndex, 61, item.discountPercentage)
                    sheet.value(rowIndex, 62, item.saleStartDate)
                    sheet.value(rowIndex, 63, item.saleEndDate)
                    sheet.value(rowIndex, 64, item.maxOrderQuantity)
                    sheet.value(rowIndex, 65, item.minOrderQuantity)
                    sheet.value(rowIndex, 66, item.leadTimeDays)
                    sheet.value(rowIndex, 67, item.backorderAllowed)
                    sheet.value(rowIndex, 68, item.restockDate)
                    sheet.value(rowIndex, 69, item.restockQuantity)
                    sheet.value(rowIndex, 70, item.productWeight)
                    sheet.value(rowIndex, 71, item.shippingClass)
                    sheet.value(rowIndex, 72, item.fulfillmentCenter)
                    sheet.value(rowIndex, 73, item.productCondition)
                    sheet.value(rowIndex, 74, item.refurbished)
                    sheet.value(rowIndex, 75, item.used)
                    sheet.value(rowIndex, 76, item.limitedEdition)
                    sheet.value(rowIndex, 77, item.giftWrapAvailable)
                    sheet.value(rowIndex, 78, item.giftMessageAvailable)
                    sheet.value(rowIndex, 79, item.subscriptionAvailable)
                    sheet.value(rowIndex, 80, item.subscriptionInterval)
                    sheet.value(rowIndex, 81, item.subscriptionPrice)
                    sheet.value(rowIndex, 82, item.customizabilityOptions)
                    sheet.value(rowIndex, 83, item.seasonal)
                    sheet.value(rowIndex, 84, item.ecoFriendly)
                    sheet.value(rowIndex, 85, item.carbonFootprint)
                    sheet.value(rowIndex, 86, item.timeToAssembleMinutes)
                    sheet.value(rowIndex, 87, item.digitalDownload)
                    sheet.value(rowIndex, 88, item.licenseKey)
                    sheet.value(rowIndex, 89, item.operatingSystemsSupported)
                    sheet.value(rowIndex, 90, item.compatibleWith)
                    sheet.value(rowIndex, 91, item.languagesSupported)
                    sheet.value(rowIndex, 92, item.updateFrequency)
                    sheet.value(rowIndex, 93, item.availableLanguages)
                    sheet.value(rowIndex, 94, item.digitalRightsManagement)
                    sheet.value(rowIndex, 95, item.upcCode)
                    sheet.value(rowIndex, 96, item.eanCode)
                    sheet.value(rowIndex, 97, item.mpnCode)
                    sheet.value(rowIndex, 98, item.isbnCode)
                    sheet.value(rowIndex, 99, item.modelNumber)

                    entityManager.detach(item)
                    sheet.flush()

                    rowIndex += 1
                    if (rowIndex % 100 == 0) {
                        Thread.sleep(100)
                    }
                }
            }
        }
    }

}
