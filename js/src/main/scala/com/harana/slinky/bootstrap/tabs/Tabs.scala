package com.harana.slinky.bootstrap.tabs

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/lib/Tabs", "Tabs")
@js.native
object ReactTabs extends js.Object

@react object Tabs extends ExternalComponent {

  case class Props(activeKey: Option[js.Any] = None,
                   bsStyle: Option[String] = None,
                   animation: Option[Boolean] = None,
                   id: Option[Int | String] = None,
                   onSelect: Option[(js.Any, js.Object) => Unit] = None,
                   mountOnEnter: Option[Boolean] = None,
                   unmountOnExit: Option[Boolean] = None)

  override val component = ReactTabs
}