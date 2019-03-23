package com.harana.slinky.bootstrap.modal_footer

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/ModalFooter", "ModalFooter")
@js.native
object ReactModalFooter extends js.Object

@react object ModalFooter extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModalFooter
}