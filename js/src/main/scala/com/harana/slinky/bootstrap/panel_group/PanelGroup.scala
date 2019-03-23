package com.harana.slinky.bootstrap.panel_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/PanelGroup", "PanelGroup")
@js.native
object ReactPanelGroup extends js.Object

@react object PanelGroup extends ExternalComponent {

  case class Props(accordion: Option[Boolean] = None,
                   activeKey: Option[js.Any] = None,
                   onSelect: Option[js.Any => Unit] = None,
                   role: Option[String] = None,
                   generateChildId: Option[(js.Any, String) => String] = None,
                   id: Option[String] = None)

  override val component = ReactPanelGroup
}