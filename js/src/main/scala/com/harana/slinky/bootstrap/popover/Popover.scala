package com.harana.slinky.bootstrap.popover

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/lib/PanelGroup", "PanelGroup")
@js.native
object ReactPanelGroup extends js.Object

@react object PanelGroup extends ExternalComponent {

  case class Props(id: String,
                   placement: Option[String] = None,
                   positionTop: Option[Int | String] = None,
                   positionLeft: Option[Int | String] = None,
                   arrowOffsetTop: Option[Int | String] = None,
                   arrowOffsetLeft: Option[Int | String] = None,
                   title: Option[ReactNode] = None,
                   bsClass: Option[String] = None)

  override val component = ReactPanelGroup
}