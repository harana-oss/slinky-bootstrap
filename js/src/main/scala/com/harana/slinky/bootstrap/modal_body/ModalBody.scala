package com.harana.slinky.bootstrap.modal_body

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ModalBody", "ModalBody")
@js.native
object ReactModalBody extends js.Object

@react object ModalBody extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModalBody
}