package kr.ayukawa.kotlinweb.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import java.util.UUID

@Controller
class HelloWorldController {

	private val logger = LoggerFactory.getLogger(this.javaClass.name);

	@RequestMapping(value=["/"], method=[RequestMethod.GET])
	@ResponseBody
	fun home() : String = "OK";

	@RequestMapping(value=["/Welcome/{name}"], method=[RequestMethod.GET])
	fun greet(@PathVariable(value="name") name: String): ResponseEntity<GreetResponse> {
		logger.info("welcome req. incoming...")

		val resp = GreetResponse(UUID.randomUUID(), message="Hello, $name");

		return ResponseEntity.ok(resp);
	}

}

data class GreetResponse(
	val id: UUID,
	val message: String
)