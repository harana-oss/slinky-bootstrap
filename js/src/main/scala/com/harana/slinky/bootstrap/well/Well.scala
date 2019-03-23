package com.harana.slinky.bootstrap.well

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Well", "Well")
@js.native
object ReactWell extends js.Object

@react object Well extends ExternalComponent {

  case class Props(bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactWell
}