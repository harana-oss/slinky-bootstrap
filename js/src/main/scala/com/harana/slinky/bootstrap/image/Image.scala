package com.harana.slinky.bootstrap.image

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Image", JSImport.Default)
@js.native
object ReactImage extends js.Object

@react object Image extends ExternalComponent {

  case class Props(responsive: Option[Boolean] = None,
                   rounded: Option[Boolean] = None,
                   circle: Option[Boolean] = None,
                   thumbnail: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactImage
}