package com.harana.slinky.bootstrap.tab_pane

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/TabPane", "TabPane")
@js.native
object ReactTabPane extends js.Object

@react object TabPane extends ExternalComponent {

  case class Props(eventKey: Option[js.Any] = None,
                   animation: Option[Boolean] = None,
                   bsClass: Option[String] = None,
                   onEnter: Option[() => Unit] = None,
                   onEntering: Option[() => Unit] = None,
                   onEntered: Option[() => Unit] = None,
                   onExit: Option[() => Unit] = None,
                   onExiting: Option[() => Unit] = None,
                   onExited: Option[() => Unit] = None,
                   mouseOnEnter: Option[Boolean] = None,
                   unmountOnExit: Option[Boolean] = None)

  override val component = ReactTabPane
}