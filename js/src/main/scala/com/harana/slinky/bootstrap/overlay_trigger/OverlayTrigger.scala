package com.harana.slinky.bootstrap.overlay_trigger

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/OverlayTrigger", "OverlayTrigger")
@js.native
object ReactOverlayTrigger extends js.Object

@react object OverlayTrigger extends ExternalComponent {

  case class Props(trigger: Option[String] = None,
                   delay: Option[Int] = None,
                   delayShow: Option[Int] = None,
                   delayHide: Option[Int] = None,
                   delayOverlayShown: Option[Boolean] = None,
                   overlay: ReactNode)

  override val component = ReactOverlayTrigger
}