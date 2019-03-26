package com.harana.slinky.bootstrap.panel_title

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PanelTitle", JSImport.Default)
@js.native
object ReactPanelTitle extends js.Object

@react object PanelTitle extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   toggle: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactPanelTitle
}