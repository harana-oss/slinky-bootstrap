package com.harana.slinky.bootstrap.dropdown_menu

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/DropdownButton", "DropdownButton")
@js.native
object ReactDropdownButton extends js.Object

@react object DropdownButton extends ExternalComponent {

  case class Props(open: Option[Boolean] = None,
                   pullRight: Option[Boolean] = None,
                   onClose: Option[() => Unit] = None,
                   labelledBy: Option[Int | String] = None,
                   onSelect: Option[() => Unit] = None,
                   rootCloseEvent: Option[String] = None)

  override val component = ReactDropdownButton
}