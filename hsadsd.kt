fun main() {
    var first = Fraction(2, 5)
    var second = Fraction(4,6)
    println(first.multiplyFractions(second))
    println(first == second)
    println(first.divideFractions(second))
    println(first.additionFractions(second))
}

interface FractionMaths{
    fun multiplyFractions(other: Any?): Any?
    fun divideFractions(other: Any?): Any?
    fun additionFractions(other:Any?): Any?
}

open class Fraction(var numerator: Int, var denominator: Int): FractionMaths {
    override fun additionFractions(other: Any?): Any? {
        if (other is Fraction){
            var anumerator = denominator * other.denominator/denominator*numerator + denominator * other.denominator/other.denominator*other.numerator
            var adenominator = denominator * other.denominator
            return Fraction(anumerator,adenominator)
        }
        return Fraction(numerator,denominator)
    }
    override fun divideFractions(other: Any?): Any? {
        if (other is Fraction){
            val anumerator = numerator * other.denominator
            val adenominator = denominator * other.numerator
            return Fraction(anumerator,adenominator)
        }
        return Fraction(numerator,denominator)
    }
    override fun toString(): String {
        return "$numerator / $denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction)
            if (numerator * other.denominator == other.numerator * denominator) {
                return true
            }
        return false
    }

    override fun multiplyFractions(other: Any?): Any? {
        if (other is Fraction) {
            val anumerator = numerator * other.numerator
            val adenominator = denominator * other.denominator
            return Fraction(anumerator, adenominator)
        }
        return Fraction(numerator, denominator)
    }
}

//შეკვეცაზე გავიჭედე ამიტომაც მიმატება ასე დავწერე ¯\_(ツ)_/¯
