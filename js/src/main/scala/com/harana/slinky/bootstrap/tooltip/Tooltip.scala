package com.harana.slinky.bootstrap.tooltip

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/lib/Tooltip", JSImport.Default)
@js.native
object ReactTooltip extends js.Object

@react object Tooltip extends ExternalComponent {

  case class Props(id: String | Int,
                   placement: Option[String] = None,
                   positionTop: Option[Int | String] = None,
                   positionLeft: Option[Int | String] = None,
                   arrowOffsetTop: Option[Int | String] = None,
                   arrowOffsetLeft: Option[Int | String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactTooltip
}