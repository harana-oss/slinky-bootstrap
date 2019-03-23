package com.harana.slinky.bootstrap.toggle_button

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/ToggleButton", "ToggleButton")
@js.native
object ReactToggleButton extends js.Object

@react object ToggleButton extends ExternalComponent {

  case class Props(`type`: Option[String] = None,
                   name: Option[String] = None,
                   checked: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   onChange: Option[() => Unit] = None,
                   value: Option[js.Any] = None)

  override val component = ReactToggleButton
}