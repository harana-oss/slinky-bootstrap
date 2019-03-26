package com.harana.slinky.bootstrap.modal_dialog

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ModalDialog", JSImport.Default)
@js.native
object ReactModalDialog extends js.Object

@react object ModalDialog extends ExternalComponent {

  case class Props(dialogClassName: Option[String] = None,
                   bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactModalDialog
}