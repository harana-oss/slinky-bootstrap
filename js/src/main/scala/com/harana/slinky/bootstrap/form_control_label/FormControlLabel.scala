package com.harana.slinky.bootstrap.form_control_label

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/FormControlLabel", "FormControlLabel")
@js.native
object ReactFormControlLabel extends js.Object

@react object FormControlLabel extends ExternalComponent {

  case class Props(htmlFor: Option[String] = None,
                   srOnly: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactFormControlLabel
}