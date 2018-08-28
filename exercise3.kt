
fun main(args: Array<String>) {

    val sumFour ={x:Int,y:Int,z:Int,r:Int->x+y+z+r}
    val partialSumFour = sumFour.partialAppliedFunction(1, 2)

    require(partialSumFour(3, 4) == 10)
}

fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).partialAppliedFunction(x:P1,y:P2):(P3,P4)->R{
    return {P3,P4 ->this(x,y,P3,P4)}
}