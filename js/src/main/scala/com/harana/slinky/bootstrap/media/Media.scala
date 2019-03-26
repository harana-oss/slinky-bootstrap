package com.harana.slinky.bootstrap.media

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Media", JSImport.Default)
@js.native
object ReactMedia extends js.Object

@react object Media extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactMedia
}