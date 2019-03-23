package com.harana.slinky.bootstrap.panel_heading

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PanelHeading", "PanelHeading")
@js.native
object ReactPanelHeading extends js.Object

@react object PanelHeading extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactPanelHeading
}