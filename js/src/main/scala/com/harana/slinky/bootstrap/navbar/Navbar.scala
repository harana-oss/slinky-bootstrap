package com.harana.slinky.bootstrap.navbar

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Navbar", "Navbar")
@js.native
object ReactNavbar extends js.Object

@react object Navbar extends ExternalComponent {

  case class Props(fixedTop: Option[Boolean] = None,
                   fixedBottom: Option[Boolean] = None,
                   staticTop: Option[Boolean] = None,
                   inverse: Option[Boolean] = None,
                   fluid: Option[Boolean] = None,
                   componentClass: Option[String] = None,
                   onToggle: Option[Boolean => Unit] = None,
                   onSelect: Option[(js.Any, SyntheticMouseEvent) => Unit] = None,
                   collapseOnSelect: Option[Boolean] = None,
                   expanded: Option[Boolean] = None,
                   role: Option[String] = None,
                   bsStyle: Option[String] = None)

  override val component = ReactNavbar
}