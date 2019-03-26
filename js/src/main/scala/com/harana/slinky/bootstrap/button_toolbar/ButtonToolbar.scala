package com.harana.slinky.bootstrap.button_toolbar

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ButtonToolbar", JSImport.Default)
@js.native
object ReactButtonToolbar extends js.Object

@react object ButtonToolbar extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactButtonToolbar
}