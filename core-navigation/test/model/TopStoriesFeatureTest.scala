package model

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{ GivenWhenThen, FeatureSpec }
import test.`package`._

class TopStoriesFeatureTest extends FeatureSpec with GivenWhenThen with ShouldMatchers {

  feature("Latest top stories") {

    scenario("Shows latest links when on a page in the UK edition") {

      given("I am on any page in the UK edition")
      HtmlUnit("/top-stories") {
        browser =>
          import browser._

          then("I should see the top stories for the UK edition")
          and("there should be 10 links")
          $("li").size should be > 1

      }
    }

    scenario("Shows latest links for a section in US edition") {
      given("I am on any page in the US edition")
      HtmlUnit.US("/top-stories") {
        browser =>
          import browser._

          then("I should see the top stories for the US edition")
          and("there should be 10 links")
          $("li").size should be > 1
      }
    }
  }
}

