package com.example.batch.employee

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.batch.item.ItemWriter

class EmployeeBatchWriter : ItemWriter<Employee> {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    override fun write(items: List<Employee>) {
        logger.info("Console item writer starts Chuck")
        for (item in items) {
            logger.info(item.toString())
        }
        logger.info("Console item writer ends Chuck")
    }
}