import com.typesafe.scalalogging._

object HelloWorld extends App{
	override def main(args:Array[String]):Unit = {
		println("HelloWorld")
		val logger = Logger(("name"))
		logger.debug("HelloWorld")
		logger.info("helloWorld")
	}
}
