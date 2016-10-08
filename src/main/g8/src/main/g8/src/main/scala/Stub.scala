import com.typesafe.scalalogging._

object HellWorld extend App{
	def main(args:Array[String]):Unit = {
		println("HelloWorld")
		val logger = Logger(LoggerFactory.getLogger("name"))
		logger.debug("HelloWorld")
	}
}
