package com.harana.slinky.bootstrap.thumbnail

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Image", "Image")
@js.native
object ReactImage extends js.Object

@react object Image extends ExternalComponent {

  case class Props(src: Option[String] = None,
                   alt: Option[String] = None,
                   href: Option[String] = None,
                   onError: Option[() => Unit] = None,
                   onLoad: Option[() => Unit] = None,
                   bsClass: Option[String] = None)

  override val component = ReactImage
}