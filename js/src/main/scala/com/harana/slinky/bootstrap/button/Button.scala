package com.harana.slinky.bootstrap.button

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Button", "Button")
@js.native
object ReactButton extends js.Object

@react object Button extends ExternalComponent {

  case class Props(active: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   block: Option[Boolean] = None,
                   onClick: Option[() => Unit] = None,
                   componentClass: Option[String] = None,
                   href: Option[String] = None,
                   `type`: Option[String] = None,
                   bsStyle: Option[String] = None,
                   bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactButton
}