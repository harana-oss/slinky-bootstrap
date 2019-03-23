package com.harana.slinky.bootstrap.media_left

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/MediaLeft", "MediaLeft")
@js.native
object ReactMediaLeft extends js.Object

@react object MediaLeft extends ExternalComponent {

  case class Props(align: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMediaLeft
}