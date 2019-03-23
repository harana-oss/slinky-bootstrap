package com.harana.slinky.bootstrap.panel_toggle

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/PanelToggle", "PanelToggle")
@js.native
object ReactPanelToggle extends js.Object

@react object PanelToggle extends ExternalComponent {

  case class Props(componentClass: Option[js.Any] = None)

  override val component = ReactPanelToggle
}