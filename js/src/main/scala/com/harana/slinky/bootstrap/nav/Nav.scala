package com.harana.slinky.bootstrap.nav

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import typings.reactLib.reactMod.ReactNs.SyntheticEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Nav", "Nav")
@js.native
object ReactNav extends js.Object

@react object Nav extends ExternalComponent {

  case class Props(activeKey: Option[js.Any] = None,
                   activeHref: Option[String] = None,
                   stacked: Option[Boolean] = None,
                   justified: Option[Boolean] = None,
                   onSelect: Option[(js.Any, SyntheticEvent[_,_]) => Unit] = None,
                   role: Option[String] = None,
                   navbar: Option[Boolean] = None,
                   pullRight: Option[Boolean] = None,
                   pullLeft: Option[Boolean] = None,
                   bsStyle: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactNav
}