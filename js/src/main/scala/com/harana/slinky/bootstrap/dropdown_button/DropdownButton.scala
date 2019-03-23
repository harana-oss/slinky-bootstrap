package com.harana.slinky.bootstrap.dropdown_button

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/DropdownButton", "DropdownButton")
@js.native
object ReactDropdownButton extends js.Object

@react object DropdownButton extends ExternalComponent {

  case class Props(bsStyle: Option[String] = None,
                   bsSize: Option[String] = None,
                   title: ReactNode,
                   noCaret: Option[Boolean] = None)

  override val component = ReactDropdownButton
}