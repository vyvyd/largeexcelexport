package com.demo.largeexceldownload

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
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
class WebController {

    @GetMapping("/export")
    fun export() : ResponseEntity<StreamingResponseBody> {
        val stream = StreamingResponseBody { out: OutputStream ->
            val msg = "/srb" + " @ " + Instant.now().toString()
            out.write(msg.toByteArray())
        }
        return ResponseEntity(stream, HttpStatus.OK)
    }
}
