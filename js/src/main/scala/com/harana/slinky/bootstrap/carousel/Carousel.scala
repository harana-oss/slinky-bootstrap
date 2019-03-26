package com.harana.slinky.bootstrap.carousel

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Carousel", JSImport.Default)
@js.native
object ReactCarousel extends js.Object

@react object Carousel extends ExternalComponent {

  case class Props(slide: Option[Boolean] = None,
                   indicators: Option[Boolean] = None,
                   interval: Option[Int] = None,
                   controls: Option[Boolean] = None,
                   pauseOnHover: Option[Boolean] = None,
                   wrap: Option[Boolean] = None,
                   onSelect: Option[(js.Any, Option[js.Object]) => js.Any] = None,
                   onSlideEnd: Option[() => Unit] = None,
                   activeIndex: Option[Int] = None,
                   defaultActiveIndex: Option[Int] = None,
                   direction: Option[String] = None,
                   prevIcon: Option[ReactNode] = None,
                   prevLabel: Option[String] = None,
                   nextIcon: Option[ReactNode] = None,
                   nextLabel: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactCarousel
}