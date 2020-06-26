package cocos.dd

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class DifferentBehaviour {

    @Mock lateinit var beagle: Beagle

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun bark1() {
        Mickas().bark1(beagle)
    }

    @Test
    fun bark2() {
        Mickas().bark2(beagle)
    }

}
