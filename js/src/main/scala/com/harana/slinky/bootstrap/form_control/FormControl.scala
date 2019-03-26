package com.harana.slinky.bootstrap.form_control

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/FormControl", JSImport.Default)
@js.native
object ReactFormControl extends js.Object

@react object FormControl extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   `type`: Option[String] = None,
                   id: Option[String] = None,
                   bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactFormControl
}