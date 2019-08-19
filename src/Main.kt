import vehicle.Helicopter
import vehicle.Jet
import vehicle.RealJet
import vehicle.StreetRacer
import java.sql.Driver

class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
//            StreetRacer().go()
//            Helicopter().go()
//            Jet().go()
            RealJet().go()
        }
    }
}