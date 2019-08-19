package vehicle

abstract class Vehicle() {
    private var goAlgorithm : GoAlgorithm? = null

    fun setGoAlgo(goAlgorithm: GoAlgorithm){
        this.goAlgorithm = goAlgorithm
    }

    fun go(){
        goAlgorithm!!.go()
    }
}