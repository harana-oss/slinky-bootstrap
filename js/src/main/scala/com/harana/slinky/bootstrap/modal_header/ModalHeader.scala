package com.harana.slinky.bootstrap.modal_header

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ModalHeader", "ModalHeader")
@js.native
object ReactModalHeader extends js.Object

@react object ModalHeader extends ExternalComponent {

  case class Props(closeLabel: Option[String] = None,
                   closeButton: Option[Boolean] = None,
                   onHide: Option[() => Unit] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModalHeader
}