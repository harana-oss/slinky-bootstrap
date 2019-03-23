package com.harana.slinky.bootstrap.toggle_button_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ToggleButtonGroup", "ToggleButtonGroup")
@js.native
object ReactToggleButtonGroup extends js.Object

@react object ToggleButtonGroup extends ExternalComponent {

  case class Props(name: Option[String] = None,
                   value: Option[js.Any] = None,
                   onChange: Option[() => Unit] = None,
                   `type`: Option[String] = None)

  override val component = ReactToggleButtonGroup
}