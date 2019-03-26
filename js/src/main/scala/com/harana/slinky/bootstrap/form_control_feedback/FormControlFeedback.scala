package com.harana.slinky.bootstrap.form_control_feedback

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/FormControlFeedback", JSImport.Default)
@js.native
object ReactFormControlFeedback extends js.Object

@react object FormControlFeedback extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactFormControlFeedback
}