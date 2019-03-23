package com.harana.slinky.bootstrap.panel_body

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/PanelBody", "PanelBody")
@js.native
object ReactPanelBody extends js.Object

@react object PanelBody extends ExternalComponent {

  case class Props(collapsible: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactPanelBody
}