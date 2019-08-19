package vehicle

class RealJet {
    private var jet : Jet = Jet()

    fun go(){
        jet.setGoAlgo(GoByDrivingAlgrorithm())
        jet.go()

        jet.setGoAlgo(GoByFlyingFastAlgorithm())
        jet.go()

        jet.setGoAlgo(GoByDrivingAlgrorithm())
        jet.go()
    }
}