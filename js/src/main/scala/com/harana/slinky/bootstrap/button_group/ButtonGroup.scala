package com.harana.slinky.bootstrap.button_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ButtonGroup", "ButtonGroup")
@js.native
object ReactButtonGroup extends js.Object

@react object ButtonGroup extends ExternalComponent {

  case class Props(vertical: Option[Boolean] = None,
                   justified: Option[Boolean] = None,
                   block: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactButtonGroup
}