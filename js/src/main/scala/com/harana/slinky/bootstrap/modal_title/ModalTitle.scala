package com.harana.slinky.bootstrap.modal_title

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ModalTitle", "ModalTitle")
@js.native
object ReactModalTitle extends js.Object

@react object ModalTitle extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModalTitle
}