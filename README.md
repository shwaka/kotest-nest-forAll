`./gradlew test` will give an output such as:

```
MyTest > foo FAILED
    java.lang.AssertionError: 1 elements passed but expected 3

    The following elements passed:
    foo

    The following elements failed:
    "Bar" => 2 elements passed but expected 3

      The following elements passed:
      a
      r

      The following elements failed:
      'B' => expected:<true> but was:<false>
    "BAz" => 1 elements passed but expected 3

      The following elements passed:
      z

      The following elements failed:
      'B' => expected:<true> but was:<false>
      'A' => expected:<true> but was:<false>
        at com.github.shwaka.kotest.inspectors.ErrorKt.buildAssertionError(error.kt:51)
        at com.github.shwaka.kotest.inspectors.InspectorsKt.forAll(Inspectors.kt:10)
        at MyTest$1$1.invokeSuspend(MyTest.kt:8)
        at MyTest$1$1.invoke(MyTest.kt)

        Caused by:
        java.lang.AssertionError: 1 elements passed but expected 3

        The following elements passed:
        foo

        The following elements failed:
        "Bar" => 2 elements passed but expected 3

          The following elements passed:
          a
          r

          The following elements failed:
          'B' => expected:<true> but was:<false>
        "BAz" => 1 elements passed but expected 3

          The following elements passed:
          z

          The following elements failed:
          'B' => expected:<true> but was:<false>
          'A' => expected:<true> but was:<false>
            at com.github.shwaka.kotest.inspectors.ErrorKt.buildAssertionError(error.kt:51)
            ... 3 more

1 test completed, 1 failed
```
