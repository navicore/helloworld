package com.onextent.helloworld

import org.scalatest.FunSpec
import org.scalatest.concurrent.ScalaFutures

class HelloWorldSpec extends FunSpec with ScalaFutures {

  trait Fixture {
  }

  //test to validate that Context.sc works
  describe("Should Run") {

    new Fixture {
      it("should say something") {
        println("Hello World from Test.")
        assertResult(3) {
          3
        }
      }
    }
  }
}

