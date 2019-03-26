package com.harana.slinky.bootstrap.media_right

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/MediaRight", JSImport.Default)
@js.native
object ReactMediaRight extends js.Object

@react object MediaRight extends ExternalComponent {

  case class Props(align: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMediaRight
}