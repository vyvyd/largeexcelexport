package com.demo.largeexceldownload

import jakarta.persistence.QueryHint
import org.hibernate.jpa.QueryHints.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.QueryHints
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface ProductRepository : JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p")
    @QueryHints(value = [
        QueryHint(name = HINT_FETCH_SIZE, value = "10"),
        QueryHint(name = HINT_CACHEABLE, value = "false"),
        QueryHint(name = HINT_READONLY, value = "true"),
    ])
    fun streamAll(): Stream<Product>

}