package com.harana.slinky.bootstrap.overlay

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Overlay", "Overlay")
@js.native
object ReactOverlay extends js.Object

@react object Overlay extends ExternalComponent {

  case class Props(show: Option[Boolean] = None,
                   rootClose: Option[Boolean] = None,
                   onHide: Option[() => Unit] = None,
                   animation: Option[Boolean] = None,
                   onEnter: Option[() => Unit] = None,
                   onEntering: Option[() => Unit] = None,
                   onEntered: Option[() => Unit] = None,
                   onExit: Option[() => Unit] = None,
                   onExiting: Option[() => Unit] = None,
                   placement: Option[String] = None)

  override val component = ReactOverlay
}