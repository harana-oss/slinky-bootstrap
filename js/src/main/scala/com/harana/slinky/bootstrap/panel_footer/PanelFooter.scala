package com.harana.slinky.bootstrap.panel_footer

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PanelFooter", JSImport.Default)
@js.native
object ReactPanelFooter extends js.Object

@react object PanelFooter extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactPanelFooter
}