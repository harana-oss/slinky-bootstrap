package com.harana.slinky.bootstrap.input_group_button

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/InputGroupButton", JSImport.Default)
@js.native
object ReactInputGroupButton extends js.Object

@react object InputGroupButton extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactInputGroupButton
}