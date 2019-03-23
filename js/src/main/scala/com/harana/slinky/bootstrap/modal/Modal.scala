package com.harana.slinky.bootstrap.modal

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Modal", "Modal")
@js.native
object ReactModal extends js.Object

@react object Modal extends ExternalComponent {

  case class Props(backdrop: Option[String] = None,
                   backdropClassName: Option[js.Any] = None,
                   keyboard: Option[Boolean] = None,
                   animation: Option[Boolean] = None,
                   dialogComponentClass: Option[String] = None,
                   autoFocus: Option[Boolean] = None,
                   enforceFocus: Option[Boolean] = None,
                   restoreFocus: Option[Boolean] = None,
                   show: Option[Boolean] = None,
                   onHide: Option[() => Unit] = None,
                   onEnter: Option[() => Unit] = None,
                   onEntering: Option[() => Unit] = None,
                   onEntered: Option[() => Unit] = None,
                   onExit: Option[() => Unit] = None,
                   onExiting: Option[() => Unit] = None,
                   onExited: Option[() => Unit] = None,
                   bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModal
}