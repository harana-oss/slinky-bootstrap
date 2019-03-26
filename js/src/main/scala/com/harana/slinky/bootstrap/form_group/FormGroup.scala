package com.harana.slinky.bootstrap.form_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/FormGroup", JSImport.Default)
@js.native
object ReactFormGroup extends js.Object

@react object FormGroup extends ExternalComponent {

  case class Props(controlId: Option[String] = None,
                   validationState: Option[String] = None,
                   bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactFormGroup
}