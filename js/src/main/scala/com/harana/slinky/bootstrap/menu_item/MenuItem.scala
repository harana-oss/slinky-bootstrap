package com.harana.slinky.bootstrap.menu_item

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/MenuItem", JSImport.Default)
@js.native
object ReactMenuItem extends js.Object

@react object MenuItem extends ExternalComponent {

  case class Props(active: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   divider: Option[Boolean] = None,
                   eventKey: Option[js.Any] = None,
                   header: Option[Boolean] = None,
                   href: Option[String] = None,
                   onClick: Option[() => Unit] = None,
                   onSelect: Option[(js.Any, js.Object) => js.Any] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMenuItem
}