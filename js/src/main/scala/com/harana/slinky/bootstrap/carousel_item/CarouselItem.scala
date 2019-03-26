package com.harana.slinky.bootstrap.carousel_item

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/CarouselItem", JSImport.Default)
@js.native
object ReactCarouselItem extends js.Object

@react object CarouselItem extends ExternalComponent {

  case class Props(direction: Option[String] = None,
                   onAnimateOutEnd: Option[() => Unit] = None,
                   active: Option[Boolean] = None,
                   animateIn: Option[Boolean] = None,
                   animateOut: Option[Boolean] = None,
                   index: Option[Int] = None)

  override val component = ReactCarouselItem
}