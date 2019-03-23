package com.harana.slinky.bootstrap.panel_collapse

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/PanelCollapse", "PanelCollapse")
@js.native
object ReactPanelCollapse extends js.Object

@react object PanelCollapse extends ExternalComponent {

  case class Props(onEnter: Option[() => Unit] = None,
                   onEntering: Option[() => Unit] = None,
                   onEntered: Option[() => Unit] = None,
                   onExit: Option[() => Unit] = None,
                   onExiting: Option[() => Unit] = None,
                   onExited: Option[() => Unit] = None,
                   bsClass: Option[String] = None)

  override val component = ReactPanelCollapse
}