package com.harana.slinky.bootstrap.media_body

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/MediaBody", JSImport.Default)
@js.native
object ReactMediaBody extends js.Object

@react object MediaBody extends ExternalComponent {

  case class Props(align: Option[String] = None,
                   componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMediaBody
}