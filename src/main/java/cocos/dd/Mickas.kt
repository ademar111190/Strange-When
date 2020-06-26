package cocos.dd

class Mickas {

    fun bark1(beagle: Beagle) = when (beagle) {
        Beagle.Tricolor -> println("Au au")
    }

    fun bark2(beagle: Beagle) {
        when (beagle) {
            Beagle.Tricolor -> println("Au au")
        }
    }

}
