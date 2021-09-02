import com.github.shwaka.kotest.inspectors.forAll
import io.kotest.core.spec.style.FreeSpec
// import io.kotest.inspectors.forAll
import io.kotest.matchers.booleans.shouldBeTrue

class MyTest : FreeSpec({
    "foo" {
        listOf("foo", "Bar", "BAz").forAll { string ->
            string.toList().forAll { char ->
                char.isLowerCase().shouldBeTrue()
            }
        }
    }
})
