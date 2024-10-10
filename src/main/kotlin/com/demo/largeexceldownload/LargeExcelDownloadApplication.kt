package com.demo.largeexceldownload

import jakarta.persistence.EntityManager
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
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

    @GetMapping("/export")
    fun export() : ResponseEntity<StreamingResponseBody> {
        val stream = StreamingResponseBody { out: OutputStream ->
            val msg = "/srb" + " @ " + Instant.now().toString()
            out.write(msg.toByteArray())
        }
        return ResponseEntity(stream, HttpStatus.OK)
    }

    @GetMapping("/excelexport")
    fun excelexport() : ResponseEntity<StreamingResponseBody> {
        val stream = StreamingResponseBody { out: OutputStream ->
            service.export(out)
        }

        return ResponseEntity(stream, HttpStatus.OK)
    }
}

@Service
class AppService(
    private val repository: ProductRepository,
    private val entityManager: EntityManager
) {

    @Transactional(readOnly = true)
    fun export(out: OutputStream) {
        repository.streamAll().use { body ->
            body.forEach { item: Product ->
                val msg = item.sku
                out.write(msg.toByteArray())
                entityManager.detach(item)
            }
        }
    }

}
