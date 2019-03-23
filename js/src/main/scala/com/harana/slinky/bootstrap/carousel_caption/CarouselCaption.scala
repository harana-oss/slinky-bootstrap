package com.harana.slinky.bootstrap.carousel_caption

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/CarouselItem", "CarouselItem")
@js.native
object ReactCarouselCaption extends js.Object

@react object CarouselCaption extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactCarouselCaption
}