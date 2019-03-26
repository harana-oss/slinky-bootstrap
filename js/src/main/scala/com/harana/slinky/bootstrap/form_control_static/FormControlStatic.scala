package com.harana.slinky.bootstrap.form_control_static

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/FormControlStatic", JSImport.Default)
@js.native
object ReactFormControlStatic extends js.Object

@react object FormControlStatic extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactFormControlStatic
}