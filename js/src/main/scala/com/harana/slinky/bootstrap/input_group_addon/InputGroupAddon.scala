package com.harana.slinky.bootstrap.input_group_addon

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/InputGroupAddon", "InputGroupAddon")
@js.native
object ReactInputGroupAddon extends js.Object

@react object InputGroupAddon extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactInputGroupAddon
}