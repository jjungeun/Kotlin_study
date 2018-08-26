fun main(args: Array<String>) {

      val product : (a:Int,b:Int) -> Int
      product={a,b->a*b}
      require(product(3, 5) == 15)
      println(product(3,5))

      val appendString : (a:String,b:String,c:String) -> String
      appendString={a,b,c->a+b+c}
      require(appendString("Hello", "Fp", "Kotlin") == "HelloFpKotlin")
}


