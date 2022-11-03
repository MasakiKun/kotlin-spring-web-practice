package kr.ayukawa.kotlinweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
https://examples.javacodegeeks.com/getting-started-with-kotlin-and-spring-boot/
위 문서 보고 따라해봄

다만, @SpringBootApplication 어노테이션을 붙이면 코틀린 클래스는 상속이 안된다면서 컴파일 오류가 발생하는데
이것때문에 Kotlin-all-open 플러그인을 추가했음에도 컴파일이 되지 않았다(build.gradle 파일의 plugins 영역 참고).
해서 메인 어플리케이션 클래스에 open 지시자를 붙여서 상속 가능 클래스로 표시했다.
 */

@SpringBootApplication
open class KotlinWebApplication

fun main(args: Array<String>) {
	runApplication<KotlinWebApplication>(*args);
}
