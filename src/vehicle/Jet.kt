package vehicle

class Jet() : Vehicle() {
    init {
        setGoAlgo(GoByFlyingFastAlgorithm())
    }
}