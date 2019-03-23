package com.harana.slinky.bootstrap.split_button

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/DropdownButton", "DropdownButton")
@js.native
object ReactSplitButton extends js.Object

@react object SplitButton extends ExternalComponent {

  case class Props(bsStyle: Option[String] = None,
                   bsSize: Option[String] = None,
                   href: Option[String] = None,
                   onClick: Option[() => Unit] = None,
                   title: ReactNode,
                   toggleLabel: Option[String] = None)

  override val component = ReactSplitButton
}