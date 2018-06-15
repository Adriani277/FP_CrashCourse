import FP_CrashCourse.Test1
import org.scalatest.{MustMatchers, WordSpec}


class Testcase1 extends WordSpec with MustMatchers {

  val testClass = new Test1

  "doubleList" must {
    "return empty list when given empty list" in {
      testClass.doubleList(List()) must be(List())
    }
    "return doubled list when give populated list" in {
      testClass.doubleList(List(1, 2, 3)) must be(List(2, 4, 6))
    }
  }

  "sumList" must {
    "return zero list when given empty list" in {
      testClass.sumList(List()) must be(0)
    }

    "return sum of list when given populated list" in {
      testClass.sumList(List(1, 2, 3, 5, 8)) must be(19)
    }
  }

  "sumWithValue" must {
    "return zero when given 0 and empty list" in {
      testClass.sumWithValue(0, List()) must be(0)
    }

    "return sum of list plus given value" in {
      testClass.sumWithValue(5, List(2, 2, 1)) must be(10)
    }
  }

  "listCreator" must {
    "return empty list when given size 0" in {
      testClass.listCreator(0) must be(List())
    }

    "return list of size 5 when given 5" in {
      testClass.listCreator(5) must be(List(1, 2, 3, 4, 5))
    }
  }

  "filterList" must {
    "return empty list if passed list is empty" in {
      testClass.filterList(List(), a => a > 5) must be(List())
    }

    "return list with values greater than 5" in {
      testClass.filterList(List(1, 2, 6, 7), a => a > 5) must be(List(6,7))
    }
  }

  "sortList" must {
    "return empty list when given an empty list" in {
      testClass.sortList(List.empty[Int], (a, b) => a < b) must be(List())
    }

    "return sorted ascending list when given populated list" in {
      testClass.sortList(List(3,2,1,4), (a, b) => a < b) must be(List(1,2,3,4))
    }

    "return sorted descending list when given populated list" in {
      testClass.sortList(List(3,2,1,4), (a, b) => a > b) must be(List(4,3,2,1))
    }
  }

}
