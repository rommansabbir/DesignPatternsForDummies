package vehicle

class Helicopter() : Vehicle() {
    init {
        setGoAlgo(GoByFlyingAlgorithm())
    }
}