package com.harana.slinky.bootstrap.checkbox

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Checkbox", "Checkbox")
@js.native
object ReactCheckbox extends js.Object

@react object Checkbox extends ExternalComponent {

  case class Props(inline: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   title: Option[String] = None,
                   validationState: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactCheckbox
}