package com.harana.slinky.bootstrap.nav_item

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/NavItem", "NavItem")
@js.native
object ReactNavItem extends js.Object

@react object NavItem extends ExternalComponent {

  case class Props(active: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   role: Option[String] = None,
                   href: Option[String] = None,
                   onClick: Option[() => Unit] = None,
                   onSelect: Option[() => Unit] = None,
                   eventKey: Option[js.Any] = None)

  override val component = ReactNavItem
}