package com.harana.slinky.bootstrap.tab_container

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/TabContainer", "TabContainer")
@js.native
object ReactTabContainer extends js.Object

@react object TabContainer extends ExternalComponent {

  case class Props(id: Option[String] = None,
                   generateChildId: Option[(js.Any, String) => String] = None,
                   onSelect: Option[js.Any => Unit] = None,
                   activeKey: Option[js.Any] = None)

  override val component = ReactTabContainer
}